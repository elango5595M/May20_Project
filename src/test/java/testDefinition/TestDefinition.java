package testDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestDefinition {
	WebDriver driver;
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	} 
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username,String password) {
		WebElement txtEmail =driver.findElement(By.id("email"));
		txtEmail.sendKeys(username);
		WebElement passExa = driver.findElement(By.id("pass"));
		passExa.sendKeys(password);
	}
	
	@When("User click login button")
	public void user_click_login_button() {
		  WebElement logBtn = driver.findElement(By.name("login"));
		   logBtn.click(); 
			}
	}
