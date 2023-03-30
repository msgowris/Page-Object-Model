package log4j.logger;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.orangehrm.pageobjects.withpagefactory.Login_Page_With_PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4J {

	public static void main(String[] args) throws InterruptedException {

		Logger log = Logger.getLogger("OrangeHRM Project");
		PropertyConfigurator.configure("./log4j.properties");

		WebDriver driver = WebDriverManager.chromedriver().create();
		log.info("Browser Opened");

		driver.manage().window().maximize();
		log.info("Browser Maximizied");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		log.info("Launched OrangeHRM Site");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Login_Page_With_PageFactory login_page = new Login_Page_With_PageFactory(driver);

		login_page.username("Admin");
		Thread.sleep(2000);
		log.info("Username entered");
		login_page.password("admin123");
		Thread.sleep(2000);
		log.info("Password entered");
		login_page.login();
		Thread.sleep(3000);
		log.info("Clicked Login");
		login_page.userid();
		Thread.sleep(2000);
		log.info("Clicked UserID");
		login_page.logout();
		Thread.sleep(2000);
		log.info("Clicked Logout");

	}

}
