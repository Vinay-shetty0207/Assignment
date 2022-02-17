package com.tns.client;
import com.tns.framework.ShopAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.NormalAcc;

class bookProduct
{ 
	public static bookProduct b1;
	float deliveryCharge;
	private bookProduct()
	{
	  System.out.println("instance creation");	//instance creation
	}
	 
	 public static bookProduct getInstance()  
	 {
		 if(b1 == null)
		 {
		 b1= new bookProduct(); 
		 
		 }
		 return b1;
	 }

	@Override
	public String toString() {
		return "bookProduct [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static char[] hasCode() {
		// TODO Auto-generated method stub
		return null;
	}
 	
}

public class Client  {
	
	public static void main(String[] args) {
		bookProduct b1= bookProduct.getInstance();
		System.out.println(bookProduct.hasCode());
		/*
		 * List<float> values = Arrays(30.00f,234.00f,2342.09f,2342.45F);
		 * System.out.println(values.stream());
		 */
        
	}

}

