package librarysystem;

import java.util.Date;

public class Reservation {

	private Date reservation_Date;	
    //private boolean available;
    private Item item;
	
    public Reservation(Date reservation_Date, Item item) {
		
    	this.reservation_Date = reservation_Date;
		//this.available = available;
		this.item = item;
	}


	public boolean checkAvailability()
	{
		return item.checkAvailability();
	}
}
