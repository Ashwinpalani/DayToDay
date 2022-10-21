package org.kalees;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class NumberTable {

	static Properties p = new Properties();
	static FileReader file;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		file = new FileReader("C:\\Users\\User\\eclipse-workspace\\OperationAK\\src\\Tables.properties");
		p.load(file);
		System.out.println("Enter the table you want:");
		int a = sc.nextInt();
		System.out.println("Enter how many multiplies you want:");
		int n = sc.nextInt();
		Calculation.multiplies(a, n);
		Set<Object> keySet = p.keySet();
		for (Object object : keySet) {
			System.out.println(p.getProperty((String) object) + "=" + object);
		}
	}

	class Calculation {

		static public void multiplies(int a, int n) throws FileNotFoundException, IOException {
			System.out.println("*****Table Calculation using Array*******");
			int result[] = new int[n];
			for (int i = 0; i < n; i++) {
				result[i] = a * (i + 1);
				System.out.println((i + 1) + " * " + a + " = " + result[i]);
			}
			System.out.println(Arrays.toString(result));
			aListMethod(result, n, a);

		}

		static public void aListMethod(int[] result, int n, int a) throws FileNotFoundException, IOException {
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

		static public void hTableMetod(ArrayList<Integer> a1, int n, int a) throws FileNotFoundException, IOException {
			System.out.println("*****Table Calculation using HashTable*******");
			Hashtable<Integer, Integer> h1 = new Hashtable<>();
			for (int i = 0; i < n; i++) {
				h1.put(i + 1, a1.get(i));
				System.out.println((i + 1) + " * " + a + " = " + h1.get(i + 1));

			}
			System.out.println(h1);
			hMapMethod(h1, n, a);

		}

		static private void hMapMethod(Hashtable<Integer, Integer> h1, int n, int a)
				throws FileNotFoundException, IOException {
			System.out.println("*****Table Calculation using HashMap*******");
			HashMap<Integer, Integer> h2 = new HashMap<>(h1);
			for (int i = 0; i < n; i++) {
				System.out.println((i + 1) + " * " + a + " = " + h2.get(i + 1));

			}
			System.out.println(h2);
			for (Entry<Integer, Integer> entry : h2.entrySet()) {
				String s1 = a + " * " + String.valueOf(entry.getKey());

				System.out.println();
				p.setProperty(String.valueOf(entry.getValue()), s1);
				p.store(new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\OperationAK\\src\\Tables.properties"),
						null);
			}

		}
	}

}
