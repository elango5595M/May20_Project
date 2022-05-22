package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDef {
	WebDriver driver;
	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/index.php");	
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String pass) {
		WebElement lgtButn = driver.findElement(By.id("username"));
		lgtButn.sendKeys(username);
		WebElement passBtn = driver.findElement(By.id("password"));
		passBtn.sendKeys(pass);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		WebElement clk = driver.findElement(By.id("login"));  
		clk.click();
	}

	@Then("Search hotel page should be displayed")
	public void search_hotel_page_should_be_displayed() {
		System.out.println("Hotel should be displayed");
	}
	
	@When("User enters {string} <HotelNAme>{string}double{string}{int}{string}{int}{int}{int}{string}{int}{int}{int}{string}{int}{string}{int}\"")
	public void user_enters_HotelNAme_double(String location, String hotel, String hotel1 , Integer int1, String string4, String int2, Integer int3, Integer int4, String string5, Integer int5, Integer int6, Integer int7, String string6, Integer int8, String string7, Integer int9) {
		WebElement ddyy = driver.findElement(By.id("location"));
		Select s=new Select(ddyy);
		s.selectByVisibleText(location);
		
		WebElement htl = driver.findElement(By.id("hotels"));
		Select s1=new Select(htl);
		s1.selectByVisibleText(hotel);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomType);
		s2.selectByVisibleText(hotel1);
		
		WebElement numofRooms=driver.findElement(By.id("room_nos"));
		Select s3=new Select(numofRooms);
		s3.selectByValue("5");
		
		WebElement checkinDate = driver.findElement(By.id("datepick_in"));
		Select s4=new Select(checkinDate);
		s4.deselectByVisibleText(string4);
		
		WebElement CheckoutDate = driver.findElement(By.id("datepick_out"));
		Select s5=new Select(CheckoutDate);
		s5.selectByValue(int2);
		
		WebElement aduRoom = driver.findElement(By.id("adult_room"));
		Select s6=new Select(aduRoom);
		s6.deselectByIndex(2);
		
		WebElement ChilRoom = driver.findElement(By.id("child_room"));
		Select s7=new Select(ChilRoom);
		s7.selectByIndex(2);	
	}

	@When("user clicks the search button")
	public void user_clicks_the_search_button() {
	WebElement srcBtn = driver.findElement(By.id("Submit"));
	srcBtn.click();
	}
	@Then("select hotel page should be displayed")
	public void select_hotel_page_should_be_displayed() {
	System.out.println("hotel page should be displayed");
	}

	@When("user select the hotel thorugh radio button")
	public void user_select_the_hotel_thorugh_radio_button() {
	WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
	radioBtn.click();
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
	WebElement clickBtn = driver.findElement(By.id("continue"));
	clickBtn.click();
	}

	@Then("The book detail sholud be displayed")
	public void the_book_detail_sholud_be_displayed() {
	System.out.println("booking details should be dispalyed");
	}

	@When("the user enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_enter(String value, String data, String add, String num, String VISA, String March, String string7, String string8) {
		WebElement fitName = driver.findElement(By.id("continue"));
		fitName.sendKeys(value);
		
		WebElement lastNa = driver.findElement(By.id("last_name"));
		lastNa.sendKeys(data);
		
		WebElement addr = driver.findElement(By.id("address"));
		addr.sendKeys(add);
		
		WebElement cardNum = driver.findElement(By.id("cc_num"));
		cardNum.sendKeys(num);
		
		WebElement sleCard = driver.findElement(By.id("cc_type"));
		Select s8=new Select(sleCard);
		s8.selectByVisibleText(VISA);
		
		WebElement sleMonth = driver.findElement(By.id("cc_exp_month"));
		Select s9=new Select(sleMonth);
		s9.selectByVisibleText(March);
		
		WebElement sleYear = driver.findElement(By.id("cc_exp_year"));
		Select s10=new Select(sleYear);
		s10.selectByValue("2022");
		
		WebElement ccvNum = driver.findElement(By.id("cc_cvv"));
		Select s11=new Select(ccvNum);
		s11.selectByValue("2022");
	}
	
	@When("User click the book now button")
	public void user_click_the_book_now_button() {
		WebElement cli= driver.findElement(By.id("book_now"));
		cli.click();
	}

	@Then("Booking conformation page shuld be displayed")
	public void booking_conformation_page_shuld_be_displayed() {	
	System.out.println("Booking conformation page displayed");
	}


}
