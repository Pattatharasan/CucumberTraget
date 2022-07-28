package org.pages;

import java.util.List;

import org.BassclassExample.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.ProductSearch;

public class Pages extends  BaseClass {

	public Pages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement HomeLogin;
	@FindBy(xpath="//*[@id=\\'listaccountNav-signIn\\']/a/span")
	private WebElement Signlogin;
	@FindBy(xpath="//span[text()='Create Account']")
	private WebElement createlogin;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement signin;
	@FindBy(id="username")
	private WebElement email;
	@FindBy(id="firstname")
	private WebElement firstname;
	@FindBy(id="lastname")
	private WebElement lastname;
	@FindBy(id="password")
	private WebElement createpass;
	@FindBy(id="createAccount")
	private WebElement createbtn;
	@FindBy(id="search")
	private WebElement searchbtn;
	@FindBy(xpath="(//button[@type='button'])[7]")
	private WebElement filterbtn;
	@FindBy(xpath="(//button[@type='button'])[8]")
	private WebElement categorybtn;
	@FindBy (xpath="(//button[@type='button'])[9]")
	private WebElement pricebtn;
	@FindBy(xpath=("//a[contains(@class,'Link__StyledLink-sc-4b9qcv-0 styles__StyledTi')]"))
	private List<WebElement> phonelists;
	@FindBy(xpath="//a[text()='Consumer Cellular Postpaid Apple iPhone 11 (64GB) - Black']")
	private WebElement selectedproduct;
	@FindBy(xpath="//div[contains(@class,'styles__Content-sc')]")
	private WebElement textofsecpro;
	@FindBy (id="addToCartButtonOrTextIdFor85287755")
	private WebElement addcart;
	@FindBy (xpath="//a[contains(@class,'styles__PrimaryHeaderLink-sc-17dxxwu-4 styles__CartLin')]")
	private WebElement incart;
	@FindBy (xpath="//button[text()='Sign in to check out']")
	private WebElement cartsignin;
	
	
	public WebElement getHomeLogin() {
		return HomeLogin;
	}
	public WebElement getSignlogin() {
		return Signlogin;
	}
	public WebElement getCreatelogin() {
		return createlogin;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getCreatepass() {
		return createpass;
	}
	public WebElement getCreatebtn() {
		return createbtn;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getFilterbtn() {
		return filterbtn;
	}
	public WebElement getCategorybtn() {
		return categorybtn;
	}
	public WebElement getPricebtn() {
		return pricebtn;
	}
	public List<WebElement> getPhonelists() {
		return phonelists;
	}
	public WebElement getSelectedproduct() {
		return selectedproduct;
	}
	public WebElement getTextofsecpro() {
		return textofsecpro;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getIncart() {
		return incart;
	}
	public WebElement getCartsignin() {
		return cartsignin;
	}
	
	
	
	
}
