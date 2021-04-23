Feature: Hotel Booking In Adactin Application 

@Smoketest 
Scenario Outline: user Login The Web Application 
	Given user Launch The Application 
	When user Enter The "<Username>" In Username Field 
	And user Enter The "<Password>" In Password Field 
	Then user Click On The Login Button And Navigates To The Search Hotel Page 
	
	Examples: 
		|Username|Password|
		|ddd|678|
		|hjy|543|
		|Murugadharshini|dharshini15|
		
		@Sanitytest 
		Scenario: user Search The Hotel 
			When user Select The Location From The Dropdown Field 
			And user Select The Hotels  From The Dropdown Field 
			And user Select The Room Type  From The Dropdown Field 
			And user Select The Number Of Rooms  From The Dropdown Field 
			And user Enter The Check In Date In Date Field 
			And user Enter The Check Out Date In Date Field 
			And user Select The Adults Per Room  From The Dropdown Field 
			And user Select The Children Per Room  From The Dropdown Field 
			Then user Click On The Search Button And Navigates To The Select Hotel Page 
			
		@Sanitytest 
		Scenario: user Select The Hotel 
			When user Select The Hotel From the List 
			Then user Click On The Continue Button And Navigates To The Book A Hotel Page 
			
		@Sanitytest 
		Scenario: user Booking Hotel 
			When user Enter The "Keerthi priya" In First Name Field 
			And user Enter The "Kuppu" In Last Name Field 
			And user Enter The Billing Address In Last Billing Address Field 
			And user Enter The Credit Card No In Credit Card No Field 
			And user Select The Credit Card Type  From The Dropdown Field 
			And user Select The Expiry Month From The Dropdown Field 
			And user Select The Expiry Year From The Dropdown Field 
			And user Enter The CVV Number In CVV Number Field 
			Then user Click On The Book Now Button And Navigates To The Booking Confirmation Page 
			
		@Sanitytest 
		Scenario: user Confirming The Hotel Booking 
			Then user Click On The My Itinerary Button And Navigates To The Booked Itinerary Page 
			
		@Sanitytest 
		Scenario: user Logout 
			Then user Click On The Logout Button And Navigates To The Adactin Logged Out Page 
			
		@Regressiontest 
		Scenario: 
			Then user Click On The Login Link And Navigates To The Adactin Login Page 
