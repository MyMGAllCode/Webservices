package com.nt.bo;

import java.io.Serializable;

public class GetEMIBO implements Serializable {

	private double amt;
	private int time;
	private String bank;
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	

}
