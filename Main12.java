package com.kk;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		
			ArrayList<Object> a=new ArrayList<Object>();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of halls");
            int b=sc.nextInt();
    		System.out.println("Enter the Hall name 1");
    		String hall1=sc.nextLine();
    		a.add(hall1);
    		System.out.println("Enter the hall number 2");
    		String hall2=sc.nextLine();
    		a.add(hall2);
            System.out.println("Enter the hall number 3");
    		String hall3=sc.nextLine();	
    		a.add(b);
    		a.add(hall1);
    		a.add(hall2);
    		a.add(hall3);
    		System.out.println("Enter the hall to be searched");
    	    String c=sc.nextLine();
    		if(a.contains(c))
    		{
    			System.out.println("The respective hall found in the list at position of " +(a.indexOf(c)));
    			
    		}
    		else
    		{
    			System.out.println("Hall not found");
    		}
    		
    	}
    
    			
            
	}


