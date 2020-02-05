package trainticket.AdminRole;

import java.util.ArrayList;
import java.util.Scanner;

public class testaddtrain {

	public static void main(String[] args) throws Exception {
		testAddTrain();
			}

	public static void testAddTrain() throws Exception {
		// TODO Auto-generated method stub
		AdminListOfTrainsImpl obj1 = new AdminListOfTrainsImpl();
		AdminListOfTrains l = new AdminListOfTrains();

		Scanner scan = new Scanner(System.in);
		System.out.println("======ADDING TRAINS======");
		System.out.println("Enter train name:");
		l.trainname = scan.nextLine();
		System.out.println("Enter train num:");
		l.trainnum = scan.nextInt();
		System.out.println("Enter sourcestation:");
		l.Sourcestation = scan.next();
		System.out.println("Enter destinationstation:");
		l.Destinationstation = scan.next();
		System.out.println("Enter ticket Price:");
		l.ticketPrice = scan.nextInt();
		System.out.println("Enter journey Date:");
		l.journeyDate = scan.next();
		
		System.out.println("Enter travelling start time:");
		
		String startTime = scan.next();
		
	    System.out.println("Enter travelling endtime");
	    String endTime = scan.next();
	    
	    l.travellingTime = startTime + " to " + endTime;
		//System.out.println(l);
	    System.out.println("Enter the total Number Of Seats:");
		l.totNumOfSeats = scan.nextInt();
		System.out.println("Enter the Available Seats:");
		l.availableSeats = scan.nextInt();
		obj1.addTrains(l);
	}

}