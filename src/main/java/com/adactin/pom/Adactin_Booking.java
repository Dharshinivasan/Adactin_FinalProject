package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Booking {
	
	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement first_Name;

	@FindBy(id = "last_name")
	private WebElement last_Name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCard_No;

	@FindBy(id = "cc_type")
	private WebElement cardType_Dd;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth_Dd;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear_Dd;

	@FindBy(id = "cc_cvv")
	private WebElement cvv_No;

	@FindBy(id = "book_now")
	private WebElement booking_Btn;

	public Adactin_Booking(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard_No() {
		return creditCard_No;
	}

	public WebElement getCardType_Dd() {
		return cardType_Dd;
	}

	public WebElement getExpMonth_Dd() {
		return expMonth_Dd;
	}

	public WebElement getExpYear_Dd() {
		return expYear_Dd;
	}

	public WebElement getCvv_No() {
		return cvv_No;
	}

	public WebElement getBooking_Btn() {
		return booking_Btn;
	}

}
