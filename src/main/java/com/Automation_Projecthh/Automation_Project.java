package com.Automation_Projecthh;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.Base_Class2;

public class Automation_Project extends Base_Class2 {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = getBrowser("chrome");

		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");

		// loginpage
		WebElement Email = driver.findElement(By.id("email"));
		isEnabled(Email);
		inputvalue(Email, "sandhiya@gmail.com");

		WebElement Password = driver.findElement(By.id("passwd"));
		inputvalue(Password, "Abc@123");

		WebElement sigin_bt = driver.findElement(By.xpath("//i[@class='icon-lock left'][1]"));
		clickoneleme(sigin_bt);

		// product
		WebElement title_sele = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		clickoneleme(title_sele);

		WebElement sele_tit = driver.findElement(By.xpath("(//img[@class='replace-2x'])[1]"));
		clickoneleme(sele_tit);

		WebElement produ_sele = driver.findElement(By.xpath("(//img[@title=\"Printed Dress\"])[1]"));
		clickoneleme(produ_sele);
		sleep(4000);
		driver.switchTo().frame(0);

		WebElement qc_vw = driver.findElement(By.xpath("(//i[@class=\"icon-plus\"])[1]"));
		clickoneleme(qc_vw);
		sleep(4000);
		WebElement size = driver.findElement(By.id("group_1"));
		clickoneleme(size);

		Select sc = new Select(size);
		sc.selectByVisibleText("L");

		WebElement addtocard = driver.findElement(By.xpath("(//button[@name=\"Submit\"])[1]"));
		clickoneleme(addtocard);
		sleep(4000);

		WebElement checkout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		clickoneleme(checkout);
		sleep(4000);

		WebElement proceed1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		clickoneleme(proceed1);
		sleep(4000);

		WebElement proceed2 = driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[7]"));
		clickoneleme(proceed2);
		sleep(4000);

		WebElement chk_box = driver.findElement(By.id("cgv"));
		clickoneleme(chk_box);

		WebElement payment = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		clickoneleme(payment);
		sleep(4000);

		WebElement payment_mode = driver.findElement(By.xpath("(//p[@class=\"payment_module\"])[1]"));
		clickoneleme(payment_mode);
		sleep(4000);

		WebElement confmt = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		clickoneleme(confmt);
		Thread.sleep(4000);

		WebElement back_to_ord = driver.findElement(By.xpath("(//a[@class=\"button-exclusive btn btn-default\"])[1]"));
		clickoneleme(back_to_ord);
		sleep(4000);
		
		screenshot("E:\\automation eng\\.metadata\\.metadata\\.metadata\\Automation_Projecthh\\driver\\screenshot\\snap.png");

/*		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File destinaton = new File("E:\\automation eng\\.metadata\\Selenium_project_new\\screenshot\\product1.png");
		FileUtils.copyFile(source, destinaton);
		*/
		close();

	}

}
