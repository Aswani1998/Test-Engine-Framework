package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpPOM {
public WebDriver driver;
	
	private By signupbuttun = By.xpath("//a[@class='button secondary']");
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By usertitle = By.xpath("//select[@name='UserTitle']");
	private By selecttitle = By.xpath("//option[@value='IT_Manager_AP']");
	private By company=By.xpath("//input[@name='CompanyName']");

	private RemoteWebDriver driver1;
	
	
	
	public SignUpPOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement clicksignup() {
		return driver.findElement(signupbuttun);
	}

	public WebElement EnterfirstName() {
		return driver.findElement(firstName);
	}

	public WebElement EnterlastName() {
		return driver.findElement(lastName);
	}

	public WebElement Enteremail() {
		return driver.findElement(email);
	}

	
}



