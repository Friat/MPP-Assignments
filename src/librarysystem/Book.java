package librarysystem;

import java.util.ArrayList;

public class Book extends Item{

	private String ISBN;
	private ArrayList<String> authorList;
	private int limit;
    //private boolean available;
    
    public Book(String title, boolean available, String iSBN, ArrayList<String> authorList, int limit) {
		
    	super(title, available);
		ISBN = iSBN;
		this.authorList = new ArrayList<String>();
		this.limit = limit;
		//this.available = available;
	}



	public boolean checkAvailability()
	{
		return this.available;
	}
}
