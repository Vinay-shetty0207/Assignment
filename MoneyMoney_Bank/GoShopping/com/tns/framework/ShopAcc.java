package com.tns.framework;

public abstract class ShopAcc 
{

	protected int accNo;
	private String accNm;
	protected float charges;
	
	public ShopAcc(int accNo, String accNm, float charges)  
	{
		super();
		this.accNo = accNo;
		this.setAccNm(accNm);
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		
	}
	public void items(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	
}
