package com.kk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Choose the Account type");
		  System.out.println("1.Current Account");
		  System.out.println("2.Savings Account");
		  choice=sc.nextInt();
		  sc.nextLine();
		  String Acc_type;
		  Acc_type=sc.nextLine();
		  String a[]=Acc_type.split(",");
		  if (choice==1)
		  {
			  CurrentAccount c=new CurrentAccount(a[0],a[1],a[2],a[3]);
			  c.display();
			  
		  }
		  else if(choice==2)
		  {
			  SavingAccount s=new SavingAccount(a[0],a[1],a[2],a[3]);
			  s.display();
			  
		  }
		  
	

	}

}
