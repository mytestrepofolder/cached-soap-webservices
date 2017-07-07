package nl.webservices.www.client;

/**
 * @Author: Plabon Kakoti
 * @Date: 22/04/2017
 */

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceFactory;

import nl.webservices.www.soap.Car;
import nl.webservices.www.soap.CarRDWCarDataRequestType;
import nl.webservices.www.soap.CarRDWCarDataResponseType;
import nl.webservices.www.soap.WebservicesNlBindingStub;
import org.apache.axis.AxisFault;
import org.apache.axis.AxisProperties;
import org.apache.axis.message.SOAPHeaderElement;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class CarInfoWebservicesClient {

	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private static final String NAMESPACE = "http://www.webservices.nl/";
	private static final String SERVICENAME = "carRDWCarData";

	private static LoadingCache<List<String>, List<Car>> carCache;

	// Cache the object for 10 minutes.
	static {
		carCache = CacheBuilder.newBuilder().maximumSize(100).expireAfterWrite(10, TimeUnit.MINUTES)
				.build(new CacheLoader<List<String>, List<Car>>() {
					public List<Car> load(List<String> licensePlates) throws Exception {
						return getCarsDueApk(licensePlates);
					}
				});
	}

	// Returns the cached object, if empty then guava call the getCArsDueApk();
	public static LoadingCache<List<String>, List<Car>> getLoadingCache() {
		return carCache;
	}

	public static List<Car> getCarsDueApk(List<String> licensePlateNumbers) {

		WebservicesNlBindingStub myservice;
		List<Car> carList = new ArrayList<Car>();
		String remoteHost = "ws1.webservices.nl";
		String UrlString = "https://" + remoteHost + "/soap_doclit";
		Car car = null;
		try {
			for (String licensePlate : licensePlateNumbers) {
				URL wsdlUrl = new URL(UrlString);
				ServiceFactory serviceFactory = ServiceFactory.newInstance();
				Service rpcService = serviceFactory.createService(new QName(NAMESPACE, SERVICENAME));
				myservice = new WebservicesNlBindingStub(wsdlUrl, rpcService);
				
				CarRDWCarDataRequestType carDataRequestType = new CarRDWCarDataRequestType();
				carDataRequestType.setLicense_plate(licensePlate);
				
				SOAPHeaderElement sopElement = new SOAPHeaderElement("soap:HeaderLogin", "HeaderLogin");
				sopElement.addChildElement("userName").addTextNode(USERNAME);
				sopElement.addChildElement("password").addTextNode(PASSWORD);
				
				myservice.setHeader(sopElement);
				CarRDWCarDataResponseType carDataResponseType = null;
				// Webservice Call
				try {
					carDataResponseType = getCarData(myservice, licensePlate);
				} catch (AxisFault e) {
					System.out.println(System.lineSeparator());
					System.out.println("No data for car with Licence number " + licensePlate
							+ " found. The Exception returned is  = '" + e.getFaultReason() + "'");
				}
				if (carDataResponseType != null) {
					carList = getListofCarsWithAPQDue(carDataResponseType, car);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carList;
	}

	private static List<Car> getListofCarsWithAPQDue(CarRDWCarDataResponseType carDataResponseType, Car car) {
		String apkDueDate = carDataResponseType.getOut().getApk_due_date();
		List<Car> carList = new ArrayList<Car>();
		LocalDate currentDate = LocalDate.now();
		LocalDate formattedApkDate = null;
		if (apkDueDate.equals("00000000") || apkDueDate == null || apkDueDate.isEmpty()) {
			System.out.println(System.lineSeparator());
			System.out.println("Invalid Date String for car with license Plate "
					+ carDataResponseType.getOut().getLicense_plate());
			System.out.println(System.lineSeparator());
		} else {
			formattedApkDate = LocalDate.parse(apkDueDate, DateTimeFormatter.BASIC_ISO_DATE);

			if (currentDate.isAfter(formattedApkDate)) {// Check if the apk due
														// date has expired for
														// this car
				if (carDataResponseType != null) {
					car = new Car();
					car.setLicense_plate(carDataResponseType.getOut().getLicense_plate());
					car.setBrand(carDataResponseType.getOut().getBrand());
					car.setModel(carDataResponseType.getOut().getModel());
					car.setColors(carDataResponseType.getOut().getColors());
					car.setGross_vehicle_mass(carDataResponseType.getOut().getGross_vehicle_mass());
					car.setFuel_type(carDataResponseType.getOut().getFuel_type());
					car.setStanding_room(carDataResponseType.getOut().getStanding_room());
					carList.add(car);
					// carList.add(car);
				}
			}
		}
		return carList;
	}

	// Method calling the carRDWCarData() webservice.
	public static CarRDWCarDataResponseType getCarData(WebservicesNlBindingStub myservice, String licensePlate)
			throws RemoteException {
		CarRDWCarDataRequestType carDataRequestType = new CarRDWCarDataRequestType();
		carDataRequestType.setLicense_plate(licensePlate);
		return myservice.carRDWCarData(carDataRequestType);
	}

}