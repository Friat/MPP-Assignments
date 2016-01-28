package ordertrackingsystem;

import java.util.ArrayList;

public abstract class ACustomer {

	protected String name;
	protected String address;
	protected String phone_no;
	protected double points;
	protected ArrayList<Order> orders;
	
	protected abstract double getCreditRating();
	
	
	public ACustomer(String name, String address, String phone_no, double points) 
	{
		
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.points = points;
	}


	
}
