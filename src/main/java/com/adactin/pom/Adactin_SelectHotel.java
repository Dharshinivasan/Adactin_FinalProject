package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SelectHotel {
	
	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement select_Rbtn;

	@FindBy(id = "continue")
	private WebElement continue_Btn;

	public Adactin_SelectHotel(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSelect_Rbtn() {
		return select_Rbtn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
}
