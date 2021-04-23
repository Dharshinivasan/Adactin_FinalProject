package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_History {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@value='411974']")
	private WebElement cancel_Cb;

	@FindBy(xpath = "//input[@class='reg_button']")
	private WebElement cancel_Btn;

	@FindBy(id = "logout")
	private WebElement logout_Btn;

	public Adactin_History(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCancel_Cb() {
		return cancel_Cb;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

}
