package trainticket.AdminRole;

import java.util.ArrayList;
import java.util.Scanner;

import trainticket.Logger.logger;

public class testaddtrain {

	public static void main(String[] args) throws Exception {
		testAddTrain();
			}

	public static void testAddTrain() throws Exception {
		AdminListOfTrainsImpl obj1 = new AdminListOfTrainsImpl();
		AdminListOfTrains l = new AdminListOfTrains();
		Scanner scan = new Scanner(System.in);
		logger out = logger.getInstance();
		out.info("======ADDING TRAINS======");
		out.getInput("Enter train name:");
		l.setTrainname(scan.nextLine());
		out.getInput("Enter train num:");
		l.setTrainnum(scan.nextInt());
		out.getInput("Enter sourcestation:");
		l.setSourcestation(scan.next());
		out.getInput("Enter destinationstation:");
		l.setDestinationstation(scan.next());
		out.getInput("Enter ticket Price:");
		l.setTicketPrice(scan.nextInt());
		out.getInput("Enter journey Date:");
		l.setJourneyDate(scan.next());		
		out.getInput("Enter travelling start time:");		
		String startTime = scan.next();
		out.getInput("Enter travelling endtime");
	    String endTime = scan.next();
	    l.setTravellingTime(startTime + " to " + endTime);
	    out.getInput("Enter the total Number Of Seats:");
		l.setTotNumOfSeats(scan.nextInt());
		out.getInput("Enter the Available Seats:");
		l.setAvailableSeats(scan.nextInt());
		obj1.addTrains(l);
	}

}