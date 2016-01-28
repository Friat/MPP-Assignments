package payrollsystem;

public class Hourly extends Employee
{

	private int hourlyWage;
	private int hoursPerMonth;
	
	
	public Hourly(String empid, int hourlyWage, int hoursPerMonth)
	{
		super(empid);
		this.hourlyWage = hourlyWage;
		this.hoursPerMonth = hoursPerMonth;
	}

	public double calcGrossPay()
	{
		return hourlyWage*hoursPerMonth;
	}
}
