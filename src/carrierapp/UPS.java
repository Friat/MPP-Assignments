package carrierapp;

public class UPS extends Package
{
	private final double RATE = 0.45;
	
	public UPS(String description, double item_weight, String zone, String sender)
	{
	super(description, item_weight, zone, sender);
	}

	public double cost()
	{
		return (RATE * item_weight); 
		
	}
}
