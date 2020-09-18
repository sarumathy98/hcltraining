package com.code3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		        String a;
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the players details: ");
				a=sc.nextLine();
				String det[]=a.split(",");
				String name=det[0];
				String country=det[1];
				String skill=det[2];
				Players play=new Players(name,country,skill);
		        
				System.out.println("Player Details");
				System.out.println("Player Name: "  +play.getName());
				System.out.println("Player Country: "  +play.getCountry());
				System.out.println("Player Skill: " +play.getskill());
				
				

	}

}
