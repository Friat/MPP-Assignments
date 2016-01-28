package lab_2;

class Staff extends Person implements IPerson
{
	private double salary;
	
	public Staff(String name, String phonenumber, int age, double salary) {
		super(name, phonenumber, age);
		this.salary = salary;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void myAbstract()
	{
		System.out.println("From Abstract Method:");
	}
	
}