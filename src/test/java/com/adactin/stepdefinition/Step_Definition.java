package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.Adactin_Booking;
import com.adactin.pom.Adactin_Confirmation;
import com.adactin.pom.Adactin_History;
import com.adactin.pom.Adactin_Login;
import com.adactin.pom.Adactin_Logout;
import com.adactin.pom.Adactin_SearchHotel;
import com.adactin.pom.Adactin_SelectHotel;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;

	

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = FileReaderManager.getInstance().getInstanceCR().getURL();

		getUrl(url);
		implicitWait(30, TimeUnit.SECONDS);

	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		inputValueElement(pom.getInstanceLogin().getUser_Name(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		inputValueElement(pom.getInstanceLogin().getPassword(), password);
	}

	@Then("^user Click On The Login Button And Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLogin_Btn());

	}

	@When("^user Select The Location From The Dropdown Field$")
	public void user_Select_The_Location_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceSearch().getLocation_Dd(), "index", "3");

	}

	@When("^user Select The Hotels  From The Dropdown Field$")
	public void user_Select_The_Hotels_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceSearch().getHotels_Dd(), "index", "2");

	}

	@When("^user Select The Room Type  From The Dropdown Field$")
	public void user_Select_The_Room_Type_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceSearch().getRoomtype_Dd(), "index", "4");

	}

	@When("^user Select The Number Of Rooms  From The Dropdown Field$")
	public void user_Select_The_Number_Of_Rooms_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceSearch().getRoomno_Dd(), "index", "5");

	}

	@When("^user Enter The Check In Date In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Date_Field() throws Throwable {

		inputValueElement(pom.getInstanceSearch().getCheckin_Date(), "13/04/2021");

	}

	@When("^user Enter The Check Out Date In Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Date_Field() throws Throwable {

		inputValueElement(pom.getInstanceSearch().getCheckout_Date(), "14/04/2021");

	}

	@When("^user Select The Adults Per Room  From The Dropdown Field$")
	public void user_Select_The_Adults_Per_Room_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceSearch().getAdultroom_Nos(), "index", "2");

	}

	@When("^user Select The Children Per Room  From The Dropdown Field$")
	public void user_Select_The_Children_Per_Room_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceSearch().getChildroom_Nos(), "index", "1");

	}

	@Then("^user Click On The Search Button And Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_Navigates_To_The_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getSearch_Btn());

	}

	@When("^user Select The Hotel From the List$")
	public void user_Select_The_Hotel_From_the_List() throws Throwable {

		clickOnElement(pom.getInstanceSelect().getSelect_Rbtn());

	}

	@Then("^user Click On The Continue Button And Navigates To The Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSelect().getContinue_Btn());

	}

	@When("^user Enter The \"([^\"]*)\" In First Name Field$")
	public void user_Enter_The_In_First_Name_Field(String firstName) throws Throwable {
		
		inputValueElement(pom.getInstanceBooking().getFirst_Name(), firstName);
	}

	@When("^user Enter The \"([^\"]*)\" In Last Name Field$")
	public void user_Enter_The_In_Last_Name_Field(String lastName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		inputValueElement(pom.getInstanceBooking().getLast_Name(), lastName);
	}

	@When("^user Enter The Billing Address In Last Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Last_Billing_Address_Field() throws Throwable {

		inputValueElement(pom.getInstanceBooking().getAddress(), "no.8, Bhavani Street, TTK Nagar Extension, Irumbuliyur");

	}

	@When("^user Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {

		String creditNo = FileReaderManager.getInstance().getInstanceCR().getCreditNo();

		inputValueElement(pom.getInstanceBooking().getCreditCard_No(), creditNo);

	}

	@When("^user Select The Credit Card Type  From The Dropdown Field$")
	public void user_Select_The_Credit_Card_Type_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceBooking().getCardType_Dd(), "index", "2");

	}

	@When("^user Select The Expiry Month From The Dropdown Field$")
	public void user_Select_The_Expiry_Month_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceBooking().getExpMonth_Dd(), "index", "8");

	}

	@When("^user Select The Expiry Year From The Dropdown Field$")
	public void user_Select_The_Expiry_Year_From_The_Dropdown_Field() throws Throwable {

		dropDownSelect(pom.getInstanceBooking().getExpYear_Dd(), "index", "12");

	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {

		String cvvNo = FileReaderManager.getInstance().getInstanceCR().getCvvNo();

		inputValueElement(pom.getInstanceBooking().getCvv_No(), cvvNo);

	}

	@Then("^user Click On The Book Now Button And Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {

		clickOnElement(pom.getInstanceBooking().getBooking_Btn());

	}

	@Then("^user Click On The My Itinerary Button And Navigates To The Booked Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_Navigates_To_The_Booked_Itinerary_Page() throws Throwable {

		clickOnElement(pom.getInstanceConfirm().getMy_Itinerary_Btn());

	}

	@Then("^user Click On The Logout Button And Navigates To The Adactin Logged Out Page$")
	public void user_Click_On_The_Logout_Button_And_Navigates_To_The_Adactin_Logged_Out_Page() throws Throwable {

		clickOnElement(pom.getInstanceHistory().getLogout_Btn());

	}

	//@Then("^user Click On The Login Link And Navigates To The Adactin Login Page$")
	//public void user_Click_On_The_Login_Link_And_Navigates_To_The_Adactin_Login_Page() throws Throwable {

		//clickOnElement(pom.getInstanceLogout().getLog_Btn());

	//}
}
