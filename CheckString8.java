package com.kk;
import java.util.*;

public class CheckString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("What humpty want to remove?");
		String s1=sc.nextLine();
		s=s.replaceAll(s1," ");
		System.out.println("Dumpty's new Statement: "+s);
	}

}
