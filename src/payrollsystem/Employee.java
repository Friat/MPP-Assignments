package payrollsystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Employee 
{
	protected String empid;
	protected ArrayList<PayCheck> payChecks;
	
	
	public Employee(String empid)
	{
		this.empid = empid;
		payChecks = new ArrayList<PayCheck>();
	}
	Employee()
	{
		
	}

	public void print()
	{
		System.out.println("Employee ID: "+this.empid);
		for(PayCheck pc : payChecks)
		{
			pc.print();
			
		}
	}
	
	public PayCheck calcCompensation(int year, int month)
	{
		double gross= this.calcGrossPay();
		double FICA=gross*0.23;
		double state = gross * 0.05;
		double local = gross * 0.01;
		double Medicare = gross * 0.03;
		double SocialSecurity = gross * 0.075;
		
		GregorianCalendar start = new GregorianCalendar(year, month,1);
		GregorianCalendar end =new GregorianCalendar(year, month,1);
		
		start.set(Calendar.DAY_OF_MONTH, DateRange.getFirstDayOfMonth(start));
		end.set(Calendar.DAY_OF_MONTH, DateRange.getLastDayOfMonth(end));
			 
		DateRange payperiod = new DateRange(start,end);
     	PayCheck pc = new PayCheck(gross, FICA, state, local, Medicare,SocialSecurity,payperiod );
				
		return pc;
	}

	public abstract double calcGrossPay();
	
	public void addPayChecks(PayCheck pc)
	{
		payChecks.add(pc);
	}
	}



