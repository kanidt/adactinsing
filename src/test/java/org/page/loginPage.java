package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass1 {
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id="username")
	private WebElement user;
	
    public WebElement getUser() {
		
		return user ;
	}
    @FindBy(id="password")
    private WebElement pass;	
	
    public  WebElement getpass() {
		
    	return pass;

	}
    @FindBy(id="login")
    private WebElement login;
    
   public WebElement getLogin() {
	return login;
}

}
