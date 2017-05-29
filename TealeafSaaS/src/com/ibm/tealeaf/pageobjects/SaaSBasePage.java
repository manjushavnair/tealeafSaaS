/**
 *  
 */
package com.ibm.tealeaf.pageobjects;

/**
 * @author Manjusha Saju
 *
 */

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import com.ibm.tealeaf.commons.BrowserFactory;
import com.ibm.tealeaf.commons.PropertyReader;
import com.ibm.tealeaf.commons.TeaLeafCONSTANTS;

public class SaaSBasePage implements BasePage {

	protected static WebDriver driver;
	private static Logger logger = Logger.getLogger(SaaSBasePage.class);

	protected static PropertyReader prpr;
	private WebDriverWait wait;

	public SaaSBasePage() {

		prpr = PropertyReader.readProperty();

		if (driver == null)
			driver = BrowserFactory.startBrowser(
					prpr.getProperty(TeaLeafCONSTANTS.BROWSER_TYPE),
					prpr.getProperty(TeaLeafCONSTANTS.APPLICATION_URL));

	}

	@AfterSuite
	public void testDown() {
		BrowserFactory.stopDriver();

	}

	public void click(final By by) {

	}

}