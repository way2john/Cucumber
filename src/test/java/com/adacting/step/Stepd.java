package com.adacting.step;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base;
import com.Pom.Adactin.Login;
import com.Pom.Adactin.Search_Hotel;
import com.adacting.runner.Runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepd extends Base {
	public static WebDriver driver = Runnerclass.driver;
	public static Login l = new Login(driver);
	public static Search_Hotel s=new Search_Hotel(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		geturl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The User Name In Username Feild$")
	public void user_Enter_The_User_Name_In_Username_Feild() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		inputkey(l.username, "way2john");
	}

	@When("^user Enter The Password In Password Feild$")
	public void user_Enter_The_Password_In_Password_Feild() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		inputkey(l.password, "9944812219");
	}

	@Then("^user Click On The login Button And It Navigates To Search Hotel$")
	public void user_Click_On_The_login_Button_And_It_Navigates_To_Search_Hotel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		buttonClick(l.loginbutton);
	}
	
	@When("^user select the location in location feild$")
	public void user_select_the_location_in_location_feild() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropdown(s.Location, "text", "Sydney");
	}

	@When("^user select the hotel in hotel feild$")
	public void user_select_the_hotel_in_hotel_feild() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropdown(s.hotel, "text", "Hotel Cornice");
	}

	@When("^user select the room type in room type feild$")
	public void user_select_the_room_type_in_room_type_feild() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropdown(s.room, "text", "Super Deluxe");
	}

	@When("^user select the number of rooms in number of rooms feild$")
	public void user_select_the_number_of_rooms_in_number_of_rooms_feild() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropdown(s.roomnumbers, "text", "5 - Five");
	}

	@When("^user select the adults per room in adult feild$")
	public void user_select_the_adults_per_room_in_adult_feild() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropdown(s.adultroom, "text", "4 - Four");
	}

	@When("^user select the childrens per room in children feild$")
	public void user_select_the_childrens_per_room_in_children_feild() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropdown(s.childroom, "text","2 - Two" );
	}

	@Then("^user click on the search button and it navigate to select hotel page$")
	public void user_click_on_the_search_button_and_it_navigate_to_select_hotel_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		buttonClick(s.submit);
	}
}
