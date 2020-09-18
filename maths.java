package com.akk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape s=new Shape();
		Cirlce s1=new Cirlce();
		Rectangle s2=new Rectangle();
		Triangle s3=new Triangle();
		System.out.println("Enter the Shapes");
		System.out.println("1.Circle\r\n" + "2.Rectangle\r\n" + "3.Triangle\r\n"+ "");
		int n=sc.nextInt();
		Double r,l,b,h,base;
		switch(n)
		{
		case 1:
			System.out.println("Enter the radius");
			r=sc.nextDouble();
			s1.computeArea(r);
			break;
		case 2:
			System.out.println("Enter the length and breadth");
			l=sc.nextDouble();
			b=sc.nextDouble();
			s2.computeArea(l,b);
			break;
		case 3:
			System.out.println("Enter the height and base");
			h=sc.nextDouble();
			base=sc.nextDouble();
			s3.computeArea(h,base);
			break;
			
		}
		
		

	}

}
