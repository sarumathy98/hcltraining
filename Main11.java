package com.kk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		ItemType item=new ItemType();
		System.out.println("Enter the details of item in type 1");
		String name;
		double deposits;
		double costper_day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Name: ");
		name=sc.nextLine();
		list.add(name);
		item.setName(name);
		System.out.println("Deposits: ");
		deposits=sc.nextDouble();
		list.add(deposits);
		item.setDeposits(deposits);
		System.out.println("costper_day:");
		costper_day=sc.nextDouble();
		list.add(costper_day);
		item.setCostper_day(costper_day);
		System.out.println("Do you want to continue? (Y/N)");
		String b=sc.nextLine();	
		String c=sc.nextLine();
		list.add(item);
		list.add(item.getName());
		list.add(item.getDeposits());
		list.add(item.getCostper_day());
		if(c.equals("y"))
		
		{
			item=new ItemType();
			System.out.println("enter the  name 2");
			name=sc.nextLine();
			list.add(name);
			item.setName(name);
			System.out.println("deposits: ");
			deposits=sc.nextDouble();
			System.out.println("costper_day");
			costper_day=sc.nextDouble();
			
			list.add(item);
			list.add(item.getName());
			list.add(item.getCostper_day());
			list.add(item.getDeposits());
		}
		System.out.println(list);
	}
}
			
		
		