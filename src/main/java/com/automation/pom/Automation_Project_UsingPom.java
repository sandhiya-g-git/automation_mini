package com.automation.pom;

import com.adactin.Base_Class2;

public class Automation_Project_UsingPom extends Base_Class2 {

	public static void main(String[] args) throws Exception {
		driver = getBrowser("Chrome");

		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");

		Home_Page home = new Home_Page(driver);

		clickoneleme(home.getSignin_btn());

		Login_Page login_Page = new Login_Page(driver);
		sleep(4000); 

		inputvalue(login_Page.getEmail(), "sandhiya@gmail.com");
		sleep(4000);
		inputvalue(login_Page.getPassword(), "Abc@123");
		clickoneleme(login_Page.getSignin_Btn());
		sleep(4000);

		// product
		Product_Page product = new Product_Page(driver);
		sleep(4000);

		clickoneleme(product.gettitle_sele());
		clickoneleme(product.getSelect_title());
		clickoneleme(product.getprodu_sele());
		sleep(4000);
		driver.switchTo().frame(0);
		clickoneleme(product.getqc_vw());
		sleep(4000);
		clickoneleme(product.getsize_produ());

		//Select sc = new Select(size_produ);
		//sc.selectByVisibleText("L");//

		// select_dropdown(size_produ, "L");
		//sleep(4000);
		// addtocard
		AddToCart_Page addtocard = new AddToCart_Page(driver);
		sleep(4000);

		clickoneleme(addtocard.getaddtocord());
		sleep(4000);

		clickoneleme(addtocard.getchekout());
		sleep(4000);

		clickoneleme(addtocard.getproceed1());
		sleep(4000);

		clickoneleme(addtocard.getproceed2());
		sleep(4000);

		clickoneleme(addtocard.getchk_box());

		// payment

		Payment_Page payment_page = new Payment_Page(driver);
		sleep(4000);

		clickoneleme(payment_page.getpaymet());
		sleep(4000);

		clickoneleme(payment_page.getpayment_mode());
		sleep(4000);

		clickoneleme(payment_page.getconfmt());
		Thread.sleep(4000);

		clickoneleme(payment_page.getback_to_ord());
		sleep(4000);

		/*
		 * screenshot("E:\\automation eng\\.metadata\\.metadata\\.metadata\\Automation_Projecthh\\driver\\screenshot\\snap.png"
		 * );
		 * 
		 * TakesScreenshot ts = (TakesScreenshot) driver;
		 * 
		 * File source = ts.getScreenshotAs(OutputType.FILE); File destinaton = new
		 * File("E:\\automation eng\\.metadata\\Selenium_project_new\\screenshot\\product1.png"
		 * ); FileUtils.copyFile(source, destinaton);
		 */
		close();

	}

	// close();

}
