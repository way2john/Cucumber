package com.adacting.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.Base_Class.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\adacting\\feature\\adacting.feature",glue ="com.adacting.step")
public class Runnerclass {

	public static  WebDriver driver;
		// TODO Auto-generated method stub

	@BeforeClass
	public static void set_up() {
		driver=Base.browserlaunch("edge");

	}
	
//	@AfterClass
//	public static void tear_Down() {
//		driver=Base.sleep(5000);
//		driver.close();
	
}


	