Feature: Hotel Booking In Adactin Application

Scenario: Login Module

Given user Launch The Application
When user Enter The User Name In Username Feild
And user Enter The Password In Password Feild
Then user Click On The login Button And It Navigates To Search Hotel

Scenario: Search Hotel
When  user select the location in location feild
And  user select the hotel in hotel feild
And  user select the hotel in hotel feild
And  user select the room type in room type feild
And user select the number of rooms in number of rooms feild
And  user select the adults per room in adult feild
And  user select the childrens per room in children feild
Then  user click on the search button and it navigate to select hotel page

