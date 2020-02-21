package trainticket.bookingDetails;

import java.util.ArrayList;
import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.passengerInfo.passengerInfo;
import trainticket.passengerInfo.passengerInfoIMPL;
import trainticket.payment.testPayment;

public class testBookingDetails {

	public static void main(String[] args) {
		passengerInfoIMPL obj1 = new passengerInfoIMPL();
		logger out=logger.getInstance();
		passengerInfo a = new passengerInfo();
		Scanner sc = new Scanner(System.in);
		out.getInput("Enter Booking Id:");
		int bookingId = sc.nextInt();
	    if (obj1.validateBookingId(bookingId)) {
		ArrayList<passengerInfo> details = obj1.BookingDetails(bookingId);
		for (passengerInfo info : details) {
		out.info(info);
		}
		int totalPrice=obj1.totalPrice(bookingId);
		out.info("Amount to be paid is Rs."+totalPrice);
		while (true) {
		out.getInput("Select 1 make payment or Select 2 to cancel booking:");
		int choice = sc.nextInt();
		if(choice==1)
		{
			testPayment.main(null);
		break;
		}

		else if (choice == 2) {
		//testCancelBooking.main(null);
		break;
		} else {
		out.info("select valid option");
		}
		}
		} else {
		out.info("Enter valid booking id...try again");
		testBookingDetails.main(null);

		}
		}

	}


