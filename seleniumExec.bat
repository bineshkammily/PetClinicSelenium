javac petclinic\selenium\AppTest.java

set CLASSPATH=%CLASSPATH%;C:\Selenium\selenium-server-standalone-2.53.0.jar;C:\Selenium\testng-6.8.8.jar;.

java org.testng.TestNG testng.xml

echo "Selenium Execution completed successfully"
