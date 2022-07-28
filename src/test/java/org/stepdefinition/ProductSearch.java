package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.Pages;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class ProductSearch extends Pages {
	WebDriver driver;
	Pages p;
	@Given("The user should be in the Traget application search box")
	public void the_user_should_be_in_the_Traget_application_search_box() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.target.com/");
//	browserLaunch("chrome");
//	url("https://www.target.com/");
//	
	
	}
	@Given("The user should enter the iphone in search box")
	public void the_user_should_enter_the_iphone_in_search_box() throws InterruptedException {
		Pages p =new Pages();
//		Thread.sleep(5000);
//		sendkeys(getSearchbtn(), "iphone");
		driver.findElement(By.id("search")).sendKeys("iphone"+Keys.ENTER);
		
		
	}
	@When("The user should take the price and the name of the product")
	public void the_user_should_take_the_price_and_the_name_of_the_product() throws InterruptedException {
		
//		List<WebElement> list = p.getPhonelists();
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("argument[0].scrollIntoView(true)", "//*[@id=\"select-custom-button-id\"]");
//		Thread.sleep(3000);
//		for(WebElement x:list) {
//			System.out.println(x.getText());
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}
		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//h2[contains(@class,'Heading__Styled')])[7]")).click();
		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("(//a[contains(@class,'Link__StyledLink-sc-4b9qcv-0 styles__StyledTitleLink-sc-h3r0um-1 csEnsr dAyBrL h-display-block h-text-bold h-text-bs')])"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		
		
	}

	@Then("The user should print the price and name of the product in console")
	public void the_user_should_print_the_price_and_name_of_the_product_in_console() {
		driver.quit();
	}

}
