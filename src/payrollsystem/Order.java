package payrollsystem;

import java.util.Date;

public class Order
{
	private String orderNo;
	private Date orderDate;
	private double orderAmount;
	
	private Commissioned commObj;

	public Order(String orderNo, Date orderDate, int orderAmount)
	{
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	public double getAmount(){
		return orderAmount;
	}
	
	

}
