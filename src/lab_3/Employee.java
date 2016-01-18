package lab_3;

import java.util.Date;

public class Employee
{
	private String empID;
	private String empFirstName;
	private String empMiddleInitial;
	private String empLastName;
	private Date empBD;
	private long SSN;
	private double salary;
	//private Position empPosition;
	
    public Employee(String empID, String empFirstName, String empMiddleInitial, String empLastName, Date empBD, long SSN, double salary)
    {
    	this.empID = empID;
    	this.empFirstName = empFirstName;
    	this.empMiddleInitial = empMiddleInitial;
    	this.empLastName = empLastName;
    	this.empBD = empBD;
    	this.SSN = SSN;
    	this.salary = salary;
    	//this.empPosition = empPosition;
    }
    
    public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpMiddleInitial() {
		return empMiddleInitial;
	}

	public void setEmpMiddleInitial(String empMiddleInitial) {
		this.empMiddleInitial = empMiddleInitial;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public Date getEmpBD() {
		return empBD;
	}

	public void setEmpBD(Date empBD) {
		this.empBD = empBD;
	}

	public long getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*public Position getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(Position empPosition) {
		this.empPosition = empPosition;
	} */

	public Employee()
    {
    	
    }
    
    public void print()
    {
    	System.out.println("Employee Detail: "+ "Employee ID => "+ this.empID +", "+ "Employee First Name => " + this.empFirstName +", "+ "Employee Middle Name => "+ this.empMiddleInitial +"," + "Employee Last Name" + this.empLastName +", "+ "Employee Birth Date => "+this.empBD +", "+ "Employee SSN => " +this.SSN + ", " + "Employee Salary =>" +this.salary);
        System.out.println();
    }
        
    
	
    }
