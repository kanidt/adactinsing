package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookIlitinary extends BaseClass1 {
	public BookIlitinary() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="ids[]")
	private WebElement radioButton;
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	@FindBy(name="cancelall")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

}
