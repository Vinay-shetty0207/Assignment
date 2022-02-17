package com.tns.Framework;

public abstract class BankAcc
{
	protected int accNo;
	private String accNm;
	protected float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	 public void withdraw(float amount) 
	 {
		 
	 }
	 public void deposite(float amount)
	 {
		 accBal=accBal+amount;
		 System.out.println("transaction successfully completed");
		 
	 }
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	
	 
}
