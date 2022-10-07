package ashwin;

import java.util.Scanner;

public class Multithreading extends Thread {
	int result;
	static int a;
	static int b;

	class m1 extends Thread {

		public void run() {
			result = a * b;
			System.out.println("Multiplication : " + result);
		}
	}

	class m2 extends Thread {
		public void run() {
			result = a / b;
			System.out.println("Division : " + result);
		}
	}

	class m3 extends Thread {
		public void run() {
			result =a - b;
			System.out.println("Subtraction : " + result);
		}
	}

	class m4 extends Thread {
		public void run() {
			result = a + b;
			System.out.println("Addition : " + result);
		}
		
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values a and b :");
		a=s.nextInt();
		b=s.nextInt();
		Multithreading m=new Multithreading();
		m1 n1 = m.new m1();
		m2 n2 = m.new m2();
		m3 n3 = m.new m3();
		m4 n4 = m.new m4();

		System.out.println("Priority of the thread m1 is : " + n1.getPriority());
		System.out.println("Priority of the thread m2 is : " + n2.getPriority());
		System.out.println("Priority of the thread m3 is : " + n3.getPriority());
		System.out.println("Priority of the thread m4 is : " + n4.getPriority());

		n1.setPriority(3);
		n2.setPriority(6);
		n3.setPriority(5);
		n4.setPriority(MAX_PRIORITY);

		System.out.println("Priority of the thread m1 is : " + n1.getPriority());
		System.out.println("Priority of the thread m2 is : " + n2.getPriority());
		System.out.println("Priority of the thread m3 is : " + n3.getPriority());
		System.out.println("Priority of the thread m4 is : " + n4.getPriority());
		n4.start();
		n1.start();
		n2.start();
		n3.start();

	}
}
