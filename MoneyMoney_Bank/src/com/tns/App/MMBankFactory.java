package com.tns.App;

import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		
		return  new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		
		return new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
	}

	@Override
	public String toString() {
		return "MMBankFactory [toString()=" + super.toString() + "]";
	}
	
	
}