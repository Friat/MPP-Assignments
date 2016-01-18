package librarysystem;

import java.util.ArrayList;
import java.util.Date;

public class Member {

	private String id;
	private String name;
	private String address;
	private String phone;
	private ArrayList<Loan> loanlists;
	private ArrayList<Reservation> reserv_lists;
	
	public Member(String id, String name, String address, String phone, ArrayList<Loan> loanlists )
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		loanlists = new ArrayList<Loan>();
	}
	
	public void reserve(Item item)
	{
		if(!item.checkAvailability())
		{
			Reservation res_item = new Reservation(new Date(), item);
			addreserve(res_item);
			
		}
	}
	
	public void borrow(ItemCopy item)
	{
		if(item.checkAvailability())
		{
			Loan loan_item = new Loan(new Date(),new Date(),this, item );
		}
		
	}
	
	public void Return()
	{
		
	}
	
	public void addreserve(Reservation resItem)
	{
		reserv_lists.add(resItem);
	}
	
	public void addloan(Loan lonedItem)
	{
		loanlists.add(lonedItem);
	}
}
