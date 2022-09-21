package ashwin;
import java.util.*;
public class Binarys 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(bin(arr,a));

	}
	static int bin(int []arr,int a) 
	{
		 int begin = 0;
		 int end = arr.length-1;
	
		 
		while(a > 0)
		{	 
			int mid = (begin + end)/2;
			if(arr[mid] == a)
				return mid+1;
			else if(arr[mid] > a)
				end = mid - 1;
			else if(arr[mid] < a)
				begin = mid + 1;
		}
		return -1;
		 
	 
	}
}
