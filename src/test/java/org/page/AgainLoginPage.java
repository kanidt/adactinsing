package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgainLoginPage extends BaseClass1{
	public AgainLoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
}
