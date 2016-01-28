package payrollsystem;

import java.util.ArrayList;

public class Commissioned extends Employee
{

	private double commission;
	private double baseSalary;
	private ArrayList<Order> orders;
		
	public Commissioned(String empid, double commission, double baseSalary)
	{
		super(empid);
		this.commission = commission;
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	}

	public void addOrders(Order o)
	{
		orders.add(o);
	}
	public double calcGrossPay()
	{
		//return 0;
		double amount=0;
		for(Order e: orders){
			amount= amount +e.getAmount();
		}
		double value=amount*commission;
		return value+ baseSalary;
	}
}
