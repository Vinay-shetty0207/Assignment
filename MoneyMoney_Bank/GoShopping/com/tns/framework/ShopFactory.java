package com.tns.framework;

public abstract class ShopFactory 
{

	public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges);
}
