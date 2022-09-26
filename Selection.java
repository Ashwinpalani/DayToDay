package ashwin;

import java.util.Scanner;

public class Selection {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
	    int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = s.nextInt();
		}
		Sort(arr);
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}

	static void Sort(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]>arr[i])
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
		    }
	}	
		
	}

}
	static void insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];  
		     int   j = i - 1;  
		  
		        while(j>=0 && temp <= arr[j]) 
		        {		        {    
		            arr[j+1] = arr[j];     
		            j = j-1;    
		        }    
		        arr[j+1] = temp;    
		    }  
		}  
			
		}
	}
