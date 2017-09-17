package petclinic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver=null;
	
	@BeforeSuite(alwaysRun = true)
	public void initialize(){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Test
	public void testMethod() {
		driver.get("http://18.194.36.139:8080/petclinic/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("PetClinic :: a Spring Framework demonstration", driver.getTitle());
	}
	
	@AfterSuite
	public void clear(){
		driver.close();
	}
	
}

