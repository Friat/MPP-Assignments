package lab_3;

import java.util.ArrayList;

public class Company 
{
	private String name;
	private ArrayList <Department> deptList;
	private Position topExecutive;
	
	public Company(String name)
	{		
		this.name = name;
		deptList = new ArrayList <Department>();
		//employees = new ArrayList <Employee>();
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(ArrayList<Department> deptList) {
		this.deptList = deptList;
	}

	public void settopExecutive(Position topExec)
	{
		this.topExecutive = topExec;
	}
	public Position gettopExecutive()
	{
		return this.topExecutive;
	}
	
	public void print()
	{
    	System.out.println("Company Name=> "+ this.name);
    	System.out.println();
    
	for(Department d: deptList){
    		d.print();
    	}
    	
		//d.print(this);
	}
	double sum =0;
	public double getSalary()
	{
		
		for(Department d: deptList){
    		sum = sum + d.getSalary();
    	}
		return sum;
	}
	
	public void addDepartment(Department d)
	{
		deptList.add(d);
	}
	
		public void printReportingHierarchy()
	{
		
			Position top_executive = this.gettopExecutive();
			Employee emp = top_executive.getEmpObj();
			System.out.println("Top Executive => "+"Name : "+emp.getEmpFirstName() + "Middle Name : "+ emp.getEmpMiddleInitial()+ "Last Name"+ emp.getEmpLastName() );
		    
			for(Department d : this.deptList)
			{
				d.printReportingHierarchy();
			}
	}
	
	
}
