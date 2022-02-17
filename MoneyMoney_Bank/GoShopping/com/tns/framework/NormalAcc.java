package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {

	private final float deliveryCharge;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {

	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + getAccNm()
				+ ", charges=" + charges + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
