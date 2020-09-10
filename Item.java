package com.kk;
import java.util.Scanner;
import java.io.*;
import java.lang.Object;
public class Item {
	String name;
	Double deposits;
	Double cost_pershow;
	public Item()
	{
		
	}
	Item(String name,Double deposits,Double cost_pershow)
	{
		this.name=name;
		this.deposits=deposits;
		this.cost_pershow=cost_pershow;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposits() {
		return deposits;
	}
	public void setDeposits(Double deposits) {
		this.deposits = deposits;
	}
	public Double getCost_pershow() {
		return cost_pershow;
	}
	public void setCost_pershow(Double cost_pershow) {
		this.cost_pershow = cost_pershow;
	}
	public String toString()
	
	{
	return name+ " " + deposits + " "+cost_pershow;
	
	}
	public void display()
	{
		System.out.println("The Details: ");
		System.out.println("Name :"+this.name);
		System.out.println("Deposits :"+this.deposits);
		System.out.println("CostPerShow :"+this.cost_pershow);
	}

}
