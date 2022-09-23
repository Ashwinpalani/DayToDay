package ashwin;

import java.util.*;

public class StringRepeat {

	public static void main(String[] args) {
		String temp = "abccdbabbc";
		char[] result = new char[temp.length()];
		for(int i=0; i<temp.length(); i++)
		{
			if (i == temp.length()-1) {
				result[i] +=temp.charAt(i);
			}
			else {
				int j =i+1;
				if(temp.charAt(i) != temp.charAt(j))
					result[i] += temp.charAt(i);
				 else
				{
					i++;
					j++;
				}
			}			
		}
		String temp1 ="";
		for (int i = 0; i < result.length; i++) {

			if(result[i] != '\u0000') {
				temp1 += result[i];
				System.out.println(result[i]);
			}
		}
		System.out.println(temp1);
	}

}
