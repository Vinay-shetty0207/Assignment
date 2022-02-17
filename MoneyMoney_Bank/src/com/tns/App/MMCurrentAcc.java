package com.tns.App;

import com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
		//lazy initialization 
		if(amount>getCreditLimit()) {
			System.out.println("Exceeding creditLimit");
		}
		else if(amount> getAccBal()) {
			System.out.println("Insufficient Balance!!!");
		}else {
			try {
			setAccBal(getAccBal()-amount);
			}finally {
			System.out.println("Transaction successfully completed");
			}
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public float getAccBal() {
		// TODO Auto-generated method stub
		return super.getAccBal();
	}

	@Override
	public void setAccBal(float accBal) {
		// TODO Auto-generated method stub
		super.setAccBal(accBal);
	}
	
}