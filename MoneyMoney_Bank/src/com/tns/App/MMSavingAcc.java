package com.tns.App;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static float MINBAL;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
				
		}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
		
		MINBAL=getAccBal();
		if(amount>MINBAL) {
			System.out.println("Insufficient balance!!!");
		}else {
			setAccBal(getAccBal()-amount);
			System.out.println("Transaction successfully completed");
		}
		
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}