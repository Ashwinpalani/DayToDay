package ashwin;

import java.util.Scanner;

public class BubbleSort {
	static void Sort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1; j < arr.length - i; j++) 
			{
			  if(arr[j-1] > arr[j])
			  {
				  int temp = arr[j-1];
				  arr[j-1] = arr[j];
				  arr[j] = temp;
			  }
			} 
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
	    int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = s.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

}
