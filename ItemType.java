package com.kk;

import java.util.ArrayList;


public class ItemType {
	
	ArrayList <Object> list =new ArrayList<Object>();
	String name;
	double deposits;
	double costper_day;
	
	public ItemType()
	{
		
	}
	public ItemType(String name,double deposits,double costper_day)
	{
		super();
		this.name=name;
		this.deposits=deposits;
		this.costper_day=costper_day;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposits() {
		return deposits;
	}
	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}
	public double getCostper_day() {
		return costper_day;
	}
	public void setCostper_day(double costper_day) {
		this.costper_day = costper_day;
	}
	@Override
	public String toString() {
		return "ItemType [name=" + name + ", deposits=" + deposits + ", costper_day=" + costper_day + "]";
	}
	
	

}
