package com.Pom.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	public  Select_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	public static WebElement radiobutton;
	@FindBy(id="continue")
	public static WebElement continuebutton;
}
