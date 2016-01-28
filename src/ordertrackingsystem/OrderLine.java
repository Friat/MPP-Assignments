package ordertrackingsystem;

import java.util.ArrayList;
import java.util.Date;

public class OrderLine {

	private int quantity;
	private double price;
	private String status;
	private Date shipDate;
	private double points;
	private Order order;
	private ArrayList<Product> products;
	private Product product;
	
	public OrderLine(int quantity, double price, String status, Date shipDate, double points, Order order)
	{
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.shipDate = shipDate;
		this.points = points;
		this.order = order;
		products = new ArrayList<Product>();
	}

	public double computePrice()
	{
		for(Product p: products)
		{
			this.price = this.price + p.getPrice();
		}
		return this.price;
	}
	
	public double computePoints()
	{
		for(Product p: products)
		{
			this.points =this.points +  p.getCompPoint().getPoints();
		}
		return this.points;
	}
}
