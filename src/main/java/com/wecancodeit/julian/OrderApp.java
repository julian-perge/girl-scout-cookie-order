package com.wecancodeit.julian;
import java.util.Scanner;
public class OrderApp
{
	public static void main(String[] args)
	{
		MasterOrder master = new MasterOrder();
		Scanner input = new Scanner(System.in);
				
		CookieOrder order1 = new CookieOrder("Tagalongs", 1);
		CookieOrder order2 = new CookieOrder("Thin Mints", 5);
		CookieOrder order3 = new CookieOrder("Samoas", 2);
		CookieOrder order4 = new CookieOrder("PB Sandwich ", 3);

		master.addOrder(order1);
		master.addOrder(order2);
		master.addOrder(order3);
		master.addOrder(order4);

		master.showOrder();
		
		System.out.println("\nYou have ordered " + master.getTotalBoxes() + " boxes\n");
		System.out.println("What would you like to remove? (specify a variety or none)");
		
		String varietyToRemove = input.nextLine();
		master.removeVariety(varietyToRemove);
		
		input.close();
	}
	
}
