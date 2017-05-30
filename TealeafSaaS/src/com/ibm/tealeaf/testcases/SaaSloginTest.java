/**
 *  
 */
package com.ibm.tealeaf.testcases;

/**
 * @author Manjusha Saju
 *
 */

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;


import com.ibm.tealeaf.commons.TeaLeafCONSTANTS;
import com.ibm.tealeaf.pageobjects.LoginPage;
import com.ibm.tealeaf.testcases.base.SaaSBaseTest;
import com.ibm.tealeaf.utils.ExcelUtil;

public class SaaSloginTest extends SaaSBaseTest {

	private static Logger logger = Logger
			.getLogger(SaaSloginTest.class);

	public SaaSloginTest() {

		super();

	}

	@Test(priority = 1)
	public void verifyValidLogin() {

		logger.info("Entering verifyValidLogin");
 
		// Created page object using Page Factory
		LoginPage login_page = PageFactory
				.initElements(driver, LoginPage.class);
		
		
 	    // Call the method
		String userName = "";
		String password = "";
		try {

			ExcelUtil eu = new ExcelUtil();

			eu.setExcelFile(TeaLeafCONSTANTS.LOGINXLSDATAPATH,
					TeaLeafCONSTANTS.LOGINXLSDATASHEETNAME);
			userName = eu.getCellData(1, 1);
			password = eu.getCellData(1, 2);
	 	} catch (Exception e) {
			Assert.fail("Unable to login");

			e.printStackTrace();
		}
	 	logger.info("Exiting verifyValidLogin");
		login_page.login_tealeafSaaS(userName, password);
	}
	@BeforeClass
	protected void setUpBeforeTestClass(){
	    // initialize a browser driver, connect to servers
	  }
	@BeforeMethod
	  protected  void setUpBeforeTestMethod() {
	    // initialize testPage
	    // login to the app, if necessary
	  }
	@AfterMethod
	  protected  void tearDownAfterTestMethod() {
	    // logout of the app, if necessary
	  }

	@AfterClass
	  protected  void  tearDownAfterTestClass() {
	    // close connections, close browser as needed
	  }

}
