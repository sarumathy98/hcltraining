package com.code2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Venue v=new Venue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the city");
		String city=sc.nextLine();
		v.setName(name);
		v.setCity(city);
		System.out.println("Venue details");
		System.out.println("Venue Name: "+v.getName());
		System.out.println("Venue City: "+v.getCity());
		
		

	}

}
