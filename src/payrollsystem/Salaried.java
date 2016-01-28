package payrollsystem;

public class Salaried extends Employee
{

	private double salary;
	
	
	public Salaried(String empid, double salary) 
	{
		super(empid);
		this.salary = salary;
	}


	public double getSalary()
	{
		return this.salary;
	}
	public double calcGrossPay()
	{
		return salary;
	}
}
