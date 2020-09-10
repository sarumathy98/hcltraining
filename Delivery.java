package com.blower;

public class Delivery {


	long over;
	long balls;
	long runs;
	String batsman_name;
	String bowler_name;
	String nonstriker_name;
	public long getOver()
	{
	return over;
	}
	public void setOver(long over)
	{
	this.over=over;
	}
	public long getBalls()
	{
		return balls;
	}
	public void setBalls(long balls)
	{
	this.balls=balls;
	}
	public long getRuns()
	{
	return runs;
	}
	public void setRuns(long runs)
	{
	this.runs=runs;
	}
	public String getbatsman_Name()
	{
	return batsman_name;
	}
	public void setBatsman_name(String batsman_name)
	{
	this.batsman_name=batsman_name;
	}
	public String getBowler_name()
	{
	return bowler_name;
	}
	public void setBowler_name(String bowler_name)
	{
	this.bowler_name=bowler_name;
	}
	public String getNonstricker_name()
	{
	return nonstriker_name;
	}
	public void setNonstriker_name(String nonstriker_name)
	{
	this.nonstriker_name=nonstriker_name;
	}
	public void displayDeliveryDetails()
	{
		System.out.println("Delivery Details");
		System.out.println("Over: "+over);
		System.out.println("Balls: "+balls);
		System.out.println("Runs: "+runs);
		System.out.println("BatsmanName: "+batsman_name);
		System.out.println("BowlerName: "+bowler_name);
		System.out.println("NonStickerName: "+nonstriker_name);
		
	}
}

