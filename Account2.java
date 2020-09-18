package com.kkkk;

public class Account {
	protected String acc_name;
	protected String acc_num;
	protected Double bal;
	public Account(String acc_name,String acc_num,Double bal)
	{
		super();
		this.acc_name=acc_name;
		this.acc_num=acc_num;
		this.bal=bal;
	}
	
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(String acc_num) {
		this.acc_num = acc_num;
	}
	public Double getBal() {
		return bal;
	}
	public void setBal(Double bal) {
		this.bal = bal;
	}
}
