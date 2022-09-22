package ashwin;

import java.util.*;

public class Strsort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] str = new String[sc.nextInt()];
		for(int i=0 ; i<str.length; i++)
		{
			str[i] = sc.next(); 
		}
		Arrays.sort(str);
      for (int i = 0; i < str.length; i++) 
      {
		System.out.print(str[i]+" ");
	  }
	}

}
