package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SearchHotel {
	
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location_Dd;

	@FindBy(id = "hotels")
	private WebElement hotels_Dd;

	@FindBy(id = "room_type")
	private WebElement roomtype_Dd;

	@FindBy(id = "room_nos")
	private WebElement roomno_Dd;

	@FindBy(id = "datepick_in")
	private WebElement checkin_Date;

	@FindBy(id = "datepick_out")
	private WebElement checkout_Date;

	@FindBy(id = "adult_room")
	private WebElement adultroom_Nos;

	@FindBy(id = "child_room")
	private WebElement childroom_Nos;

	@FindBy(id = "Submit")
	private WebElement search_Btn;

	public Adactin_SearchHotel(WebDriver driver2) {
	
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation_Dd() {
		return location_Dd;
	}

	public WebElement getHotels_Dd() {
		return hotels_Dd;
	}

	public WebElement getRoomtype_Dd() {
		return roomtype_Dd;
	}

	public WebElement getRoomno_Dd() {
		return roomno_Dd;
	}

	public WebElement getCheckin_Date() {
		return checkin_Date;
	}

	public WebElement getCheckout_Date() {
		return checkout_Date;
	}

	public WebElement getAdultroom_Nos() {
		return adultroom_Nos;
	}

	public WebElement getChildroom_Nos() {
		return childroom_Nos;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

}
