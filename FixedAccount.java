package com.kkkk;

public class FixedAccount extends SavingAccount {
	
		int period;
		public FixedAccount(String acc_name,String acc_num,String bal,String min_bal,String period)
		{
			super(acc_name,acc_num,bal,min_bal);
			this.period=period;
		}
		public int getperiod()
		{
			return period;
		}
		public void setPeriod(String period)
		{
			this.period=period;
		}
		protected void display()
		{
			System.out.println(super.acc_name);
			System.out.println(super.acc_name);
			System.out.println(super.bal);
			System.out.println(super.min_bal);
			System.out.println(period);
		}
		
	}
	


