package employeeecomparator;

public class EmpoyeeComp {

	 String name;
	 double salary;
	
	public EmpoyeeComp(String n, double s)
	{
		this.name = n;
		this.salary = s;
	}
	
	public String toString()
	{
		return "Name: "+ this.name + ":"
	           + "Salary: " + "$"+ this.salary + "\n";
		
	}
}
