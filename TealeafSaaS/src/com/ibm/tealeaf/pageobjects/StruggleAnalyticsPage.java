/**
 *  
 */
package com.ibm.tealeaf.pageobjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ibm.tealeaf.commons.TeaLeafCONSTANTS;
import com.ibm.tealeaf.pageobjects.base.BasePage;

/**
 * @author ManjushaSaju
 * 
 */
public class StruggleAnalyticsPage extends BasePage{

	 
	private static Logger logger = Logger
			.getLogger(StruggleAnalyticsPage.class);

	public StruggleAnalyticsPage() {
		logger.info("default constructor called");

	}
	public StruggleAnalyticsPage(WebDriver driver) {
		super(driver);

	}

	                  
	@FindBy(xpath = "//span[contains(@title,'Struggle Analytics')]")
	//@FindBy(xpath = "//span[@class='name struggles struggles-click']")
	WebElement struggleanalytics;

	public void clickStrugAnalytics() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, TeaLeafCONSTANTS.WAITTIME10SEC);
		wait.until(ExpectedConditions.textToBePresentInElement(struggleanalytics, "Struggle Analytics"));
		logger.info("Entering clickStrugAnalytics");
		
		
		try {
			struggleanalytics.click();
		} catch (WebDriverException e) {
			Assert.fail("struggleanalytics click fail");
		}
		logger.info("Exiting clickStrugAnalytics  clicked");
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);
		//return PageFactory.initElements(driver, StruggleAnalyticsPage.class);
		 
	}

	// Method to call StruggleAnalytics->Registration
	@FindBy(xpath = "//label[contains(.,'Registration')]")
	WebElement reglabel;

	public void registration() throws InterruptedException {
		logger.info("Entering Registration struggle report");
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);

		try {
			reglabel.click();
		} catch (WebDriverException e) {
			Assert.fail("No such element");
		}

		logger.info("Exiting Registration struggle report");
	}

	/**
	 * Method to call StruggleAnalytics->Shopping cart
	 * 
	 * @throws InterruptedException
	 */

	@FindBy(xpath = "//label[contains(.,'Shopping cart')]")
	WebElement shoppingcartlabel;

	public void shoppingCart() throws InterruptedException {

		logger.info("Entering Shopping cart struggle report yet to click");
		WebDriverWait wait = new WebDriverWait(driver, TeaLeafCONSTANTS.WAITTIME60SEC);
		wait.until(ExpectedConditions.textToBePresentInElement(
				shoppingcartlabel, "Shopping cart"));
		
		shoppingcartlabel.click();
		logger.info("Exiting Shopping cart struggle report clicked");
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);

		
	}

	/**
	 * Method to call StruggleAnalytics->Checkout
	 * 
	 * @throws InterruptedException
	 */
	@FindBy(xpath = ("//label[contains(.,'Checkout')]"))
	WebElement checkoutlabel;

	public void checkOut() throws InterruptedException {

		logger.info("Entering Checkout struggle report");
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);
		checkoutlabel.click();
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);
		logger.info("Exiting Checkout struggle report");
	}

	/**
	 * Method to call StruggleAnalytics->BannerLandingPage
	 * 
	 * @throws InterruptedException
	 */
	@FindBy(xpath = ("//label[contains(.,'Banner Landing Page')]"))
	WebElement bannerlabel;

	public void bannerLandingPage() throws InterruptedException {
		logger.info("Enter Banner landing page report");
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME20000MILLISEC);
		bannerlabel.click();
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);
		logger.info("In Banner landing page report");
	}

	/**
	 * Navigating back to StruggleAnalytics view
	 * 
	 * @throws InterruptedException
	 */
	@FindBy(xpath = ("//a[contains(@href,'/struggle-analytics')and contains(@ui-sref,'struggles({})')]"))
	WebElement menustruggle;

	public void backToStruggleAnalytics() throws InterruptedException {
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME10000MILLISEC);
		logger.info("Navigating back to Struggle Analytics ");
		 driver.manage().timeouts()
		 .implicitlyWait(TeaLeafCONSTANTS.WAITTIME60SEC, TimeUnit.SECONDS);
		 
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(menustruggle).click(menustruggle);
		builder2.perform();
		logger.info("Successfully navigated back to Struggle Analytics ");
		Thread.sleep(TeaLeafCONSTANTS.WAITTIME20000MILLISEC);
	}

}
