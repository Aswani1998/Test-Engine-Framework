package Testcases;

import org.testng.annotations.Test;

import Pageobjectmodel.SignUpPOM;
import Resources.Baseclass;

public class VerifySighnup extends Baseclass {
	@ Test
	public void signup() throws InterruptedException {
		SignUpPOM obj=new SignUpPOM(driver);
		obj.clicksignup().click();
	
		Thread.sleep(7000);
		obj.EnterfirstName().sendKeys("Aswani");
		obj.EnterlastName().sendKeys("Prabha");
		obj.Enteremail().sendKeys("aswaniprabham@gmail.com");
		Thread.sleep(3000);
	
		
	}
}



