package ashwin;
import java.util.*;
public class IntegerPalindrome 
{
public static void main(String[] args)
{
	while(true) {
		Scanner sc = new Scanner(System.in);
		int value = sc. nextInt();
		palindrome(value);
	}
}
static void palindrome(int value)
{
	int temp = value;
	int rem =0,a;
	while(value > 0)
	{
		a = value%10;
		rem = (rem*10)+a;
		value = value / 10;
		
	}
	if(temp == rem)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
}
}
