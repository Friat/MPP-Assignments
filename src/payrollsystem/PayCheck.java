package payrollsystem;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PayCheck 
{
	
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	private Employee employee;
	
	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, DateRange payperiod)
	{
		this.grossPay = grossPay;
		this.fica = fica;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payperiod; 
			   
	}  
	 
	public void print()
	{
		System.out.printf("Gross Pay $%2.2f " ,this.grossPay);
		System.out.println();
		System.out.printf("FICA: $%2.2f", this.fica);
		System.out.println();
		System.out.printf("State Tax: $%2.2f ", this.state);
		System.out.println();
		System.out.printf("Local: $%2.2f",this.local);
		System.out.println();
		System.out.printf("Medicare Tax: $%2.2f",this.medicare);
		System.out.println();
		System.out.printf("Social Security Tax: $%2.2f",this.socialSecurity);
		System.out.println();
		System.out.printf("Pay Period: "+ this.payPeriod);
		System.out.println();
				
	}
	
	public double getNetPay()
	{
		return this.grossPay - (fica + local + medicare + socialSecurity  );
	}
	

}
