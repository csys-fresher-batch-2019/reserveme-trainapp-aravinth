package trainticket.payment;

import java.util.Scanner;

import trainticket.Logger.logger;

public class testPaymentSuccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		paymentDAOImpl obj = new paymentDAOImpl();
		logger out = logger.getInstance();
		out.getInput("Enter BookingId:");
		int bookingId = scan.nextInt();
		obj.paymentSuccess(bookingId);
	}
}
