package com.orangehrm.pageobjects.withoutpagefactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_TestCase_Without_PageFactory {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage_Without_PageFactory lp = new LoginPage_Without_PageFactory(driver);

		lp.username("Admin");
		Thread.sleep(2000);
		lp.password("admin123");
		Thread.sleep(2000);
		lp.login();
		Thread.sleep(2000);
		lp.userid();
		Thread.sleep(2000);
		lp.logout();
		Thread.sleep(2000);

	}

}
