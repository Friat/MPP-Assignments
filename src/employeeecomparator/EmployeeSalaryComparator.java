package employeeecomparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<EmpoyeeComp>{

	@Override
	public int compare(EmpoyeeComp s1, EmpoyeeComp s2)
	{
		if(s1.salary == s2.salary) return 0;
		if(s2.salary < s1.salary) return -1;
		else
			return 1;
	}
}
