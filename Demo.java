package ashwin;
import java.util.Scanner;

public class Demo{
	
	static String name[] = {"A1", "A2", "A3", "A4",
			 "B1", "B2", "B3", "B4",
			 "C1", "C2", "C3", "C4",
			 "D1", "D2", "D3", "D4"};
	static int rate[] = {10, 20, 10, 30,
			20, 10, 30, 20,
			30, 20, 10, 30,
			20, 10, 10, 40};
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int walletAmount = sc.nextInt();

		while(walletAmount > 0) {
			System.out.println("Your Wallet Amount : "+walletAmount);
			display(walletAmount);
		
			InnerWhile:
			while(true) {
				System.out.println("Enter Item Name: ");
				String itemName = sc.next();
				int currItemPrice =  getPrice(itemName);
				if( currItemPrice == 0) {
					System.out.println("Item Not Found!");
				}else if(currItemPrice > walletAmount) {
					System.out.println("Insufficient Balance in your Wallet!");
				}else {
					walletAmount -= getPrice(itemName);
					break InnerWhile;
				}
			}
		}
		System.out.println("Your Wallet is Empty! \nThanks for Purchasing");
	}
	
	static void display(int price) {
		for (int i = 0; i < rate.length; i++) {
			if(rate[i] <= price) {
				System.out.println(name[i]+" : $"+rate[i]);
			}
		}
	}
	
	static int getPrice(String itemName) {
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(itemName))
				return rate[i];
		}
		return 0;
	}
}