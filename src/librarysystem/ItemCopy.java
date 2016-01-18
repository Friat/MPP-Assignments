package librarysystem;

public class ItemCopy {

	private String copyID;
	private boolean available;
	private Loan loan;
	private Item item;
	public ItemCopy(String copyID, boolean available, Loan loan, Item item) {
		
		this.copyID = copyID;
		this.available = available;
		this.loan = loan;
		this.item = item;
	}
	
	public boolean checkAvailability()
	{
		return this.available;
	}
	
	
}
