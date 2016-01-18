package carrierapp;

public class FedEx extends Package
{
	
	public FedEx(String description, double item_weight, String zone, String sender )
	{
		super(description, item_weight, zone,sender);
	}
	
	
	public double cost()
	{
		zone = zone.toLowerCase();
		if(zone.equals("IA") || zone.equals("MT") ||zone.equals("CA") || zone.equals("OR"))
		return 0.35 * item_weight;
		
		else if(zone.equals("TX") || zone.equals("UT")){
			return 0.30 * item_weight;
		}
		
		else if(zone.equals("FL")|| zone.equals("MA") || zone.equals("OH"))
		{
			return 0.55 * item_weight;
		}
		
		else return 0.43 * item_weight;
	} 

}
