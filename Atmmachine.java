package org.prog;

import java.util.*;
import java.util.HashMap;

public class Atmmachine {
	static Scanner sc;
	static Map<Integer, Integer> pin = new HashMap<>();
	static int withdraw;

	static void Check_pin(int pins) {

		if (pin.containsKey(pins)) {
			System.out.println("****************Menu****************");
			System.out.println("1.Cash Withdrawal\n2.Balance Enquiry\n3.Fast Cash");
			int service = sc.nextInt();
			switch (service) {
			case 1:
				withdraw(pins);
				break;
			case 2:
				Balance_enquiry(pins);
				break;
			case 3:
				fastCash(pins);
				break;
			default:
				System.out.println("Invalid number");
				System.out.println("Enter Again");
				Check_pin(pins);
				break;
			}
		}
	}

	static void withdraw(int pins) {

		System.out.println("Enter the amount your want:");
		int amount = sc.nextInt();
		if (amount <= pin.get(pins)) {
			System.out.println("Transaction is processing......");
			System.out.println("Take your cash");
			System.out.println("Do you want to check your balance \n1.yes\n2.No");
			int a = sc.nextInt();
			if (a == 1) {
				Main_Bal(amount, pin.get(pins));
			} else {
				System.out.println("Your Transaction is completed");
				System.out.println("****************Thank you******************");
			}

		} else {
			System.out.println("Insufficient Balance");
		}

	}

	static void Balance_enquiry(int pins) {

		System.out.println("Main balance: " + pin.get(pins));
	}

	static void Main_Bal(int withdraw, int amount) {

		System.out.println("After withdrawing cash the Main balance: " + (amount - withdraw));
	}

	static void fastCash(int pins) {
		System.out.println("1.500\n2.1000\n3.2000\n4.5000");
		int i = sc.nextInt();
		int b[]= {500,1000,2000,5000};
		int instantcash=b[i-1];
		if (instantcash <= pin.get(pins)) {
			System.out.println("Transaction is processing......");
			System.out.println("Take your cash");
			System.out.println("Do you want to check your balance 1.yes\n2.No");
			int a = sc.nextInt();
			if (a == 1) {
				Main_Bal(instantcash, pin.get(pins));
			} 
			else {
				System.out.println("Your Transaction is completed");
				System.out.println("****************Thank you******************");
			}

		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public static void main(String[] args) {
		System.out.println("********************Welcome***********************");
		System.out.println("********************AK bank***********************");
		pin.put(2001, 12000);
		pin.put(2002, 17000);
		pin.put(2003, 1205);
		pin.put(2004, 4623);
		pin.put(2005, 1000);
		pin.put(2006, 1600);
		pin.put(2007, 12000);
		sc = new Scanner(System.in);
		System.out.println("Please enter the Pin:");
		int pins = sc.nextInt();
		Check_pin(pins);
	}

}
