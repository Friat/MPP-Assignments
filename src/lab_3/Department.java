package lab_3;

import java.util.ArrayList;

public class Department 
{
	String name;
	String location;
	private Company compObj;
	private ArrayList <Position> positionList;
	private Position dept_Head_Pos;
	//Position pos = new Position();
		
	public Department(String name, String location, Company compObj)
	{
		this.name = name;
		this.location = location;
		positionList = new ArrayList<Position>();
		this.compObj = compObj;
	}
	
	public Department()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company getCompObj() {
		return compObj;
	}

	public void setCompObj(Company compObj) {
		this.compObj = compObj;
	}

	public ArrayList<Position> getPositionList() {
		return positionList;
	}

	public void setPositionList(ArrayList<Position> positionList) {
		this.positionList = positionList;
	}

	public void addPosition(Position p)
	{
		positionList.add(p);
	}
	
	public void setdept_Head_Pos(Position d)
	{
		this.dept_Head_Pos = d;
	}
	
	public Position getdept_Head()
	{
	return this.dept_Head_Pos;	
	}
	
	public void print()
	{
	    System.out.println("Department Name: =>"+ this.name+", "+ "Location => "+ this.location + ", "+"Company Name => " + this.compObj.getName());
	    
	    for(Position p : this.positionList)
	    {
	    	p.print();
	    }
	   
	}
	double sum = 0;
	public double getSalary()
	{
		for(Position p : this.positionList)
	    {
	    	sum = sum + p.getSalary();
	    }
		return sum;
	}
	
	public void printReportingHierarchy()
	{
		Position deptHeadPosition = this.getdept_Head();
		System.out.println(deptHeadPosition.getTitle());
		
		//for(Position p: this.)
		//{
			
		//}
	}
	
	

}
