package org.stepdefinition;

import java.util.NoSuchElementException;
import org.BassclassExample.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
public class LoginSteps extends BaseClass {
	WebDriver driver;
	@Given("As a user to open a application")
	public void as_a_user_to_open_a_application() {
		browserLaunch("chrome");
		url("https://www.target.com/");
		WebElement loginpage = driver.findElement(By.xpath("//span[text()='Sign in']"));
		loginpage.click();	
	}
	// @When("To give input invalid username and password")
	// public void
	// to_give_input_invalid_username_and_password(io.cucumber.datatable.DataTable
	// input) {
	 @When("To click {string} button")
	 public void to_click_button(String button) {
		 if (button.equals("login")) {
		WebElement login = driver.findElement(By.xpath("//*[@id=\'listaccountNav-signIn\']/a/span"));
		click(login);
		}
		 else if (button.equals("createnew")){
			 WebElement btncreate = driver.findElement(By.xpath("//span[text()='Create Account']"));
			btncreate.click();
			}
		 else {
			 throw new NoSuchElementException();
		 }	
	}
	@When("To give input invalid {string} and {string}")
	 public void to_give_input_invalid_and(String username, String password) {
		// 1 List<String> li = input.asList();
		// 1 li.get(0);
		// 1 li.get(1);
		// 2 List<List<String>> list = input.asLists();
		// 2 List<String> kumar = list.get(1);
		// 2 String string = kumar.get(0);
		// 4 List<Map<String, String>> asMaps = input.asMaps(String.class,
		// String.class);
		// 4 Map<String, String> map = asMaps.get(0);
		// 4 String raja = map.get("username");
		// 4 Map<String, String> map2 = asMaps.get(0);
		// 4 String pass = map2.get("password");
		WebElement Username = driver.findElement(By.id("username"));
		sendkeys(Username, username);
		WebElement Password = driver.findElement(By.id("password"));
		sendkeys(Password, password);
		WebElement loginbut = driver.findElement(By.id("login"));
		click(loginbut);
	}
	@Then("To validate the page navigate to the invalide login page")
	public void to_validate_the_page_navigate_to_the_invalide_login_page() {
		WebElement invalid = driver.findElement(By.id("username--ErrorMessage"));
		String t = invalid.getText();
		Assert.assertTrue(t.contains("Please enter a valid email or phone"));
		System.out.println("==== entered invalid input=====");
		quit();
	}
	@When("Give {string}{string}{string}{string}")
	public void give(String gmail, String first, String last, String pass) throws InterruptedException {
		WebElement mail = driver.findElement(By.id("username"));
		sendkeys(mail, gmail);
		WebElement fname = driver.findElement(By.id("firstname"));
		sendkeys(fname, first);
		WebElement lname = driver.findElement(By.id("lastname"));
		sendkeys(lname, last);
		WebElement pword = driver.findElement(By.id("password"));
		sendkeys(pword, pass);
		Thread.sleep(3000);
	}
	@Then("To check weather the account created")
	public void to_check_weather_the_account_created() {
		WebElement btnc = driver.findElement(By.id("createAccount"));
		click(btnc);
		WebElement skipbtn = driver.findElement(By.id("circle-skip"));
		click(skipbtn);
		Assert.assertTrue(driver.getCurrentUrl().contains("gift-registry"));
		System.out.println("hi");
		quit();
	}
}