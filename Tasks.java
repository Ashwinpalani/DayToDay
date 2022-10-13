package ashwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Tasks {
	static void multiplies(int a, int n) {
		System.out.println("*****Table Calculation using Array*******");
		int result[] = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = a * (i + 1);
			System.out.println((i + 1) + " * " + a + " = " + result[i]);
		}
		aListMethod(result, n, a);

	}

	static private void aListMethod(int[] result, int n, int a) {
		System.out.println("*****Table Calculation using ArrayList*******");
		ArrayList<Integer> a1 = new ArrayList();
		int i = 1;
		for (int a2 : result) {
			a1.add(a2);
			System.out.println((i) + " * " + a + " = " + a1.get(i - 1));
			i++;
		}
		System.out.println(a1);
		hTableMetod(a1, n, a);

	}

	static private void hTableMetod(ArrayList<Integer> a1, int n, int a) {
		System.out.println("*****Table Calculation using HashTable*******");
		Hashtable<Integer, Integer> h1 = new Hashtable<>();
		for (int i = 0; i < n; i++) {
			h1.put(i + 1, a1.get(i));
			System.out.println((i + 1) + " * " + a + " = " + h1.get(i+1));

		}
		System.out.println(h1);
		hMapMethod(h1,n,a);

	}

	static private void hMapMethod(Hashtable<Integer, Integer> h1,int n,int a) {
		System.out.println("*****Table Calculation using HashMap*******");
		HashMap<Integer, Integer> h2 = new HashMap<>(h1);
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + " * " + a + " = " + h2.get(i+1));

		}
		System.out.println(h2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want:");
		int a = sc.nextInt();
		System.out.println("Enter how many multiplies you want:");
		int n = sc.nextInt();
		multiplies(a, n);

	}

}
