Company Car Webservices App (Read ME)
=====================================================================

Tools Used:
•	1. Java (1.8.0_91)
•	2. Eclipse Neon
•	3. Maven
•	4. Google Guava API
•	5. Axis 1.4
•	6. Junit
•	7. Mockito

Solution Outline:
•	I have created the Java Stubs using Apache Axis.
•	This is simple Java Stand alone app which makes webervice calls to fetch Car details based on License Plate numbers.
•	The license plates details are fetched from a properties files. More license plates can be added to this list.
•	The details are fetched by call a webservices method carRDWCarData(). This method can be accessed by sending the UserName and Password details in the header of the request. 	
•	The fetched cars are checked for expired APQ date and if they have an expried  date then these cars are listed in to the user. 
•	If no cars with Expried APQ date found then a message is displayed to the user on console.
•	This application uses Axis web service framework to make the remote webservice calls.
•	I have used Guava API to cached the fetched results. During the first call the cache is empty, then the results are cached for 10 minutes for the subsequent calls.
•	I have used Maven for JAR dependencies
•	I have used Maven Shade plugin to  package the artifacts in an uber-jar, including its dependencies.  

Build and Run Instructions :

Using Command Prompt :
•	Download the Zip  (This already contains the executable JAR to be executed from the CMD!)
•	Extract the content into a directory on your machine. This should create a directory named 'company-car-webservices’
•	Change directory to path where Jar is located ‘root_dir’/company-car-webservices` cd $root_dir/ company-car-webservices`
•	Execute following maven command to create an executable jar `mvn clean package`. This command will create a jar with name like  “company-cars-0.0.1-SNAPSHOT.jar” in $root_dir/company-car-webservices/target directory
•	Finally, cd to target directory and execute the jar using this command `java -jar company-cars-0.0.1-SNAPSHOT.jar `


Build Using Eclipse :

•	If you are running the same from Eclipse then follow these steps to build and run: 
o	Install Maven plugin in your Eclipse if not there already.
o	Import the project as an Existing Maven Project
o	Build using Project -> Build Project
o	Then right click on the project -> Run As -> Maven Build. This will pop up the Run Configuration Screen.
o	Enter In Goals: clean install
o	Click on Run to package into a Jar.

