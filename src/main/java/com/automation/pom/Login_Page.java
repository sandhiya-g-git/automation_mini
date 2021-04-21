package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	public Login_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getEmail() {
		return email;

	}

	public WebElement getPassword() {
		return Password;

	}

	public WebElement getSignin_Btn() {
		return Signin_Btn;

	}

	@FindBy(name = "passwd")
	private WebElement Password;

	@FindBy(xpath = "//i[@class='icon-lock left'][1]")
	private WebElement Signin_Btn;

}
