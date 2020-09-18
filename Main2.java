package com.kk;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the details");
			System.out.println("Enter the name");
			String name=sc.nextLine();
			System.out.println("Enter the deposists");
			Double deposits=sc.nextDouble();
		    System.out.println("Enter the costper Show");
		    Double cost_pershow=sc.nextDouble();
		    Item a=new Item();
		    a.setName(name);
		    a.setDeposits(deposits);
		    a.setCost_pershow(cost_pershow);
		}
		catch(NumberFormatException nfe)
		
		{
		System.out.println("java.lang.NumberFormatException");	
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
