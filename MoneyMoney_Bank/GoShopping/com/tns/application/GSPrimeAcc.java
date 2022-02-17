package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

	private static final float charges=0; 
	
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime=" + isPrime() + ", accNo=" + accNo + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
