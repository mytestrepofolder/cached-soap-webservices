package nl.webservices.www.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.cache.LoadingCache;

import nl.webservices.www.client.CarInfoWebservicesClient;
import nl.webservices.www.soap.Car;

/**
 * @Author: Plabon Kakoti
 * @Date: 22/04/2017
 */


public class ComapanyCarCache {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		ComapanyCarCache carCache = new ComapanyCarCache();
		List<String> carsLicensePlateNumbers = carCache.getCompanyCarsLicensePlate();
		System.out.println("----------Application fetches cars with expried APK Due Date---------- ");
		System.out.println(System.lineSeparator());
		List<Car> carDueApkList = null;
		try {
			carDueApkList = carCache.getCarsFromCache(carsLicensePlateNumbers);
			System.out.println("----------------------------------------------");
			System.out.println("Fetching cars using Webservices call.....");
			System.out.println("----------------------------------------------");
			carCache.printCars(carDueApkList);
			System.out.println("----------------------------------------------");
			System.out.println("Fetching from Cache........");
			System.out.println("----------------------------------------------");
			carDueApkList = carCache.getCarsFromCache(carsLicensePlateNumbers);
			carCache.printCars(carDueApkList);
			System.out.println("----------------------------------------------");
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void printCars(List<Car> carDueApkList) {

		if (!carDueApkList.isEmpty()) {
			System.out.println("List of Cars with expired APK date : ");
			carDueApkList.forEach((c -> {
				Car car = (Car) c;
				System.out.println(System.lineSeparator());
				System.out.println("Car Model :"+car.getModel());
				System.out.println("Car Brand :"+car.getBrand());
				System.out.println("License Plate Number :"+car.getLicense_plate());
				System.out.println("Car Color :"+car.getColors());
				System.out.println("Car Gross Vehicle Mass :"+car.getGross_vehicle_mass());
				System.out.println("Fuel Type :"+car.getFuel_type());
				System.out.println("Standing Room:"+car.getStanding_room());
			}));
		} else {
			System.out.println("There are no cars with expired APK date!");
		}
	}

	// Load the list of cars into a cache using Guava
	private List<Car> getCarsFromCache(List<String> carsLicensePlateNumbers) throws ExecutionException {
		LoadingCache<List<String>, List<Car>> carCache = CarInfoWebservicesClient.getLoadingCache();
		// System.out.println(empCache.stats());
		System.out.println("----------------------------------------------");
		System.out.println("Cache Size :" + carCache.size());
		System.out.println("----------------------------------------------");
		return carCache.get(carsLicensePlateNumbers);

	}

	// Getting the list of cars from the properties files.
	public List<String> getCompanyCarsLicensePlate() throws IOException {
		List<String> cars = new ArrayList<String>();
		try(Stream<String> lines = Files.lines(Paths.get("C:\\Git\\cached-soap-webservices\\src\\main\\resources\\carslist.properties"))){
			cars = lines.map(i -> i).collect(Collectors.toList());
			cars.stream().forEach(System.out::println);
		}
		return cars;

	}
}
