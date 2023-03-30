package com.orangehrm.pageobjects.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Without_PageFactory {

	public WebDriver driver;
	
	By txt_Username= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By txt_Password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By btn_Login = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By user_ID = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
	By logout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]");
	
	public void username(String username) {
		driver.findElement(txt_Username).sendKeys(username);
	}

	public void password(String password) {
		driver.findElement(txt_Password).sendKeys(password);
	}

	public void login() {
		driver.findElement(btn_Login).click();
	}

	public void userid() {
		driver.findElement(user_ID).click();
	}

	public void logout() {
		driver.findElement(logout).click();
	}

	public LoginPage_Without_PageFactory(WebDriver remote_driver) {
		this.driver = remote_driver;
	}

}
