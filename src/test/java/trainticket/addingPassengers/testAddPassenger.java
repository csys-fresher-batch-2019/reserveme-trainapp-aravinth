package trainticket.addingPassengers;

import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.passengerInfo.passengerInfo;
import trainticket.passengerInfo.passengerInfoIMPL;

public class testAddPassenger {

	public static void main(String[] args) throws Exception {
		 passengerInfo p1 = new passengerInfo();  
		passengerInfoIMPL obj1 = new passengerInfoIMPL();
		 System.out.println("Please fill the Passenger Details...");
		 Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		 out.getInput("Enter Train Number:"); 
		p1.setTrainNum(scan.nextInt());
		out.getInput("Enter User Id:");
		 p1.setUserId(scan.nextInt());
		 out.getInput("Enter Passenger Name:");
		 p1.setPassengerName(scan.next());
		 out.getInput("Enter Phone Number:");
		 p1.setPhoneNumber(scan.nextLong());
		 out.getInput("Enter No Of Tickets:");
		 p1.setNoOfTickets(scan.nextInt());
		 int bookingId = obj1.addPassenger(p1);
		 out.info("Your Booking Id:");
		out.info(bookingId);
		trainticket.payment.testPayment.main(null);		 
		 
	}

}
