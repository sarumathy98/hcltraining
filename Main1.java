package com.kkk;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		int cost;
        int n;
		 int cost_day=0;
		 Scanner sc=new Scanner(System.in);
		 cost=sc.nextInt();
		 n=sc.nextInt();
		 
	 try
	 {
		 cost_day=cost/n;
		 System.out.println(+cost_day);
	}
	
	 catch(ArithmeticException ae)
		{
		System.out.println("java.util.ArithmeticException");
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		}

	


	}


