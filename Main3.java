package com.kk;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the int value");
		int a=sc.nextInt();
		System.out.println("The integr : "+a);
		
	}
catch(InputMismatchException ioe)
	{
	System.out.println("java.util.InputMismatchException");
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
	}

}
