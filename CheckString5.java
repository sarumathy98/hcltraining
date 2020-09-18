package com.kk;
import java.util.*;

public class CheckString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the humpty's Statement");
		String s=sc.nextLine();
		System.out.println("Enter the Dumpty's Statement");
		String s1=sc.nextLine();
		int count=0;
		int count1=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' '&& Character.isLetter(s.charAt(i+1)) && (i>0))
			{
				count++;
			}
		}
		for(int j=0;j<s1.length()-1;j++)
		{
			if(s1.charAt(j)==' '&& Character.isLetter(s1.charAt(j+1)) && (j>0))
			{
				count1++;
			}
		}
		if(count==count1)
		{
			System.out.println("Both are equal");
		}
		else if(count>count1)
		{
			System.out.println("Humpty has used more words");
		}
		else
		{
			System.out.println("Dumpty has used more words");
		}
				

	}

}
