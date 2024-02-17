package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC01_Login extends OpentapsWrappers {

	@BeforeClass
	public void setData(){
		testCaseName="Login";
		testDescription="Login to OpenTaps and Logout";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider = "fetchData")
	public void loginOpentaps(String userName, String password){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickLogOut();		
	}
}
