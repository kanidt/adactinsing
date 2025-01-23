package org.page;

import org.ececute.BaseClass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHostel extends BaseClass1 {
	public SearchHostel  () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	 private WebElement location;

	
	public WebElement getLocation() {
		return location;
	}
    @FindBy (name="hotels")
   private WebElement hotels;


	public WebElement getHotels() {
		return hotels;
	}
	@FindBy (id="room_type")
    private WebElement RoomType;
	
  public WebElement getRoomType() {
		return RoomType;
	}
  
  @FindBy(id="room_nos")
  private WebElement roomNo;
  
  public WebElement getRoomNo() {
	return roomNo;
}

  @FindBy (xpath="//input[@name='datepick_in']")  
  private WebElement checkindate;
	

	public WebElement getCheckindate() {
		return checkindate;
	}               
     @FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkoutdate;


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}              
	@FindBy(xpath="//select[@name='adult_room']")
   private WebElement Adultroom;
	public WebElement getAdultroom() {
		return Adultroom;
	}
	
   @FindBy(xpath="//select[@name='child_room']") 
	private WebElement childrenroom;
   
   public WebElement getChildrenroom() {
		return childrenroom;
	}
   @FindBy(xpath="//input[@type='submit']")
   private WebElement searchbox;
   
   public WebElement getSearchbox() {
	return searchbox;
}


}
