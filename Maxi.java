package ashwin;

public class Maxi {
	public static void main(String[] args) {
		int[][] a = {{5,45,78},{56,74,58},{2,90,34}};
		int max = a[0][0];
		int min = a[0][0];
		 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(min > a[i][j])
				{
					min = a[i][j];
				}
				else if(max < a[i][j])
				{
					max = a[i][j];
				}
				
			}
		}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
	}
}
