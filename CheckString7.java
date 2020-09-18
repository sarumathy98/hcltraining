package com.ll;
import java.util.*;


public class CheckString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the humpty's Statement");
		String s=sc.nextLine();
		char[] charArray=s.toCharArray();
		for(int i=1;i<charArray.length;i++)
		{
			if(Character.isLetter(charArray[i]))
			{
			if(!Character.isUpperCase(charArray[i]))
			{
				System.out.println("String is not in Upper Case");
			}
			else
			{
				System.out.println("String is in upper case");
			}
			}
		}
	}
}
