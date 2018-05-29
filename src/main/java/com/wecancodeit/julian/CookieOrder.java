package com.wecancodeit.julian;

public class CookieOrder
{
	private String variety = "";
	private int numBoxes = 0;
	
	public CookieOrder(String variety, int numBoxes)
	{
		this.numBoxes = numBoxes;
		this.variety = variety;
	}
	
	public String getVariety()
	{
		return variety;
	}
	public int getNumBoxes()
	{
		return numBoxes;
	}

}
