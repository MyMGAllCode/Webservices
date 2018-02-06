package com.nt.client.service;

public class EMIDetails {
	private double amt;
	private int time;
	private String bank;
	private double interestrate;
	private double emi;
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
	public double getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	@Override
	public String toString() {
		return "EMIDetails [amt=" + amt + ", time=" + time + ", bank=" + bank + ", interestrate=" + interestrate
				+ ", emi=" + emi + "]";
	}

}
