package org.ashwin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

class Cab {

	static Scanner sc = new Scanner(System.in);
	static Map<Integer, String> emp;
	static ArrayList<String> location;
	static SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
	static SimpleDateFormat d2 = new SimpleDateFormat("hh:mm aa");
	static Date mrg;
	static Date night;

	public static void shift(Date date3) throws ParseException, InterruptedException {

		String b = "08:00 am";
		mrg = d2.parse(b);

		String c = "05:00 pm";
		night = d2.parse(c);

		if (date3.before(mrg) || date3.equals(mrg)) {
			System.out.println("****Morning shift****");
			schedule();
		} else if (date3.after(night) || date3.equals(night)) {
			System.out.println("****Night Shift****");
			schedule();
		}

	}

	public static void rescheduleShift(Date date4, Date rescheduledateto) throws ParseException, InterruptedException {

		if (date4.before(mrg) || date4.equals(mrg)) {
			System.out.println("Your rescheduling process on " + d1.format(rescheduledateto)
					+ " for Morning shift was rescheduled successfully");
			System.out.println("--------------------------------------------");
			Thread.sleep(1000);
			booking(location, emp);

		} else if (date4.after(night) || date4.equals(night)) {

			System.out.println("Your rescheduling process on " + d1.format(rescheduledateto)
					+ " for night shift was rescheduled successfully");
			System.out.println("--------------------------------------------");
			Thread.sleep(1000);
			booking(location, emp);
		}

	}

	public static void schedule() throws ParseException, InterruptedException {

		LocalDate booking = LocalDate.now();
		Date bookedDate = d1.parse(booking.toString());
		System.out.println(d1.format(bookedDate) + " Current booking date ");

		System.out.println("How many days did you want to book:");
		int d = sc.nextInt();
		LocalDate booked = LocalDate.now().plusDays(d);
		Date bookedFor = d1.parse(booked.toString());
		System.out.println("Scheduled for upto " + d1.format(bookedFor) + " Totally for " + d + " days");
		System.out.println("Do you want to reschedule or cancel the Schedule \n 1.Reschedule \n 2.CancelBooking \n 3.exit");
		int i = sc.nextInt();
		sc.nextLine();
		if (i == 1) {
			reschedule(bookedDate, bookedFor);
		}else if(i == 2)
		{
			cancelBooking(bookedDate, bookedFor,d);
		}
		else {
			System.out.println("  --Thankyou for Booking-- \n ** HAVE A NICE DAY **");
			System.out.println("--------------------------------------------");
			Thread.sleep(1000);
			booking(location, emp);
		}
	}

	public static void cancelBooking(Date bookedDate, Date bookedFor, int d) 
	{
     System.out.println("Booking details: \n *Date of Booking :" + d1.format(bookedDate) +" \n *Booked upto :"+ d1.format(bookedFor) +"\n Totally for "+ d +" days booking has been cancelled");	
	}

	public static void reschedule(Date bookedDate, Date bookedFor) throws ParseException, InterruptedException {

		System.out.println("Enter the rescheduling date:");
		String a2 = sc.nextLine();
		Date rescheduleday = d1.parse(a2);

		if ((rescheduleday.equals(bookedDate)||rescheduleday.after(bookedDate))&& rescheduleday.before(bookedFor)) {
			System.out.println("Enter from when do you want to reschedule:");
			String a1 = sc.nextLine();
			Date rescheduledateto = d1.parse(a1);
				if (rescheduledateto.before(rescheduleday)||rescheduledateto.equals(rescheduleday)) {
					System.out.println("*-*-*-Unable to reschedule*-*-*-*");
					reschedule(bookedDate, bookedFor);
				} else {
					System.out.println("Do you want to reschedule your shift time: \n 1.Yes \n 2.No");
					int s = sc.nextInt();
					sc.nextLine();
					if (s == 1) {
						System.out.println("Enter the Shift time:");
						String z = sc.nextLine();
						Date date4 = d2.parse(z);
						rescheduleShift(date4, rescheduledateto);

					} else {

						System.out.println("Your rescheduling process on " + d1.format(rescheduledateto)
								+ " was rescheduled successfully");
						booking(location, emp);
					}
				}
			}
			

		else {
			System.out.println("Your rescheduling date was not between the booked days");
			System.out.println("Please enter the valid reschedulingdate");
			reschedule(bookedDate, bookedFor);

		}
	}

	public static void booking(ArrayList<String> location2, Map<Integer, String> emp2)
			throws ParseException, InterruptedException {
		System.out.println("Enter the emp id:");
		int id = sc.nextInt();
		sc.nextLine();
		if (emp2.containsKey(id)) {
			System.out.println("Hi " + emp2.get(id) + "\n *** Welcome to our CabBooking Platform ***");
			System.out.println();
			System.out.println("Cab Facility Available Locations:");
			for (String a : location2) {
				System.out.println("* " + a);
			}
			System.out.println();
			System.out.println("Enter the location:");
			String place = sc.nextLine();
			if (location2.contains(place.toLowerCase())) {
				System.out.println("Enter the Shift time:");
				String a = sc.nextLine();
				Date date3 = d2.parse(a);
				shift(date3);

			} else {
				System.out.println("Sorry we don't have cab facility for this location");
			}
		} else {
			System.out.println("Invalid Employee id");
		}
	}

	public static void main(String args[]) throws ParseException, InterruptedException {
		emp = new HashMap<>();
		emp.put(001, "Ashwin");
		emp.put(002, "Esakki");
		emp.put(003, "Sam");
		emp.put(004, "sasi");
		emp.put(005, "Sathish");
		emp.put(006, "Naveen");

		location = new ArrayList<>();
		location.add("kodampakkam");
		location.add("ashok nagar");
		location.add("vadapalani");
		location.add("guindy");
		location.add("thousandslight");
		location.add("kk nagar");
		location.add("nungampakam");

		booking(location, emp);
	}
}
