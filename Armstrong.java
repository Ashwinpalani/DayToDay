package ashwin;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		ArmStrong(value);
	}

	 static void ArmStrong(int value) {
		 int temp = value;
		 int result = 0,r;
		 int count = 0;
		 while(temp > 0)
		 {
			 r = temp % 10;
			 count++;
			 temp = temp / 10;
		 }
		 temp = value;
		 while(value > 0)
		 {
			r = value % 10;
			result += Math.pow(r, count);
			value = value / 10;
		 }
		 System.out.println(result);
		 if( temp == result)
            System.out.println("Armstrong");
		 else
			 System.out.println("Not a Armstrong");
	}
}
