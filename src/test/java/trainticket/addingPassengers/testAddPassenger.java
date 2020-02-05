package trainticket.addingPassengers;

import java.util.Scanner;

import trainticket.passengerInfo.passengerInfo;
import trainticket.passengerInfo.passengerInfoIMPL;

public class testAddPassenger {

	public static void main(String[] args) throws Exception {
		 passengerInfo p1 = new passengerInfo();  
		passengerInfoIMPL obj1 = new passengerInfoIMPL();
		 System.out.println("Please fill the Passenger Details...");
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Train Number:");
		 
		p1. trainNum = scan.nextInt();
		 System.out.println("Enter User Id:");
		 p1. userId = scan.nextInt();
		 System.out.println("Enter Passenger Name:");
		 p1. passengerName = scan.next();
		 System.out.println("Enter Phone Number:");
		 p1. phoneNumber = scan.nextLong();
		 System.out.println("Enter No Of Tickets:");
		 p1. noOfTickets = scan.nextInt();
		 //System.out.println("Enter the PromoCode");
		 //p1.PromoCode = scan.next();
		 int bookingId = obj1.addPassenger(p1);
		 System.out.println("Your Booking Id:");
		 System.out.println(bookingId);
		 
		 
		 
	}

}
