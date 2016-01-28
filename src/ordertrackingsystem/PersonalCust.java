package ordertrackingsystem;

public class PersonalCust extends ACustomer
{

	private String creditRating;
	private String creditcard;
	
	public PersonalCust(String name, String address, String phone_no, double points, String creditRating,String creditcard) 
	{
		
		super(name, address, phone_no, points);
		this.creditRating = creditRating;
		this.creditcard = creditcard;
	}
	
	public double getCreditRating()
	{
		return 0;
	}
	
}
