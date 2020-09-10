package com.blower;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Long over,balls,runs;
		String  batsman_name,bowler_name,nonstriker_name;
		 Delivery d=new Delivery();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the over");
		over=sc.nextLong();
		System.out.println("Enter the ball");
		balls=sc.nextLong();
		System.out.println("Enter the runs");
		 runs=sc.nextLong();
		 System.out.println("Enter the batsman name");
		 batsman_name=sc.nextLine();
         System.out.println("Enter the bowler name");
         bowler_name=sc.nextLine();
         System.out.println("Enter the nonstriker_name");
         nonstriker_name=sc.nextLine();
        
         d.setOver(over);
         d.setBalls(balls);
         d.setRuns(runs);
         d.setBatsman_name(batsman_name);
         d.setBowler_name(bowler_name);
         d.setNonstriker_name(nonstriker_name);
         d.displayDeliveryDetails();
     
		

	}

}
