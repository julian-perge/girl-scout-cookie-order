package com.wecancodeit.julian;
import java.util.ArrayList;
public class MasterOrder
{
	ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();
	//public MasterOrder(){}
	// add an order to the list showing variety and quantity
	public void addOrder(CookieOrder theOrder)
	{
		orders.add(theOrder);
	}
	// keep track of total boxes ordered
	public int getTotalBoxes()
	{
		int totalBoxes = 0;
		
		for (CookieOrder order : orders)
		{
			totalBoxes += order.getNumBoxes();
		}
		
		return totalBoxes;
	}
	// give the ability to pick out a variety of cookie and remove it from the list
	public void removeVariety(String variety)
	{
		for (CookieOrder order : orders)
		{
			if (variety.equalsIgnoreCase(order.getVariety()))
			{
				System.out.println("You are removing " + order.getNumBoxes() + ' ' + order.getVariety() + "\n");
				orders.remove(order);
				break;
			}
		}
	}
	// to traverse and print the ArrayList
	public void showOrder()
	{
		System.out.println("Current Order");

		for (CookieOrder order : orders)
		{
			System.out.println("Variety: " + order.getVariety().concat("\t") + "Boxes:\t" + order.getNumBoxes());
		}
	}
}
