package ashwin;
import java.util.*;
public class Twodim {
	public static void main(String[] args) {
		int[][] a = {{5,45,78},{56,74,58},{2,90,34}};
		 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				for (int k = 0; k < a.length; k++) {
					for (int l = 0; l < a[i].length; l++) {
						if(a[k][l] > a[i][j]) {
							int temp = a[k][l];
							a[k][l] = a[i][j];
							a[i][j] = temp;
					}
					
				}
				
			}
			
		}
		
		}
		for (int i = 0;  i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
