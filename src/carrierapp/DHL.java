package carrierapp;

public class DHL extends Package{

	public DHL(String description, double item_weight, String zone, String sender )
	{
		super(description, item_weight, zone,sender);
	}
	public double cost()
	{
		if(item_weight > 4)
		{
			return item_weight * 0.30;
		} 
		
			return item_weight * 1;
		
	}
}
