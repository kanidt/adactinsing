package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass1{
	public BookHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="first_name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(name="last_name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(name="address")
	private WebElement billingAddress;
	
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	@FindBy(name="cc_num")
	private WebElement cardNo;
	
	public WebElement getCardNo() {
		return cardNo;
	}
	@FindBy(name="cc_type")
	private WebElement creditCardType;
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	@FindBy(name="cc_exp_month")
	private WebElement expiryDate;
	
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	@FindBy(name="cc_cvv")
	private WebElement cvvNo;
	
	public WebElement getCvvNo() {
		return cvvNo;
	}
	@FindBy(name="book_now")
	private WebElement bookNow;
	
	public WebElement getBookNow() {
		return bookNow;
	}
	

}
