package com.kk;

public class SavingAccount extends Account {
	String org_name;
	public SavingAccount(String acc_name, String acc_num,String bank_name,String org_name )
	{
	super(acc_name,acc_num,bank_name);
	this.org_name=org_name;
	
	}
	public String getOrg_name()
	{
		return org_name;
	}
	public String setOrg_name(String org_name)
	{
		this.org_name=org_name;
	}
	protected void display()
	{
		System.out.println("Account name: " +super.acc_name);
		System.out.println("Account Number: "+super.acc_num);
		System.out.println("Bank Name: " +super.bank_name);
		System.out.println("Organisation Name:" +org_name);
		
	}

}
