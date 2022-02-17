package com.tns.Client;

import java.util.Scanner;

import com.tns.App.MMBankFactory;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	private static BankFactory factory;
	private static SavingAcc savingAcc;
	private static CurrentAcc currentAcc;

	public static void main(String[] args) {
		
		int accNumber =0;
		String accName ="";
		float  accBalance = 0.0f;
		boolean isSalary ;
		int withDrawAmt =0;
		float CreditLimit=500;
		

		factory = new MMBankFactory();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the Account number");
		accNumber = sc.nextInt();
		System.out.println("enter the accName");
		accName = sc.next();
		System.out.println("enter the accBal");
		accBalance = sc.nextFloat();
		System.out.println("enter the isSalary");
		isSalary = sc.nextBoolean();
		System.out.println("enter the withdraw amount");
		withDrawAmt = sc.nextInt();
		 
		savingAcc = factory.getNewSavingAccount(accNumber, accName, accBalance, isSalary);
		savingAcc.withdraw(withDrawAmt);
		System.out.println("Your Account balance is "+savingAcc.getAccBal());

		currentAcc = factory.getNewCurrentAccount(accNumber, accName, accBalance, CreditLimit);
		currentAcc.withdraw(withDrawAmt);
		System.out.println("Your Account balance is "+currentAcc.getAccBal());
		
		System.out.println(currentAcc.toString());
		System.out.println(savingAcc.toString());
	}

}