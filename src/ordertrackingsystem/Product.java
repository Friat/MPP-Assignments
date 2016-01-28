package ordertrackingsystem;

public class Product {

	private String description;
	private String p_number;
	private double price;
	private ACompPoints compPoint;
	
	public Product(String description, String p_number, double price)
	{
		
		this.description = description;
		this.p_number = p_number;
		this.price = price;
	}
	
	public ACompPoints getCompPoint() {
		return compPoint;
	}

	public void setCompPoint(ACompPoints compPoint) {
		this.compPoint = compPoint;
	}
		
	public double getPrice()
	{
		return 0;
	}
}
