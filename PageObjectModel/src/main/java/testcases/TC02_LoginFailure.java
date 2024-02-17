package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_LoginFailure extends OpentapsWrappers {	
	
	@BeforeClass
	public void setData(){
		testCaseName = "Login(negative)";
		testDescription = "Login to OpenTaps and Verify errors";
		browserName = "chrome";
		dataSheetName = "TC002";
		category = "Sanity";
		authors = "Gopi";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginOpentaps(String userName, String password, String msg){
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMsg(msg);		
	}
}
