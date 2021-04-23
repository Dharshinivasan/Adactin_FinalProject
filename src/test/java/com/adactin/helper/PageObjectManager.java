package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Adactin_Booking;
import com.adactin.pom.Adactin_Confirmation;
import com.adactin.pom.Adactin_History;
import com.adactin.pom.Adactin_Login;
import com.adactin.pom.Adactin_Logout;
import com.adactin.pom.Adactin_SearchHotel;
import com.adactin.pom.Adactin_SelectHotel;

public class PageObjectManager {

	public static WebDriver driver;

	private static Adactin_Login login;

	private static Adactin_Booking booking;

	private static Adactin_SearchHotel search;

	private static Adactin_SelectHotel select;

	private static Adactin_Confirmation confirm;

	private static Adactin_History history;

	private static Adactin_Logout logout;

	public PageObjectManager(WebDriver driver2) {

		PageObjectManager.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public Adactin_Login getInstanceLogin() {

		login = new Adactin_Login(driver);

		return login;
	}

	public Adactin_Booking getInstanceBooking() {

		booking = new Adactin_Booking(driver);

		return booking;

	}

	public Adactin_SearchHotel getInstanceSearch() {

		search = new Adactin_SearchHotel(driver);

		return search;

	}

	public Adactin_SelectHotel getInstanceSelect() {

		select = new Adactin_SelectHotel(driver);

		return select;

	}

	public Adactin_Confirmation getInstanceConfirm() {

		confirm = new Adactin_Confirmation(driver);

		return confirm;

	}

	public Adactin_History getInstanceHistory() {

		history = new Adactin_History(driver);

		return history;

	}

	public Adactin_Logout getInstanceLogout() {

		logout = new Adactin_Logout(driver);

		return logout;

	}

}
