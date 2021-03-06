package com.ibm.tealeaf.login;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortalLogin   {

	private WebDriver driver;
	private static Logger logger = Logger.getLogger(PortalLogin.class);

	public PortalLogin() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Software\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void main(String[] args) throws Exception {

		WebDriver driver = null;
		PortalLogin l = new PortalLogin();
 		l.login();

	}

	public void login() throws Exception {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://adfs.connectedplant.honeywell.com/adfs/ls?version=1.0&action=signin&realm=urn%3AAppProxy%3Acom&appRealm=3312a585-7537-e811-a94e-000d3a190baa&returnUrl=https%3A%2F%2Fpsaqa.psademo.useast.connectedplant.honeywell.com%2FMES%2FLandingPage.aspx&client-request-id=07D6FD45-D3F1-0001-C88E-F107F1D3D301");
driver.get("https://www.google.com");

		driver.findElement(By.id("j_username")).sendKeys(
				"manjushasaju@in.ibm.com");
		driver.findElement(By.id("j_password")).sendKeys("hari123$");
		driver.findElement(By.className("submit")).click();
		logger.info("Struggle Analytics Page View step 1");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement struggle = driver.findElement(By
				.xpath("//span[contains(@title,'Struggle analytics')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 00);
		logger.info("Struggle Analytics Page View step 2");
		wait.until(ExpectedConditions.textToBePresentInElement(struggle,
				"Struggle analytics"));
		logger.info("Struggle Analytics Page View step 3");
		struggle.click();

		// driver.findElement(By.xpath("//button[contains(@ng-click,'selectPageView()')]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement reglabel = driver.findElement(By
				.xpath("//label[contains(.,'Registration')]"));
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		Thread.sleep(5000);
		reglabel.click();
		logger.info("In Registration struggle report");
		/*
		 * List<WebElement>
		 * elements=driver.findElements(By.xpath("//*[@id='id58dca7dfb5f616ba']"
		 * )); WebElement toolTip =
		 * driver.findElement(By.xpath("//*[contains(@id,'nv-path-')]"));
		 * logger.info("Dual Axis chart"); for (WebElement el: elements) {
		 * el.click(); // String chartValue // logger.info(chartValue); }
		 */

		WebElement menustruggle1 = driver
				.findElement(By
						.xpath("//a[contains(@href,'/struggle-analytics')and contains(@ui-sref,'struggles({})')]"));
		Thread.sleep(5000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(menustruggle1).click(menustruggle1);
		builder1.perform();
		logger.info("Successfully navigated back to Struggle Analytics from Registration");
		Thread.sleep(5000);
		WebElement shoppingcartlabel = driver.findElement(By
				.xpath("//label[contains(.,'Shopping cart')]"));
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		shoppingcartlabel.click();
		logger.info("In Shopping cart struggle report");

		WebElement menustruggle2 = driver
				.findElement(By
						.xpath("//a[contains(@href,'/struggle-analytics')and contains(@ui-sref,'struggles({})')]"));
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		Actions builder2 = new Actions(driver);
		builder2.moveToElement(menustruggle2).click(menustruggle2);
		builder2.perform();
		logger.info("Successfully navigated back to Struggle Analytics from Shopping cart");
		Thread.sleep(5000);
		WebElement checkoutlabel = driver.findElement(By
				.xpath("//label[contains(.,'Checkout')]"));
		Thread.sleep(5000);
		checkoutlabel.click();
		logger.info("In Checkout struggle report");

		WebElement menustruggle3 = driver
				.findElement(By
						.xpath("//a[contains(@href,'/struggle-analytics')and contains(@ui-sref,'struggles({})')]"));
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(4160, TimeUnit.SECONDS);
		Actions builder3 = new Actions(driver);
		builder3.moveToElement(menustruggle3).click(menustruggle3);
		builder3.perform();

		logger.info("Successfully navigated back to Struggle Analytics from Checkout");
		Thread.sleep(5000);
		WebElement bannerlabel = driver.findElement(By
				.xpath("//label[contains(.,'Banner Landing Page')]"));
		driver.manage().timeouts().implicitlyWait(4160, TimeUnit.SECONDS);

		Thread.sleep(5000);
		bannerlabel.click();
		logger.info("In Banner landing page report");

		WebElement menustruggle4 = driver
				.findElement(By
						.xpath("//a[contains(@href,'/struggle-analytics')and contains(@ui-sref,'struggles({})')]"));
		driver.manage().timeouts().implicitlyWait(5160, TimeUnit.SECONDS);
		Thread.sleep(5000);

		Actions builder4 = new Actions(driver);
		builder4.moveToElement(menustruggle4).click(menustruggle4);
		builder4.perform();
		logger.info("Successfully navigated back to Struggle Analytics from Banner landing page");

		driver.quit();

	}

}
