package com.Pom.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public static WebDriver driver;
	public  Book_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	

@FindBy(id="first_name")
public static WebElement fname;
@FindBy(id="last_name")
public static WebElement lname;
@FindBy(id="address")
public static WebElement address;
@FindBy(id="cc_num")
public static WebElement creditnumber;
@FindBy(id="cc_type")
public static WebElement credittype;
@FindBy(id="cc_exp_month")
public static WebElement expmonth;
@FindBy(id="cc_exp_year")
public static WebElement expyear;
@FindBy(id="cc_cvv")
public static WebElement cvv;
@FindBy(id="book_now")
public static WebElement booknow;
@FindBy(id="my_itinerary")
public static WebElement ilinerary;




	

}

