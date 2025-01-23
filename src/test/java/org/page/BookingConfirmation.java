package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass1{
	public BookingConfirmation() {
	     PageFactory.initElements(driver,this);

	}   
	@FindBy(id="my_itinerary")
	    private  WebElement Myitinerary;
	public WebElement getMyitinerary() {
		return Myitinerary;
	}


}
