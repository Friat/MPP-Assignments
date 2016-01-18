package librarysystem;

import java.util.ArrayList;

public class Magazine extends Item {

	private int limit;
	private String issue_No;
	private boolean available;
	
	public Magazine(String title, boolean available,int limit, String issue_No) {
		
		super( title,available);
		this.limit = limit;
		this.issue_No = issue_No;
		this.available = available;
	}

    public boolean checkAvailability()
	{
		return this.available;
	}
	
}
