package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	public WebDriver driver;

	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement payment;

	public Payment_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getpaymet() {
		return payment;
		
	}
	public WebElement getpayment_mode() {
		return payment_mode;
		
	}
	
	@FindBy(xpath = "(//p[@class=\"payment_module\"])[1]")
	private WebElement payment_mode;
	
	public WebElement getconfmt() {
		return confmt;
		
	}
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement back_to_ord;
	
	public WebElement getback_to_ord() {
		return back_to_ord;
		
	}
	
	@FindBy(xpath = "(//a[@class=\"button-exclusive btn btn-default\"])[1]")
	private WebElement confmt;


	
		

		
		
}
