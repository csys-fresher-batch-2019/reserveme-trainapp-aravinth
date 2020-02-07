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
		l.setTrainname(scan.nextLine());
		System.out.println("Enter train num:");
		l.setTrainnum(scan.nextInt());
		System.out.println("Enter sourcestation:");
		l.setSourcestation(scan.next());
		System.out.println("Enter destinationstation:");
		l.setDestinationstation(scan.next());
		System.out.println("Enter ticket Price:");
		l.setTicketPrice(scan.nextInt());
		System.out.println("Enter journey Date:");
		l.setJourneyDate(scan.next());
		
		System.out.println("Enter travelling start time:");
		
		String startTime = scan.next();
		
	    System.out.println("Enter travelling endtime");
	    String endTime = scan.next();
	    
	    l.setTravellingTime(startTime + " to " + endTime);
		//System.out.println(l);
	    System.out.println("Enter the total Number Of Seats:");
		l.setTotNumOfSeats(scan.nextInt());
		System.out.println("Enter the Available Seats:");
		l.setAvailableSeats(scan.nextInt());
		obj1.addTrains(l);
	}

}