package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
		public static WebDriver driver;

		public static WebDriver browserlaunch(String name) {
			if (name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driverr\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();

			} else if (name.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driverr\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
			return driver;
		}

		public static void navigateto(String url) {
			driver.navigate().to(url);

		}

		public static void geturl(String url) {
			driver.get(url);
		}

		public static void gettext(String text) {
			driver.switchTo().alert().getText();
			System.out.println(text);
		}

		public static void currenturl() {
			driver.getCurrentUrl();
		}

		public static void back() {
			driver.navigate().back();
		}

		public static void forward() {
			driver.navigate().forward();
		}

		public static void refresh() {
			driver.navigate().refresh();

		}

		public static void close() {
			driver.close();
		}

		public static void quit() {
			driver.quit();

		}

		public static void buttonClick(WebElement element) {
			element.click();
		}

		public static void inputkey(WebElement element, String text) {
			element.sendKeys(text);
		}

		public static void sleep(long sec) throws InterruptedException {
			Thread.sleep(sec);
		}

		public static void dropdown(WebElement element, String type,String input1) {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("text"))
				s.selectByVisibleText(input1);
			else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(input1);
			} else if (type.equalsIgnoreCase("index")) {
				int data =Integer.parseInt(input1);
				s.selectByIndex(data);
			}
		}	

		public static void alert(String type, String name) {
			if (type.equalsIgnoreCase("accept"))
				driver.switchTo().alert().accept();
			else if (type.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			} else if (type.equalsIgnoreCase("inputtext"))
				driver.switchTo().alert().sendKeys(name);
		}

		public static void screenshot() throws IOException {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date(0));
			FileUtils.copyFile(src, new File(
					"C:\\Users\\johns\\eclipse-workspace\\Maven_Project\\Screenshots\\" + " " + timestamp + ".png"));

		}

		public static void gettext(WebElement element) {

			String text = element.getText();

			System.out.println("Displayed text is :" + text);
		}

		public static void action(WebElement element, String type) {
			Actions a = new Actions(driver);
			if (type.equalsIgnoreCase("click"))
				a.click(element).build().perform();
			else if (type.equalsIgnoreCase("doubleclick"))
				a.doubleClick(element).build().perform();
			else if (type.equalsIgnoreCase("contextclick"))
			a.contextClick(element).build().perform();
			else if (type.equalsIgnoreCase("moveelement"));
			a.moveToElement(element).build().perform();
			
		}
		public static  void draganddrop(WebElement src, WebElement des) {
		Actions b=new Actions (driver);
		b.dragAndDrop(src,des );
		
		}

		public static void robot(int times, int key) throws AWTException {
			Robot r = new Robot();
			for (int i = 0; i < times; i++) {
			r.keyPress(key);
			r.keyRelease(key);
			}
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void ismultiple() {

			Select s = new Select(null);
			boolean multi = s.isMultiple();
			System.out.println(multi);

		}
	}
