package ordertrackingsystem;

import java.util.ArrayList;
import java.util.Date;

public class Order {

	private String order_no;
    private boolean prepaid;
    private double order_price;
    private Date order_date;
    private String status;
    private ArrayList<OrderLine> orderlines;
    
    
    public Order(String order_no, boolean prepaid, double order_price, Date order_date, String status)
    {
		
		this.order_no = order_no;
		this.prepaid = prepaid;
		this.order_price = order_price;
		this.order_date = order_date;
		this.status = status;
		orderlines = new ArrayList<OrderLine>();
	}

	public double getTotalPrice()
    {
    	for(OrderLine ol: orderlines)
    	{
    		this.order_price = this.order_price + ol.computePrice();
    		
    	}
    	return this.order_price;
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
