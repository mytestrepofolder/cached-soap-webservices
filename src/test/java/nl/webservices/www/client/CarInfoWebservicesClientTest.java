package nl.webservices.www.client;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;
import javax.xml.soap.SOAPException;
import org.apache.axis.message.SOAPHeaderElement;
import org.junit.Test;
import nl.webservices.www.soap.Car;
import nl.webservices.www.soap.CarRDWCarDataRequestType;
import nl.webservices.www.soap.CarRDWCarDataResponseType;
import nl.webservices.www.soap.WebservicesNlBindingStub;

public class CarInfoWebservicesClientTest {
	
		private static final String USERNAME = "solicitant_User";
		private static final String PASSWORD = "a1fefd74c35225f8eab80e2865dec014";
		private static final String NAMESPACE = "http://www.webservices.nl/";
		private static final String SERVICENAME = "carRDWCarData";
		
		@Test
	    public void testUsingMock() {
	    	
			Car car = new Car();
			car.setLicense_plate("1-SXS-51");
			car.setApk_due_date("20180104");
			car.setBrand("VOLKSWAGEN");
			WebservicesNlBindingStub myservice = mock(WebservicesNlBindingStub.class);
		  	ServiceFactory serviceFactory = mock(ServiceFactory.class);
		  	try {
			  	serviceFactory.createService(new QName(NAMESPACE, SERVICENAME));
			  	CarRDWCarDataRequestType carDataRequestType =  new CarRDWCarDataRequestType();
			  	CarRDWCarDataResponseType carDataResponseType = new CarRDWCarDataResponseType();
			  	carDataResponseType.setOut(car);
			  	//Add the SOAP header
			  	SOAPHeaderElement sopElement = new SOAPHeaderElement("soap:HeaderLogin", "HeaderLogin");
				sopElement.addChildElement("userName").addTextNode(USERNAME);
				sopElement.addChildElement("password").addTextNode(PASSWORD);
			  	carDataRequestType.setLicense_plate("1-SXS-51");
				when(myservice.carRDWCarData(carDataRequestType)).thenReturn(carDataResponseType);
				Car response = myservice.carRDWCarData(carDataRequestType).getOut();
		        assertEquals(car, response );
		        
		  	} catch (RemoteException e) {
		  		e.printStackTrace();
		  	} catch (SOAPException e) {
		  		e.printStackTrace();
		  	} catch (ServiceException e) {
		  		e.printStackTrace();
		  	}
		  	
	    }
		
		
}
