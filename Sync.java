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

///////////////////////////////////////////////////////////////////



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sync extends Multi {
   Map<String,Integer> res = new HashMap<>(); 
   Map<String,Integer> res1 = new HashMap<>();
public Map<String, Integer> display(ArrayList<String> a)
{ 
for (String x : a) {
    

		 if (sp.containsKey(x)  ) {
             //System.out.println(sp);
				//System.out.println(x+" Rs."+sp.get(x));
                res.put(x,sp.get(x));
                return res;
            }

        else if(sp1.containsKey(a)){
         System.out.println(Thread.currentThread().getName() );
         //System.out.println(x+" Rs."+sp1.get(x));
         res1.put(x,sp1.get(x));
         return res1;
        }
	}
return res , res1;


}
	 
synchronized void dis(Map<String, Integer> result) 
{
for(Map.Entry<String,Integer> z : result.entrySet())
{
System.out.println(z.getKey()+ " " + z.getValue());
System.out.println(Thread.currentThread().getName());
}
}

}
class Dairy extends Thread
{
    Map<String,Integer> result; 
	Sync s = new Sync();
	public void run()
	{
	result = s.display(s.a);
    s.dis(result);
	}
}
class Biscuit extends Thread
{
    Map<String,Integer> result; 
	Sync s1 = new Sync();
	public void run()
	{
	result = s1.display(s1.a);
    s1.dis(result);
    	
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
sp1.put("50-50",15);
sp1.put("Mariegold",20);
sp1.put("MilkB",30);
sp1.put("parle",40);
System.out.println(a+" Rs."+sp.get(a));
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
t1.setName("Dairy");
t2.setName("Biscuit");


}
}


