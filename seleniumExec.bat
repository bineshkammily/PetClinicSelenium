set CLASSPATH=%CLASSPATH%;C:\Selenium\selenium-server-standalone-2.53.0.jar;C:\Selenium\testng-6.8.8.jar;.

javac petclinic\selenium\AppTest.java

java org.testng.TestNG testng.xml

echo "Selenium Execution completed successfully"
