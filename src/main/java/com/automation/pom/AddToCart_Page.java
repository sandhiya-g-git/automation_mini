package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page {
	
	public WebDriver driver;

	@FindBy(xpath = "(//button[@name=\"Submit\"])[1]")
	private WebElement addtocard;

	public  AddToCart_Page(WebDriver driver2) {
	

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getaddtocord() {
		return addtocard;

	}
	public WebElement getchekout() {
		return chekout;
		
	}
	
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[2]")
	private WebElement chekout;
	
	public WebElement getproceed1() {
		return proceed1;
		
	}
	
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
	private WebElement proceed1;
	
	public WebElement getproceed2() {
		return proceed2;
		
	}
	
	@FindBy(xpath = "(//i[@class=\"icon-chevron-right right\"])[7]")
	private WebElement proceed2;
	
	public WebElement getchk_box() {
		return chk_box;
		
	}
	
	@FindBy(id = "cgv")
	private WebElement chk_box;
	
}
