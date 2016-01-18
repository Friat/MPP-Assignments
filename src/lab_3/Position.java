package lab_3;

import java.util.ArrayList;

public class Position 
{
	private String title;
	private String description;
	private Employee empObj;
	private Position superior;
	private ArrayList<Position> inferiors;
	
	
	public Position(Employee empObj, String title, String description)
	{
		this.empObj = empObj;
		this.title = title;
		this.description = description;
		inferiors = new ArrayList<Position>();
	}
	public Position(String title, String description)
	{
		this.title = title;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmpObj() {
		return empObj;
	}

	public void setEmpObj(Employee empObj) {
		this.empObj = empObj;
	}
    
	public void setSuperior(Position superior)
	{
		this.superior = superior;
	}
	
	public ArrayList<Position> getInferiors() {
		return inferiors;
	}
	public void setInferiors(ArrayList<Position> inferiors) {
		this.inferiors = inferiors;
	}
	public Position getSuperior() {
		return superior;
	}
	public Position()
	{
		
	}
	
	public void print()
	{
		System.out.println("Employee Position Title: " +this.title +", "+ "Title Description: "+ this.description);
		
		this.empObj.print();
	}
	
	public double getSalary()
	{
	   return this.empObj.getSalary();
	    
	}
	
	public void addInferior(Position inferior)
	{
		inferiors.add(inferior);
	}
	
	public void printDownLine()
	{
		for(Position p: this.inferiors)
		{
			System.out.println(this.getTitle());
			p.printDownLine();
		}
	}
	
	public boolean isManager()
	{
		return true;
	}
}

