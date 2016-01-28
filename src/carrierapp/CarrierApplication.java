package carrierapp;

import java.util.Scanner;

public class CarrierApplication {
 
	public static void carrierCost()
		{
			
		double item_weight;
		String zone;
		String item_description;
		Package pkg;
			
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the sender type S for Student and R for senior: ");
	    String sender = input.nextLine();
	
	    System.out.println("Enter the description of the package: ");
	    item_description = input.nextLine();
	
	    System.out.println("Enter the Zone of the package: ");
	    zone = input.nextLine();
	    
	    System.out.println("Enter the weight of the package: ");
	    item_weight = input.nextDouble();
	    
	    double discount;
		if(sender.equals("S"))
		{
			discount = 0.10;
			
		}
		else if(sender.equals("R"))
		{
			discount = 0.15;
		}
		else
			discount = 0;
	
	    pkg = new UPS(item_description, item_weight, zone, sender);
	    double ups_Cost = pkg.cost();
	
	    pkg = new USMail(item_description, item_weight, zone, sender);
	    double USMail_cost = pkg.cost();
	
        pkg = new FedEx(item_description, item_weight, zone, sender);
	    double FedEx_cost = pkg.cost();
	
	    //pkg = new DHL(item_description, item_weight, zone, sender);
	    //double DHL_cost = pkg.cost();
	
	if(ups_Cost < USMail_cost &&  ups_Cost < FedEx_cost )
	{
		ups_Cost -= ups_Cost * discount;
		System.out.printf(pkg.description + "\t" + "$"+ ups_Cost + "\t" + "UPS" );
		System.out.println();
	}
	
	if(USMail_cost < ups_Cost && USMail_cost < FedEx_cost )
	{
		double usmail = USMail_cost - (USMail_cost * discount);
		System.out.printf(pkg.description + "\t" +"$"+ usmail + "\t" + "USMail" );
		System.out.println();
	}
	
	else
		
		System.out.printf(pkg.description + "\t" + "$"+(FedEx_cost -= (FedEx_cost * discount)) + "\t" + "FedEx" );
	    System.out.println();
	
	}
	
	public static void main(String[] args)
	{
		
		try{
		while(true)
		{
			carrierCost();
			System.out.println("Enter q to quit: ");
			Scanner input = new Scanner(System.in);
			
			String quit = input.nextLine();
			char c = quit.charAt(0);
			if(c == 'q' || c == 'Q')
			
			break;
		}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		
	}
	
}
