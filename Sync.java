package ashwin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sync extends Multi {
	
 synchronized static public void display(ArrayList a,Map<String,Integer> sp )
{ 
	 
	 for (Object x : a) {
		 if (sp.containsKey(x)) {
				System.out.println(x+" Rs."+sp.get(x));
		 }
	}
	 
	
}

}
class Dairy extends Thread
{
	Sync s = new Sync();
	public void run()
	{
		s.display(s.a,s.sp);
	}
}
class Biscuit extends Thread
{
	Sync s1 = new Sync();
	public void run()
	{
	s1.display(s1.a,s1.sp1);	
	}
}
class Multi
{
	static ArrayList<String> a;
	static String item;
	static Map<String,Integer> sp;
	static Map<String,Integer> sp1;
public static void main(String args[])
{
sp = new HashMap<>();
sp.put("Tea",10);
sp.put("Coffee",20);
sp.put("Boost",30);
sp.put("horlicks",40);

sp1 = new HashMap<>();
sp.put("50-50",15);
sp.put("Mariegold",20);
sp.put("MilkB",30);
sp.put("parle",40);

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of items ");
int n = sc.nextInt();
System.out.println("Enter the products you want:");
Dairy t1 = new Dairy();
Biscuit t2 = new Biscuit();
a = new ArrayList<>();
for(int i=0; i<n ; i++)
{
	item = sc.next();
	a.add(item);
}
t1.start();
t2.start();


}
}
