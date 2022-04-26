package Adactin;

import org.openqa.selenium.WebElement;

import com.Base_Class.Base;
import com.Pom.Adactin.Book_Hotel;
import com.Pom.Adactin.Login;
import com.Pom.Adactin.Logoutpage;
import com.Pom.Adactin.Search_Hotel;
import com.Pom.Adactin.Select_Hotel;

public class Test extends Base {
       public static void main(String[] args) throws InterruptedException {
		browserlaunch("edge");
		geturl("https://adactinhotelapp.com/");
		Login l=new Login(driver);
		Search_Hotel s =new Search_Hotel(driver);
		inputkey(l.username, "way2john");
		inputkey(l.password, "9944812219");
		buttonClick(l.loginbutton);
		dropdown(s.Location, "text", "Sydney");
		dropdown(s.hotel, "text", "Hotel Cornice");
		dropdown(s.room, "text", "Super Deluxe");
		dropdown(s.roomnumbers, "text", "5 - Five");
		dropdown(s.adultroom, "text", "4 - Four");
		dropdown(s.childroom, "text","2 - Two" );
		buttonClick(s.submit);
		Select_Hotel s1 =new Select_Hotel(driver);
		buttonClick(s1.radiobutton);
		buttonClick(s1.continuebutton);
		Book_Hotel s2 =new Book_Hotel(driver);
		inputkey(s2.fname, "john");
		inputkey(s2.lname, "sharma");
		inputkey(s2.address, "qhbgjkdrgkzbsfkjhzseuf");
		inputkey(s2.creditnumber, "1256482252455896");
		dropdown(s2.credittype, "value", "VISA");
		dropdown(s2.expmonth, "value", "8");
		dropdown(s2.expyear, "value", "2022");
		inputkey(s2.cvv,"569");
		buttonClick(s2.booknow);
		sleep(9000);
		buttonClick(s2.ilinerary);
		Logoutpage s3 =new Logoutpage(driver);
		buttonClick(s3.logout);
		sleep(3000);
		close();
		
	}
	
	
	
}
