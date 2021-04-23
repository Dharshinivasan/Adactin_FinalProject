package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Logout {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement log_Btn;

	public WebElement getLog_Btn() {
		return log_Btn;
	}

	public Adactin_Logout(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
