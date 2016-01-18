package ordertrackingsystem;

public class ACustomer {

	protected String name;
	protected String address;
	protected String phone_no;
	protected double points;
	protected double getCreditRating;
	
	
	public ACustomer(String name, String address, String phone_no, double points) {
		super();
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.points = points;
	}


	public double getCreditRating()
	{
		return this.getCreditRating;
	}
}
