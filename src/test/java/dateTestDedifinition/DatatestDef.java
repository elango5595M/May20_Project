package dateTestDedifinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatatestDef {
	WebDriver driver;

@Given("user login to orange hrm brower")
public void user_login_to_orange_hrm_brower() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
}
   
@When("user to send valid username and valid password")
	public void user_to_send_valid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList(String.class);
		String username = list.get(0);
		String password = list.get(1);
		driver.findElement(By.id("divUsername")).sendKeys(username);
		driver.findElement(By.id("divPassword")).sendKeys(password);

	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("open the orange hrm home page is displayed")
	public void open_the_orange_hrm_home_page_is_displayed() {
		System.out.println("home page are displayed");
	}


}
