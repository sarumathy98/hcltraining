package com.hcl;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("choose stall type:");
		System.out.println("1.Gold Stall");
		System.out.println("2.Premium Stall");
		System.out.println("3.Executive Stall");
		int choice;
		choice=sc.nextInt();
	    if(choice==1)
	    {
	    	System.out.println("Enter the stall details");
	        System.out.println("Stall Name: ");
	        String stall_name=sc.nextLine();
	        System.out.println("cost: ");
	        int cost=sc.nextInt();
	        System.out.println("Owner Name:");
	        String own_name=sc.nextLine();
	        System.out.println("Number of Screen");
	        int num_screen=sc.nextInt();
	        Stall s=new GoldStall(stall_name,own_name,cost,num_screen);
	        s.display();
	    }
	        else if(choice==2)
	        {
	        	System.out.println("Enter the stall details");
	            System.out.println("stallname:");
	            String stall_name=sc.nextLine();
	            System.out.println("cost:");
	            int cost=sc.nextInt();
	            System.out.println("ownername:");
	            String own_name=sc.nextLine();
	            System.out.println("sets:");
	            int projector=sc.nextInt();
	            Stall s=new PremiumStall(stall_name,own_name,cost,projector);
	            s.display();
	        }
	        else if(choice==3)
	        {
	        	System.out.println("Enter the stall details");
	            System.out.println("Stall Name:");
	            String stall_name=sc.nextLine();
	            System.out.println("cost:");
	            int cost=sc.nextInt();
	            System.out.println("Owner Name:");
	            String own_name=sc.nextLine();
	            System.out.println("Number of Screen");
	            int tv_screen=sc.nextInt();
	            Stall s=new ExecutiveStall(stall_name,own_name,cost,tv_screen);
	            s.display();
	        }

	    }
	


	}


