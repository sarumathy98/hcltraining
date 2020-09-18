package com.kkkk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		String a;
		a=sc.nextLine();
		String s[]=a.split(",");
		FixedAccount f=new FixedAccount(s[0],s[1],s[2],s[3],s[4]);
		f.display();
	
		}
}
