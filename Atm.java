package org.ashwin;
//Atm machine using overloading,overriding and overhiding concepts

import java.util.*;
import java.util.HashMap;

class Atm2 {
	public void withdraw(int pins) {
		System.out.println("1.500\n2.1000\n3.2000\n4.5000");
		int i = Atm.sc.nextInt();
		int b[] = { 500, 1000, 2000, 5000 };
		int instantcash = b[i - 1];
		if (instantcash <= Atm.pin.get(pins)) {
			System.out.println("Transaction is processing......");
			System.out.println("Take your cash");
			System.out.println("Do you want to check your balance 1.yes\n2.No");
			int a = Atm.sc.nextInt();
			if (a == 1) {
				Atm.key.Main_Bal(instantcash, Atm.pin.get(pins));
			} else {
				System.out.println("Your Transaction is completed");
				System.out.println("****************Thank you******************");
			}

		} else {
			System.out.println("Insufficient Balance");
		}
	}
}

public class Atm extends Atm2 
{
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, Integer> pin = new HashMap<>();
	static int withdraw;
	static Atm key;
	static Atm2 key2;

	public void withdraw(int pins) {

		System.out.println("Enter the amount your want:");
		int amount = sc.nextInt();
		if (amount <= pin.get(pins)) {
			System.out.println("Transaction is processing......");
			System.out.println("Take your cash");
			System.out.println("Do you want to check your balance \n1.yes\n2.No");
			int a = sc.nextInt();
			if (a == 1) {
				key.Main_Bal(amount, pin.get(pins));
			} else {
				System.out.println("Your Transaction is completed");
				System.out.println("****************Thank you******************");
			}

		} else {
			System.out.println("Insufficient Balance");
		}

	}

	public void Main_Bal(int withdraw, int amount) {

		System.out.println("After withdrawing cash the Main balance: " + (amount - withdraw));
	}

	public void Main_Bal(int pins) {

		System.out.println("Main balance: " + pin.get(pins));
	}

	public static void main(String[] args) {
		key = new Atm();
		key2 = new Atm2();
		System.out.println("********************Welcome***********************");
		System.out.println("********************AK bank***********************");
		pin.put(2001, 12000);
		pin.put(2002, 17000);
		pin.put(2003, 1205);
		pin.put(2004, 4623);
		pin.put(2005, 1000);
		pin.put(2006, 1600);
		pin.put(2007, 12000);
		
		System.out.println("Please enter the Pin:");
		int pins = sc.nextInt();
		Check_pin(pins);
		
		}
	static void Check_pin(int pins) {
		if (pin.containsKey(pins)) {
			System.out.println("****************Menu****************");
			System.out.println("1.Cash Withdrawal\n2.Balance Enquiry\n3.Fast Cash");
			int service = sc.nextInt();
			switch (service) {
			case 1:
				key.withdraw(pins);
				break;
			case 2:
				key.Main_Bal(pins);
				break;
			case 3:
				key2.withdraw(pins);
				break;
			default:
				System.out.println("Invalid number");
				System.out.println("Enter Again");
				 Check_pin(pins);
				break;
			}
	
	}
	}
}

