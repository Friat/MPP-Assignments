package payrollsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRange
{
	
	private Calendar startDate;
	private Calendar endDate;
	
	
	public DateRange(Calendar startDate, Calendar endDate)
	{		
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange()
	{
		return false;
	}
	
	public String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
		return sdf.format(this.startDate.getTime())+ " TO " + sdf.format(this.endDate.getTime());
				
	}
	
	public static int getFirstDayOfMonth(GregorianCalendar d)
	{
		int firstday = d.getActualMinimum(GregorianCalendar.DATE);
		 return firstday;
	}
	
	public static int getLastDayOfMonth(GregorianCalendar d)
	{
		int lastday = d.getActualMaximum(GregorianCalendar.DATE);
		return lastday;
		
	}
	

}
