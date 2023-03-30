package com.orangehrm.pageobjects.withpagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page_TestCase_With_PageFactory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_Page_With_PageFactory login_page = new Login_Page_With_PageFactory(driver);

		login_page.username("Admin");
		Thread.sleep(2000);
		login_page.password("admin123");
		Thread.sleep(2000);
		login_page.login();
		Thread.sleep(2000);
		login_page.userid();
		Thread.sleep(2000);
		login_page.logout();
		Thread.sleep(2000);

	}

}
