package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjectmodel.LoginpagePOM;
import Resources.Baseclass;

public class VerifyLogin extends Baseclass{
	@Test(dataProvider="demo")
    public void enterCredentials(String username, String password){
   	
		 LoginpagePOM obj= new LoginpagePOM (driver);
   	 obj.EnterUSername().sendKeys(username);
   	 obj.EnterPassword().sendKeys(password);
   	 obj.clickLogin().click();
		
   	 
	}
	
	
	@DataProvider
	public Object[][] demo(){
		
		Object[][] data=new Object[2][2];
		
		//correct username and password
		data[0][0]="test1";  
		data[0][1]="Secure123";
	
		
		
		//incorrect username and password
		data[1][0]="test2";
		data[1][1]="Secure456";
	
		return data;
		
		
	}
	
	

}



