package com.kk;


	public class CurrentAccount extends Account
	{
		private String TIN_num;
		public CurrentAccount(String acc_name,String acc_num,String bank_name,String Tin_num)
		{
			super(acc_name,acc_num,bank_name);
			this.TIN_num=Tin_num;
		}
		public String getTIN_num(String Tin_num)
		{
			return TIN_num;
			
		}
		public void setTIN_num(String TIN_num)
		{
			this.TIN_num=TIN_num;
		}
		protected void display()
		{
			System.out.println("Account Number: " +super.acc_num);
			System.out.println("Account Name: " +super.acc_name);
			System.out.println("Bank Name: " +super.bank_name);
			System.out.println("Tin Number: " +TIN_num);
			
		}
	}

				


