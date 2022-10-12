package org.kalees;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileCreation2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Documents\\Demo2.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\User\\Documents\\Demo3.txt");
		ByteArrayOutputStream bou=new ByteArrayOutputStream();
		String name="Kaleeswaran";
		bou.write(name.getBytes());
		bou.writeTo(fout);
		bou.writeTo(fout2);
		FileInputStream fin = new FileInputStream("C:\\Users\\User\\Documents\\Demo2.txt");
		FileInputStream fin2 = new FileInputStream("C:\\Users\\User\\Documents\\Demo3.txt");
		SequenceInputStream s = new SequenceInputStream(fin, fin2);
		int j=0;
		while((j=s.read())!=-1) {
			System.out.print((char)j);
		}
		byte[] by= {12,56,43,6};
		ByteArrayInputStream by1= new ByteArrayInputStream(by);
		System.out.println();
		while((j=by1.read())!=-1) {
		System.out.println(j);
		}
		FileOutputStream fout3 = new FileOutputStream("C:\\Users\\User\\Documents\\Demo2.txt");
		DataOutputStream d=new DataOutputStream(fout3);
		d.writeChars("kalees");
		FileInputStream fin3 = new FileInputStream("C:\\Users\\User\\Documents\\Demo2.txt");
		DataInputStream d2=new DataInputStream(fin3);
		System.out.println(d2.readLine());
		System.out.println(d2.readLine());
		
	}

}
