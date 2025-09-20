package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.HomePage;

public class BaseClass {
	
	WebDriver driver;
	public static HomePage home;
	
	
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void method() {
		home = new HomePage(driver);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
