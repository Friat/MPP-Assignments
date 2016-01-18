package carrierapp;

public abstract class Package {
	
	protected double item_weight;
	protected String zone;
	protected String description;
	protected String sender;
	
	public Package(String description , double item_weight, String zone, String sender )
	{
		//this.item_Name = name;
		this.item_weight = item_weight;
		this.zone = zone;
		this.description = description;
		this.sender = sender;
		
	}

	protected abstract double cost();
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getItem_weight() {
		return item_weight;
	}

	public void setItem_weight(double item_weight) {
		this.item_weight = item_weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public void setSender(String sender)
	{
		this.sender = sender;
	}
	
	public String getSender()
	{
		return this.sender;
	}

	
	
}
