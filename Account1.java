package com.kk;
public class Account {
	protected String acc_name;
	protected String acc_num;
	protected String bank_name;
	
	
		public Account(String acc_name,String acc_num,String bank_name)
		{
		super();
		this.acc_name=acc_name;
		this.acc_num=acc_num;
		this.bank_name=bank_name;
}
			public String getacc_name()
			{
				return acc_name;
			}
			public void setacc_name(String acc_name)
			{
				this.acc_name=acc_name;
			}
			public String getacc_num()
			{
				return acc_num;
			}
			public void setacc_num(String acc_num)
			{
				this.acc_num=acc_num;
			}
			public String getbank_name()
			{
				return bank_name;
			}
			public void setbank_name(String bank_name)
			{
			this.bank_name=bank_name;	
			}
}
