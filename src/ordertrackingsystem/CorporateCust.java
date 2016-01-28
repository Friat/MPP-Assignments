package ordertrackingsystem;

public class CorporateCust extends ACustomer
{
	
	private String creditRating;
	private double creditLimit;
	

	public CorporateCust(String name, String address, String phone_no, double points, String creditRating, double creditLimit) 
	{
		
		super(name, address, phone_no, points);
		this.creditLimit = creditLimit;
		this.creditRating = creditRating;
	}

    public double getCreditRating()
    {
    	return 0;
    }
	public double generalMonthlyBill()
	{
		return 0;
	}

}
