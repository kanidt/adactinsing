package org.globle;

import java.io.IOException;
import java.time.Duration;

import org.ececute.BaseClass1;
import org.manager.PageManager;
import org.openqa.selenium.WebElement;
import org.page.AgainLoginPage;
import org.page.BookHotel;
import org.page.BookIlitinary;
import org.page.BookingConfirmation;
import org.page.SearchHostel;
import org.page.SelectHotel;
import org.page.loginPage;

public class TestScript1 extends BaseClass1 {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseClass1 baseClass1 = new BaseClass1();
		baseClass1.getDriver(baseClass1.readExcel(2, 4));
		baseClass1.getUrl(baseClass1.readExcel(2, 5));
		baseClass1.WindowsMax();

		// loginPage loginPage1 =new loginPage();
		PageManager pageManager = new PageManager();
		loginPage loginPage1 = pageManager.getLoginPage();
		WebElement user = loginPage1.getUser();
		baseClass1.sendKey(user, baseClass1.readExcel(2, 1));

		WebElement pass = loginPage1.getpass();
		baseClass1.sendKey(pass, baseClass1.readExcel(2, 2));

		WebElement login = loginPage1.getLogin();
		baseClass1.clickbutton(login);

		SearchHostel searchHostel = pageManager.getSearchHostel();
		WebElement location = searchHostel.getLocation();
		baseClass1.selectByVisibleText(location, baseClass1.readExcel(2, 6));

		WebElement hotels = searchHostel.getHotels();
		baseClass1.selectByVisibleText(hotels, baseClass1.readExcel(3, 7));

		WebElement roomType = searchHostel.getRoomType();
		baseClass1.selectByVisibleText(roomType, baseClass1.readExcel(3, 8));

		WebElement roomNo = searchHostel.getRoomNo();
		baseClass1.selectByVisibleText(roomNo, baseClass1.readExcel(3, 9));

		WebElement checkindate = searchHostel.getCheckindate();
		baseClass1.sendKey(checkindate, baseClass1.readExcel(2, 10));

		WebElement checkoutdate = searchHostel.getCheckoutdate();
		baseClass1.sendKey(checkoutdate, baseClass1.readExcel(2, 11));

		WebElement adultroom = searchHostel.getAdultroom();
		baseClass1.selectByVisibleText(adultroom, baseClass1.readExcel(2, 12));

		WebElement childrenroom = searchHostel.getChildrenroom();
		baseClass1.selectByVisibleText(childrenroom, baseClass1.readExcel(2, 13));

		WebElement searchbox = searchHostel.getSearchbox();
		baseClass1.clickbutton(searchbox);

		SelectHotel selectHotel = pageManager.getSelectHotel();
		WebElement radiobutton = selectHotel.getRadiobutton();
		baseClass1.clickbutton(radiobutton);

		WebElement continueButton = selectHotel.getContinueButton();
		baseClass1.clickbutton(continueButton);

		BookHotel bookHotel = pageManager.getBookHotel();
		WebElement firstName = bookHotel.getFirstName();
		baseClass1.sendKey(firstName, baseClass1.readExcel(2, 15));

		WebElement lastName = bookHotel.getLastName();
		baseClass1.sendKey(lastName, baseClass1.readExcel(2, 16));

		WebElement billingAddress = bookHotel.getBillingAddress();
		baseClass1.sendKey(billingAddress, baseClass1.readExcel(2, 17));

		WebElement cardNo = bookHotel.getCardNo();
		baseClass1.sendKey(cardNo, baseClass1.readExcel(2, 18));

		WebElement creditCardType = bookHotel.getCreditCardType();
		baseClass1.selectByVisibleText(creditCardType, baseClass1.readExcel(3, 19));

		WebElement expiryDate = bookHotel.getExpiryDate();
		baseClass1.selectByVisibleText(expiryDate, baseClass1.readExcel(3, 20));

		WebElement expiryYear = bookHotel.getExpiryYear();
		System.out.println(expiryYear);
		baseClass1.selectByVisibleText(expiryYear, baseClass1.readExcel(3, 21));

		WebElement cvvNo = bookHotel.getCvvNo();
		baseClass1.sendKey(cvvNo, baseClass1.readExcel(2, 22));

		WebElement bookNow = bookHotel.getBookNow();
		baseClass1.clickbutton(bookNow);

		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(10000);

		BookingConfirmation bookingConfirmation = pageManager.getBookingConfirmation();
		WebElement myitinerary = bookingConfirmation.getMyitinerary();
		baseClass1.clickbutton(myitinerary);

		BookIlitinary bookIlitinary = pageManager.getBookIlitinary();
		WebElement radioButton2 = bookIlitinary.getRadioButton();
		baseClass1.clickbutton(radioButton2);

		WebElement cancelButton = bookIlitinary.getCancelButton();
		baseClass1.clickbutton(cancelButton);

		baseClass1.confirmAlert("dismiss");

		WebElement logout = bookIlitinary.getLogout();
		baseClass1.clickbutton(logout);

		AgainLoginPage againLoginPage = pageManager.getAgainLoginPage();
		WebElement login2 = againLoginPage.getLogin();
		baseClass1.clickbutton(login2);

	}

}
