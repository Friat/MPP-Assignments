package employeeecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo 
{
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public EmployeeInfo(SortMethod method)
	{
		this.method = method;
	}
	
	public EmployeeInfo() {
		// TODO Auto-generated constructor stub
	}

	public void sort(List<EmpoyeeComp> emps, final SortMethod method)
	{
		class EmployeeComparator implements Comparator<EmpoyeeComp>
		{
			@Override  //Comparator is now aware of sort method
			public int compare(EmpoyeeComp e1, EmpoyeeComp e2){
		
		if(method == SortMethod.BYSALARY)
		{
			if(e1.salary == e2.salary) return 0;
			if(e1.salary < e2.salary) return -1;
			else
				return 1;
		}
		else
		{
			return e1.name.compareTo(e2.name);
		}
		
	}
  }
		Collections.sort(emps, new EmployeeComparator() );
}

	public static void main(String[] args)
	{
		List<EmpoyeeComp> emps = new ArrayList<EmpoyeeComp>();
		emps.add(new EmpoyeeComp("Friat", 50000));
		emps.add(new EmpoyeeComp("Tinbit", 60000));
		emps.add(new EmpoyeeComp("Kidi", 100000));
		emps.add(new EmpoyeeComp("John", 100000));
		
		EmployeeInfo e2 = new EmployeeInfo();
		e2.sort(emps, SortMethod.BYNAME);
		System.out.println("Sorted By Salary: \n"+ emps);
		
		EmployeeInfo e1 = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		e1.sort(emps, SortMethod.BYSALARY);
		System.out.println("Sorted By Name: \n"+ emps);
		System.out.println();
		
		
	}
}
