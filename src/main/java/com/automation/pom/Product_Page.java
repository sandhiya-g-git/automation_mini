package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement title_sele;

	public Product_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement gettitle_sele() {
		return title_sele;

	}

	public WebElement getSelect_title() {
		return Select_title;

	}

	public WebElement getprodu_sele() {
		return produ_sele;

	}

	public WebElement getqc_vw() {
		return qc_vw;

	}

	public WebElement getsize_produ() {
		return size_produ;

	}

	@FindBy(xpath = "(//img[@class='replace-2x'])[1]")
	private WebElement Select_title;

	@FindBy(xpath = "(//img[@title=\"Printed Dress\"])[1]")
	private WebElement produ_sele;

	@FindBy(xpath = "(//i[@class=\"icon-plus\"])[1]")
	private WebElement qc_vw;

	@FindBy(id = "group_1")
	private WebElement size_produ;

}
