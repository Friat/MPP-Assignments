package payrollsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PayrollMain {

	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
		
		Order order1 = new Order("od001",sdf.parse("01-22-2016") , 4);
	    Order order2 = new Order("002",sdf.parse("01-15-2016") , 2);
	    
	   	Commissioned emp1 = new Commissioned("emp001", 0.07, 2000);
		emp1.addOrders(order1);
		
		Commissioned emp2 = new Commissioned("emp002", 0.07, 4000);
		emp2.addOrders(order2);
		
		Salaried emp3 = new Salaried("emp003", 4000);
		Employee emp4 = new Hourly("emp004", 8, 210);
		
		
		PayCheck pc1 = emp1.calcCompensation(2015, 6);
		emp1.addPayChecks(pc1);
		System.out.println("Commissioned Employee:============>");
		emp1.print();
				
		PayCheck pc2 = emp3.calcCompensation(2015, 6);
		System.out.println("Salaried Employee==========>");
		emp3.addPayChecks(pc2);
		emp3.print();
		
		
	  // System.out.println("GrossSalary Salaried : "+ emp3.calcCompensation(2016,1).getNetPay());
	   //System.out.println("GrossSalary of Hourly : "+ emp4.calcCompensation(2015,6).getNetPay());
	   //System.out.println("Compensation: "+ emp1.calcCompensation());
		//emp1.addPayChecks(pc);
		
		
		
		
	}
}
