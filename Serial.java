package org.kalees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable{
	int a;
	String name;
	Student(int a,String name){
		this.name= name;
		this.a = a;
	}
}
public class Serial {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		FileOutputStream a = new FileOutputStream("C:\\Users\\User\\Documents\\Ashwin.txt");
		ObjectOutputStream o = new ObjectOutputStream(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the objects you want");
	    String name =sc.nextLine();
	    int a1 = sc.nextInt();
		Student s = new Student(a1,name);
		o.writeObject(s);
		o.flush();
		o.close();
		FileInputStream b = new FileInputStream("C:\\Users\\User\\Documents\\Ashwin.txt");
		ObjectInputStream o1 = new ObjectInputStream(b);
		Object r = (Object)o1.readObject();
	
		
		

	}

}
