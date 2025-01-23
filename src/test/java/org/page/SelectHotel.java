package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass1 {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	@FindBy(id="continue")
	private WebElement continueButton;
	
	public WebElement getContinueButton() {
		return continueButton;
	}

}
