package ashwin;

import java.util.Scanner;
import java.util.Vector;

public class Products {
	static Vector<String> pdt;
	static Vector<Integer> Qnty;
	static Scanner sc = new Scanner(System.in);

	static void buy() {
		System.out.println("Enter the Product you want:");
		String a = sc.next();
		if (pdt.contains(a)) {
			System.out.println("Enter the quantity you want:");
			int b = sc.nextInt();
			int index = pdt.indexOf(a);
			int count = (Qnty.get(index)) - b;
			if (count > 0) {
				Qnty.set(index, count);
				System.out.println(a + " is purchased");
				System.out.println("Do you want to continue the Purchase Enter \n1.Yes\n2.No");
				int last = sc.nextInt();
				if (last == 1) {
					buy();
				} else {
					System.out.println("*****************Thank you******************");
				}
			} else {
				System.out.println("****************Not Enough products************");
				System.out.println("Available Quantity for " + a + " is : " + Qnty.get(index));
				buy();
			}

		} else {
			System.out.println("**********Enter valid Product***********");
			buy();
		}
	}

	static void sell() {
		System.out.println("Enter the Product ");
		String a = sc.next();
		System.out.println("Enter the quantity you want to add:");
		int b = sc.nextInt();
		int index = pdt.indexOf(a);
		int count = (Qnty.get(index)) + b;
		Qnty.set(index, count);
		System.out.println("Quantity for " + a + " is added");
		System.out.println("Current Quantity for " + a + " is " + count);
	}

	public static void main(String[] args) {
		pdt = new Vector<>();
		pdt.add("Watches");
		pdt.add("Pen");
		pdt.add("Shoes");
		pdt.add("Tshirts");
		pdt.add("Pants");
		pdt.add("Books");
		pdt.add("Wallets");
		pdt.add("Headphones");
		pdt.add("Laptops");
		pdt.add("Mobiles");
		Qnty = new Vector<>();
		Qnty.add(10);
		Qnty.add(15);
		Qnty.add(5);
		Qnty.add(16);
		Qnty.add(25);
		Qnty.add(34);
		Qnty.add(23);
		Qnty.add(35);
		Qnty.add(21);
		Qnty.add(7);
		System.out.println("**********************Welcome********************");
		System.out.println(Products.pdt);
		System.out.println("Enter Number \n1.Buy\n2.Sell");
		welcome();

	}

	static void welcome() {
		int choice = sc.nextInt();
		if (choice == 1) {
			buy();
		} else if (choice == 2) {
			sell();
		} else {

			System.out.println("************Enter Valid option**********");
			welcome();
		}
	}

}
