package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepkg.BaseClass;

public class HomePage extends BaseClass {
WebDriver driver;
WebDriverWait wait;



@FindBy(xpath="/html/body/header/div[1]/div/div/a") WebElement mousehover;
@FindBy(xpath="/html/body/header/div[1]/div/div/ul/li[8]/a") WebElement district;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/div/div[1]/div/div/a")WebElement viewDet;
@FindBy(xpath="//input[@placeholder=\"Name\"]")WebElement name;
@FindBy(xpath="//input[@placeholder=\"Phone\"]")WebElement phno;
@FindBy(xpath="//input[@placeholder=\"Email\"]")WebElement email;
@FindBy(xpath="//textarea[@placeholder=\"Message\"]")WebElement sumary;
@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[1]/form/input")WebElement sendbtn;
@FindBy(xpath="/html/body/header/div[2]/div/a[1]/img")WebElement logo;


public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
}

public String TitleVerification() {
	return driver.getTitle();
	
}

public void findProperty() {
	Actions actions = new Actions(driver);
    actions.moveToElement(mousehover).perform();  // hover over element
    mousehover.click(); 
	district.click();
}

public boolean logoVerification() {
	return logo.isDisplayed();
}



public void clickViewDetails() {
    wait.until(ExpectedConditions.elementToBeClickable(viewDet)).click();
}

public void setName(String fname) {
	name.sendKeys(fname);
}

public void setPhno(String phn) {
	phno.sendKeys(phn);
}

public void setEmail(String mail) {
	email.sendKeys(mail);
}

public void setSummary(String text) {
	sumary.sendKeys(text);
}

public void submit() {
	sendbtn.click();
}






}
