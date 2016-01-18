package carrierapp;

public class USMail extends Package {
	
	public USMail(String description, double item_weight, String zone, String sender)
	{
		super(description, item_weight, zone, sender);
	}
	
	public double cost()
	{
		if( item_weight <= 3)
		{
			return 1; 
		}
		else 
		{
			return 0.55 * item_weight;
		}
	}

}
