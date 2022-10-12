package org.kalees;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		FileOutputStream file3 = new FileOutputStream("C:\\Users\\User\\Documents\\Ashwin516.txt");
		String s = "Java";
		file3.write(s.getBytes());
		file3.flush();
		FileInputStream fin = new FileInputStream("C:\\Users\\User\\Documents\\Ashwin516.txt");
		int a = 0;
		while ((a = fin.read()) != -1) {
			System.out.print("1"+(char) a);
		}
		FileInputStream fin1 = new FileInputStream("C:\\Users\\User\\Documents\\Ashwin516.txt");
		BufferedInputStream b = new BufferedInputStream(fin1);
		byte[] bi = new byte[b.available()];
		b.read(bi);
		System.out.println();
		for (byte c : bi) {
			System.out.print((char) c);
		}

		FileOutputStream file = new FileOutputStream("C:\\Users\\User\\Documents\\Ashwin516.txt");
		BufferedOutputStream output = new BufferedOutputStream(file);
		s = "ma34589686va";
		byte[] array = s.getBytes();
		output.write(array);
		output.close();

	}

}
