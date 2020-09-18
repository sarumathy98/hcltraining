package com.kk;
import java.util.*;

public class CheckString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the humpty's Statement");
		String s=sc.nextLine();
		System.out.println("Word to replace");
		String a=sc.nextLine();
		System.out.println("Synonym");
		String b=sc.nextLine();
		System.out.println(s.replace(a,b));
		

	}

}
