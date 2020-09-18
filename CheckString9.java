package com.kk;
import java.io.*;
import java.lang.*;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			int location;
			System.out.println("Enter the location");
			 location=sc.nextInt();
			System.out.println("What humpty want to add?");
			String s1=sc.nextLine();
			StringBuffer s2=new StringBuffer(s);
			s2.insert(location+1, s1);
			System.out.println("Dumpty's new Statement: "+s);
		}

	


	}


