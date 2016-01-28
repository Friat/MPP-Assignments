package employeeecomparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmpoyeeComp> 
{
	@Override
	public int compare(EmpoyeeComp e1, EmpoyeeComp e2)
	{
		return e1.name.compareTo(e2.name);
	}
	
}
