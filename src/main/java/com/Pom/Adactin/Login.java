package com.Pom.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	public  Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="login")
	public static WebElement loginbutton;
	
	@FindBy(id="username")
	public static WebElement username;
	 
	@FindBy(id="password")
	public static WebElement password;
}
