package com.kkkk;

public class SavingAccount extends Account {
	public Double min_bal;
	public SavingAccount(String acc_name,String acc_num,String bal,String min_bal)
	{
		super(acc_name,acc_num,bal);
		this.min_bal=min_bal;
	}
	public Double getMin_bal() {
		return min_bal;
	}
	public void setMin_bal(Double min_bal) {
		this.min_bal = min_bal;
	}
	
		
		
	}


