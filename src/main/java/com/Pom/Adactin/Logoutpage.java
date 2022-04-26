package com.Pom.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

	public static WebDriver driver;
	public  Logoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(id="logout")
	public static WebElement logout;
	
}
