package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {
	
	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement user_Name;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login_Btn;

	public Adactin_Login(WebDriver adactin_Driver) {
		
		this.driver = adactin_Driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser_Name() {
		return user_Name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

}
