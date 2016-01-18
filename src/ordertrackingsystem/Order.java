package ordertrackingsystem;

import java.util.Date;

public class Order {

	private String order_no;
    private boolean prepaid;
    private double order_price;
    private Date order_date;
    private String status;
    
    
    public Order(String order_no, boolean prepaid, double order_price, Date order_date, String status) {
		super();
		this.order_no = order_no;
		this.prepaid = prepaid;
		this.order_price = order_price;
		this.order_date = order_date;
		this.status = status;
	}

	public double getTotalPrice()
    {
    	return 0;
    }
    
    public double getPrepaid()
    {
    	return 0;
    }
    
    public double getCustomer_points()
    {
    	return 0;
    }
    
    public double getOrderPoints()
    {
    	return 0;
    }
    
    public double setCusPoints(double cus_points)
    {
    	return 0;
    	
    }
}
