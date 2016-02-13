package lab3usinglambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
	
	public static void main(String[] args) throws ParseException, NullPointerException
	{
		Company company = new Company("GOOGLE");
		Department sales = new Department("Computer Science", "California",company);
		Department marketing = new Department("Information Technology", "Texas", company);
		Department marketing2 = new Department("Information Technology", "Texas", company);
		
		SimpleDateFormat BDate = new SimpleDateFormat("MM/DD/YYYY");
		//BDate.setLenient(false);
		
		// Creating Employee Objects
		
		Employee lyle2 = new Employee("emp_001","Lyle","Mehari","Hadush", BDate.parse("03/05/1987"), "766769879" ,10000.0);
		Employee lyle = new Employee("emp_001","Lyle","Mehari","Hadush", BDate.parse("03/05/1987"), "766769879" ,10000.0);
		Employee ron = new Employee("emp_002","Ron","Kassahun","Hirutu", BDate.parse("03/05/1988"), "865437654" ,10000.0);
		Employee stan = new Employee("emp_001","Stan","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee peter = new Employee("emp_001","Peter","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee tom = new Employee("emp_001","Tom","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee sue = new Employee("emp_001","Sue","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee marc = new Employee("emp_001","Marc","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee bill = new Employee("emp_001","Bill","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee dan = new Employee("emp_001","Dan","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee anne = new Employee("emp_001","Anne","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		Employee gray = new Employee("emp_001","Gray","Semachew","Hadush", BDate.parse("03/05/1988"), "794498076" ,10000.0);
		
		System.out.println("Object lyle2 and lyle are equal: ================: "+ lyle2.equals(lyle));
		// Creating Position Objects
		
		Position Top_Executive = new Position(lyle,"Java Programmer", "Developing Softwares: ");
		Position Dept_head1 = new Position(ron,"C# Programmer", "Developing Programs in C#");
		Position pos31 = new Position(stan,"Data Encoder", "Design and Analyze Data");
		Position pos3 = new Position(stan,"Data Analyst", "Design and Analyze Data");
		Position pos4 = new Position(peter,"OO Programmer1", "Programming Object Oriented");
		Position pos5 = new Position(tom,"System Programmer", "Design and Analyze Data");
		Position pos6 = new Position(sue,"System Admin", "Administers the network");
		Position pos7 = new Position(marc,"System Admin", "Administers the network");
		Position pos8 = new Position(bill,"System Admin", "Administers the network");
		Position pos9 = new Position(dan,"System Admin", "Administers the network");
		Position Dept_head2 = new Position(anne,"System Admin", "Administers the network");
		Position pos11 = new Position(gray,"System Admin", "Administers the network");
		// Adding The departments to the Company
		
		// checking overridden equals method
		
		System.out.println("Pos31 and Pos3 are equal: " + pos31.equals(pos3));
		company.addDepartment(sales);
		company.addDepartment(marketing);
		
		System.out.println("Dept Sales and Dept Marketing are equal: "+ sales.equals(marketing));
		System.out.println("Dept Marketing2 and Dept Marketing are equal: "+ marketing2.equals(marketing));

		// Testing toString Method for Employee, Department and Position
		
		System.out.println("Detail info for Employee lyle: "+lyle);
		System.out.println("Position Detail: "+ pos9);
		System.out.println("Department Detail: "+ sales);
		
		// adding positions to each departments.
		
		sales.addPosition(Dept_head1);
		sales.addPosition(pos3);
		sales.addPosition(pos4);
		sales.addPosition(pos5);
		sales.addPosition(pos6);
		sales.addPosition(pos7);
		sales.addPosition(pos8);
		sales.addPosition(pos9);
		
		marketing.addPosition(Dept_head2);
		marketing.addPosition(pos11);
		
		// Setting Top Executive
		company.settopExecutive(Top_Executive);
		
		// Adding the employees under the Sales Department Head
		
		Dept_head1.addInferior(pos3);
		Dept_head1.addInferior(pos4);
		Dept_head1.addInferior(pos5);
		Dept_head1.addInferior(pos6);
		Dept_head1.addInferior(pos7);
		Dept_head1.addInferior(pos8);
		Dept_head1.addInferior(pos9);
				
		//Adding the employees under the Marketing Department Head
		
		Dept_head2.addInferior(pos11);
		
				
		// Setting Department Head Position
		
		sales.setdept_Head_Pos(Dept_head1);
		marketing.setdept_Head_Pos(Dept_head2);
		
		company.print();
		
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Total Salary of the Company => : "+company.getSalary());
		company.printReportingHierarchy();
		
		//Testing HashCode method
		System.out.println();
		System.out.println("///////////////////////////////////////");
		System.out.println("Testing Hashcode of Employee Objects");
		System.out.println("Hash Code of lyle: "+ lyle.hashCode());
		System.out.println("Hash Code of lyle2: "+ lyle2.hashCode());
		System.out.print("Hash Code of peter: "+ peter.hashCode());
		System.out.println();
		System.out.println("=======================================");
	}

}
