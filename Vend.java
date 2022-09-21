package ashwin;
import java.util.*;
public class Vend 
{
	static Scanner sc = new Scanner(System.in);
	static String name[] = {"A1", "A2", "A3", "A4",
			 "B1", "B2", "B3", "B4",
			 "C1", "C2", "C3", "C4",
			 "D1", "D2", "D3", "D4"};
	static  int rate[] = {10, 20, 10, 30,
			20, 10, 30, 20,
			30, 20, 10, 30,
			20, 10, 10, 40};
	static int Amount;
	public static void main(String[] args)
	{
		System.out.println("Enter the Amount : ");
		Amount = sc.nextInt();
		if(Amount < rate[0])
		{
			System.out.println("Insufficient Balance");
			return;
		}
		while(Amount > 0) 
		{
			displayProducts();
			getItem();
		}
		
	}
	
	static public void displayProducts() 
	{
		System.out.println("-----Please enter items given below-------");
		System.out.println("********************************************");
		for(int i=0; i<name.length; i++)
		{
			if(rate[i]<=Amount)
			{
				System.out.println(name[i]+" Price is $ :"+ rate[i]);
			}
		}
	}
	
	static public void getItem()
	{
		System.out.println("Enter the item you want : ");
		String Item = sc.next();
		for(int i=0; i<name.length ; i++)
		{
			if(name[i].equals(Item) && rate[i]<= Amount)
			{
				Amount -= rate[i];
				System.out.println("Your account is : "+Amount);
				return;
			}
		}
		System.out.println("Item not found!");
	}
}
