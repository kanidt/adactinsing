package org.manager;

import org.page.AgainLoginPage;
import org.page.BookHotel;
import org.page.BookIlitinary;
import org.page.BookingConfirmation;
import org.page.SearchHostel;
import org.page.SelectHotel;
import org.page.loginPage;

public class PageManager {
	private loginPage loginPage;
	private SearchHostel searchHostel;
	private SelectHotel selectHotel;
	private BookHotel bookHotel;
	private BookingConfirmation bookingConfirmation;
	private BookIlitinary bookIlitinary;
	private AgainLoginPage againLoginPage;
	
	public   loginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new loginPage() :loginPage;
	}
	public SearchHostel getSearchHostel() {
		return(searchHostel == null) ?searchHostel = new SearchHostel() : searchHostel;
	}
	public SelectHotel getSelectHotel() {
		return (selectHotel==null) ?selectHotel=new SelectHotel():selectHotel;
	}
	public BookHotel getBookHotel() {
		return (bookHotel==null)?bookHotel=new BookHotel():bookHotel;
	}
	public BookingConfirmation getBookingConfirmation() {
		return(bookingConfirmation==null)?bookingConfirmation=new BookingConfirmation(): bookingConfirmation;
	}
	public BookIlitinary getBookIlitinary() {
		return(bookIlitinary==null)?bookIlitinary=new BookIlitinary(): bookIlitinary;
	}
	public AgainLoginPage getAgainLoginPage() {
		return (againLoginPage==null)?againLoginPage=new AgainLoginPage():againLoginPage;
	}

}
