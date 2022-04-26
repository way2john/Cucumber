package com.Pom.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	public  Search_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
		@FindBy(id ="location")
		public static WebElement Location;
		@FindBy(id ="hotels")
		public static WebElement hotel;
		@FindBy(id ="room_type")
		public static WebElement room;
		@FindBy(id ="room_nos")
		public static WebElement roomnumbers;
		
		@FindBy(id ="adult_room")
		public static WebElement adultroom;
		@FindBy(id ="child_room")
		public static WebElement childroom;
		
		@FindBy(id ="Submit")
		public static WebElement submit;
		
	}


