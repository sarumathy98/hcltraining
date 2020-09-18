package com.code5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name");
		String n=sc.nextLine();
		System.out.println("Enter the city name");
		String c=sc.nextLine();
		System.out.println("Venue Details");
		Venue v=new Venue();
		v.setName(n);
		v.setCity(c);
		System.out.println("Venue Name: "+v.getName());
		System.out.println("Venue City: "+v.getCity());
		System.out.println("Verify and Update venue details");
		int a;
		do
		{
			System.out.println("Update the venue name");
			System.out.println("Update the city name");
			System.out.println("All information Correct and Exit");
			a=sc.nextInt();
			sc.nextLine();
			switch(a)
			{
			case 1:
			{
				System.out.println("Enter the venue name");
				n=sc.nextLine();
				v.setName(n);
				break;
			}
			case 2:
			{
				System.out.println("Enter the venue city");
				c=sc.nextLine();
				v.setCity(c);;
				break;
			}
			case 3:
			{
				System.out.println("Venue Details");
				System.out.println("Venue Name: "+v.getName());
				System.out.println("Venue City: "+v.getCity());
				break;
			}
				
			
			}
		}
		while(a<=3);
	}
}
			
			
			
		
		
		
		
		
		

	


