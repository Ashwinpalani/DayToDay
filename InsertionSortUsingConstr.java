package ashwin;

import java.util.Scanner;

public class InsertionSortUsingConstr {
	InsertionSortUsingConstr(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];  
		     int   j = i - 1;  
		  
		        while(j>=0 && temp <= arr[j]) 
		        {		          
		            arr[j+1] = arr[j];     
		            j = j-1;    
		        }    
		        arr[j+1] = temp;   
		}
	
	}
	
		

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		InsertionSortUsingConstr sort = new InsertionSortUsingConstr(arr);
        for(int i=0 ; i<arr.length; i++)
		{
		System.out.println(arr[i]);
	    }
	}

}
