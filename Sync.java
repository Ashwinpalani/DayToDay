package ashwin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sync extends Multi {

	synchronized public void display(ArrayList a, Map<String, Integer> sp) {

		for (Object x : a) {
			if (sp.containsKey(x)) {
				System.out.println(x + " Rs." + sp.get(x));
			}
		}

	}

}

class Dairy extends Thread {
	Sync s = new Sync();

	public void run() {
		
		s.display(s.a, s.sp);
		System.out.println("***************Dairy items************");
	}
}

class Biscuit extends Thread {
	Sync s1 = new Sync();

	public void run() {
		
		s1.display(s1.a, s1.sp1);
		System.out.println("***************Biscuit items************");
	}
}

class Cakes extends Thread {
	Sync s1 = new Sync();

	public void run() {
		
		s1.display(s1.a, s1.sp2);
		System.out.println("***************Cake items************");
	}
}

class Puffs extends Thread {
	Sync s1 = new Sync();

	public void run() {
		
		s1.display(s1.a, s1.sp3);
		System.out.println("***************Puff items************");
	}
}

class Multi {
	static ArrayList<String> a;
	static String item;
	static Map<String, Integer> sp;
	static Map<String, Integer> sp1;
	static Map<String, Integer> sp2;
	static Map<String, Integer> sp3;

	public static void main(String args[]) {
		sp = new HashMap<>();
		sp.put("Tea", 10);
		sp.put("Coffee", 20);
		sp.put("Boost", 30);
		sp.put("Horlicks", 40);

		sp1 = new HashMap<>();
		sp1.put("50-50", 15);
		sp1.put("Mariegold", 20);
		sp1.put("MilkB", 30);
		sp1.put("Parle", 40);

		sp2 = new HashMap<>();
		sp2.put("Straberry", 15);
		sp2.put("ButterScotch", 20);
		sp2.put("Choco", 30);
		sp2.put("Blackforest", 40);

		sp3 = new HashMap<>();
		sp3.put("Eggpuff", 15);
		sp3.put("Vegpuff", 20);
		sp3.put("Chickenpuff", 30);
		sp3.put("Musroompuff", 25);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items ");
		int n = sc.nextInt();
		System.out.println("Enter the products you want:");
		Dairy t1 = new Dairy();
		Biscuit t2 = new Biscuit();
		Cakes t3 = new Cakes();
		Puffs t4 = new Puffs();
		a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			item = sc.next();
			a.add(item);
		}
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
