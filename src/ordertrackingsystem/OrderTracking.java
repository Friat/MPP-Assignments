package ordertrackingsystem;

public class OrderTracking {
	
	public static void main(String[] args)
	{
		
		ACustomer cust1 = new CorporateCust("Friat", "Fairfield", "4353635144", 2.0 ,"excellent", 1000);
		ACustomer cust2 = new CorporateCust("Tinbit", "Fairfield", "4353635144", 3.0 ,"excellent", 1000);
		
		ACustomer cust3 = new PersonalCust("Kidist", "Fairfield", "4353635144", 3.0 ,"excellent","454672");
		ACustomer cust4 = new PersonalCust("Eyob", "Fairfield", "4353635144", 3.0 ,"excellent","458972");
		
	    Product prod1 = new Product("Laptop", "comp123", 500.0);
	    Product prod2 = new Product("Diet", "med123", 200.0);
	    
	    ACompPoints audiovideo = new Audio_VdeoPoints(0.5);
	    ACompPoints computer_related = new ComputerPoints(2);
	    ACompPoints health_related = new HealthPoints(1);
	    ACompPoints other = new OtherPoints(1);
	}

}
