import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
class CabBooking
{
   
   static Scanner sc;
   static Map<Integer,String> emp;
   static ArrayList<String> location;

   public static void shift(Date date3) throws ParseException
    {
        
       
       System.out.println("Time:" + (date3)); 

       String b = "08:00 am";
       SimpleDateFormat dateFormat2 = new SimpleDateFormat("hh:mm aa"); 
       Date mrg = dateFormat2.parse(b);
      // System.out.println("Time:" + dateFormat2.format(mrg)); 

       String c = "05:00 pm";
       SimpleDateFormat dateFormat3 = new SimpleDateFormat("hh:mm aa"); 
       Date night = dateFormat3.parse(c);
       //System.out.println(night);
      // System.out.println("Time:" + dateFormat3.format(night));
      
     
        if(date3.before(mrg) || date3.equals(mrg))
        {
            System.out.println("****Morning shift****");
            CabBooking.schedule();
        }
        else if(date3.after(night) || date3.equals(night))
        {
            System.out.println("****Night Shift****");
            CabBooking.schedule();
        }
             
    }
     public static void schedule() throws ParseException
    {
        LocalDate booking= LocalDate.now();
        //converting localdate to date
        SimpleDateFormat dateFormat6 = new SimpleDateFormat("yyyy-MM-dd"); 
        Date bookedDate = dateFormat6.parse(booking.toString());
        System.out.println(dateFormat6.format(bookedDate) + " current booking date ");
        
        System.out.println("How many day do you want to book:");
        int d = sc.nextInt();
        LocalDate booked = LocalDate.now().plusDays(d);
        //converting localdate to date
        SimpleDateFormat dateFormat7 = new SimpleDateFormat("yyyy-MM-dd"); 
        Date bookedFor = dateFormat7.parse(booked.toString());
        System.out.println("Scheduled for upto " + dateFormat7.format(bookedFor) + " Totally for " + d + " days");
        System.out.println("Do you want to reschedule /n 1.Yes /n 2.no");
        int i = sc.nextInt();
        if(i == 1)
        {
        CabBooking.reschedule(bookedDate, bookedFor);
        }
        else
        {
        System.out.println("Thankyou");    
        }
    }
    public static void reschedule(Date bookedDate,Date bookedFor) throws ParseException
    {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the rescheduling date:");
      String a2 = sc.nextLine();
      SimpleDateFormat dateFormat4 = new SimpleDateFormat("yyyy-MM-dd"); 
      Date rescheduleday = dateFormat4.parse(a2);

       
      if(rescheduleday.after(bookedDate) && rescheduleday.before(bookedFor))
      {
        System.out.println("Enter from when to you reschedule:");
        String a1 = sc.nextLine();
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("yyyy-MM-dd"); 
        Date rescheduledateto = dateFormat5.parse(a1); 

        if(rescheduledateto.before(rescheduleday))
        {
            System.out.println("Unable to reschedule because your try to access past days");
            reschedule(bookedDate,bookedFor);
        }
        else
        {
            System.out.println("your rescheduling process for" + dateFormat5.format(rescheduledateto) + " was rescheduled successfully");
        }
      }
      else 
      {
         System.out.println("your rescheduling date was not between the booked days");
         System.out.println("please enter the valid reschedulingdate");
         reschedule(bookedDate,bookedFor);

      }
    }
    public static void main(String args[]) throws ParseException
    {
       sc = new Scanner(System.in);
       emp = new HashMap<>();
       emp.put(001, "Ashwin");
       emp.put(002, "Esai");
       emp.put(003, "Sam");
       emp.put(004, "susee");
       emp.put(005, "Ravi");
       emp.put(006, "Naveen"); 
       location = new ArrayList<>();
       location.add("Kodampakkam");
       location.add("Ashok nagar");
       location.add("vadapalani");
       location.add("guindy");
       location.add("Thousandslight");
       location.add("Cit nagar");
       location.add("kk nagar");
       location.add("nungampakam");

       booking(location, emp);

    }
     public static void booking(ArrayList<String> location2, Map<Integer, String> emp2) throws ParseException 
      {
       System.out.println("Enter the emp id:");
       int id = sc.nextInt();
       sc.nextLine();
      
      
       if(emp2.containsKey(id))
       {
           System.out.println(emp2);
           System.out.println("Enter the location:");
           String place = sc.nextLine();
          if(location2.contains(place))
             {
                // System.out.println(place);
                // System.out.println(location2);
                // System.out.println(date3);
                System.out.println("Enter the Shift time:");
                String a = sc.nextLine();
                SimpleDateFormat dateFormat1 = new SimpleDateFormat("hh:mm aa"); 
                Date date3 = dateFormat1.parse(a);
                CabBooking.shift(date3);
                
             }
           else
            {
              System.out.println("Sorry we don't have cab facility for this location");
            }
          }
        else
        {
            System.out.println("Invalid Employee id");
        }
    
    }
}





