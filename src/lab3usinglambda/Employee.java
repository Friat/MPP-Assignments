package lab3usinglambda;

import java.util.Date;

public class Employee
{
	private String empID;
	private String empFirstName;
	private String empMiddleInitial;
	private String empLastName;
	private Date empBD;
	private String SSN;
	private double salary;
	//private Position empPosition;
	
    public Employee(String empID, String empFirstName, String empMiddleInitial, String empLastName, Date empBD, String SSN, double salary)
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

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
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
    
	public String toString()
	{
		String str = ("Employee Detail: "+ "Employee ID => "+
					 this.empID +", "+ "Employee First Name => " +
				     this.empFirstName +", "+ "Employee Middle Name => "+
					 this.empMiddleInitial +"," + "Employee Last Name" +
				     this.empLastName +", "+ "Employee Birth Date => "+
					 this.empBD +", "+ "Employee SSN => " +
				     this.SSN + ", " + "Employee Salary =>" +
					 this.salary);
		System.out.println();
		return str;
		
	} 
    public void print()
    {
    	System.out.println("Employee Detail: "+ "Employee ID => "+ this.empID +", "+ "Employee First Name => " + this.empFirstName +", "+ "Employee Middle Name => "+ this.empMiddleInitial +"," + "Employee Last Name" + this.empLastName +", "+ "Employee Birth Date => "+this.empBD +", "+ "Employee SSN => " +this.SSN + ", " + "Employee Salary =>" +this.salary);
        System.out.println();
    }
     
    public boolean equals(Object emp)
    {
    	if(emp == null) return false;
    	if(!(emp instanceof Employee)) return false;
    	//if(this.getClass()!= emp.getClass()) return false;
    	Employee e = (Employee)emp;
    	
    	if(this.empFirstName.equals(e.empFirstName) && 
    			this.empMiddleInitial.equals(e.empMiddleInitial)&&
    			this.empLastName.equals(e.empLastName) &&
    			this.empID.equals(e.empID)&&
    			this.empBD.equals(e.empBD) &&
    			this.SSN.equals(e.SSN))
    	{
    	return true;
    	}
    		
    	else    			
    	
    	return false; 
    }
    
    public int hashCode()
    {
    	int hash = 5;
    	int hash_Fname = this.empFirstName.hashCode();
    	int hash_Mname = this.empMiddleInitial.hashCode();
    	int hash_Lname = this.empLastName.hashCode();
    	int hash_eID = this.empID.hashCode();
    	int hash_SSN = this.SSN.hashCode();
    	
    	hash += hash * 31 + hash_Fname;
    	hash += hash * 31 + hash_Mname;
    	hash += hash * 31 + hash_Lname;
    	hash += hash * 31 + hash_eID;
    	hash += hash * 31 + hash_SSN;
    	
    	return hash;
    	//return Object.hash(empFirstName,empMiddleInitial,empLastName, SSN, empBD );
    	
        /*hash = 11 * hash + empFirstName.hashCode() * 
    			empLastName.hashCode() * empID.hashCode()
    			* empMiddleInitial.hashCode() * SSN.hashCode() * empBD.hashCode();
    	
    	return hash;
   */
    }
    
	
    }
