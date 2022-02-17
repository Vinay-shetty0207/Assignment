package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{

	
	private boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime() + ", accNo=" + accNo + ", accNm=" + getAccNm() + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	
}
