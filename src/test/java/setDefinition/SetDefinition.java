package setDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetDefinition {
	WebDriver driver;

	@Given("user open into the login url page {string}")
	public void user_open_into_the_login_url_page(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("user set the valid username {string} and invalid password {string}")
	public void user_set_the_valid_username_and_invalid_password(String data, String value) {
		WebElement eamilLogin = driver.findElement(By.name("email"));
		eamilLogin.sendKeys(data);
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(value);
	}

	@When("click the login button")
	public 	WebElement click_the_login_button() {
		WebElement clickButn = driver.findElement(By.name("login"));
		clickButn.click();
		return clickButn;
	}

	@Then("open should be the facebook home page")
	public void open_should_be_the_facebook_home_page() {
		System.out.println("the facebook home page is displyed");
	}

}
