package librarysystem;

import java.util.ArrayList;

public class Item {

	protected String title;
	protected boolean available;
	protected ArrayList<ItemCopy> itemcopy;
	protected ArrayList<Reservation> reservations;
	
	
	public Item(String title, boolean available)
	{
		
		this.title = title;
		this.available = available;
		this.itemcopy = new ArrayList<ItemCopy>();
		this.reservations = new ArrayList<Reservation>();
	}


	public boolean checkAvailability()
	{
		return this.available;
	}

	
}
