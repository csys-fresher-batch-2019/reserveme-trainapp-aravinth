package trainticket.payment;

import java.time.LocalDate;
import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.creditcard.card;

public class testPayment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		paymentDAOImpl obj = new paymentDAOImpl();
		logger out = logger.getInstance();
		out.info("1.pay Using Debit card \n2.pay Using Wallet ");
		out.info("choose your choice");
		while(true) {
		int choice = scan.nextInt();
		if(choice == 1)
		{
			out.getInput("Enter card Number:");
			long cardNo = scan.nextLong();
			out.getInput("Enter cvv");
			int cvv = scan.nextInt();
			out.getInput("Enter Expiry-date");
			String expiryDate = scan.next();
			LocalDate exp = LocalDate.parse(expiryDate);
			out.getInput("Enter total Amount");
			int TotalAmount = scan.nextInt();
			out.getInput("Enter comments");
			String comments = scan.next();
			card pay = new card();
			//PaymentResponse payment = pay.cardpayment(cardNo, exp, cvv, TotalAmount, comments);
			int transId = 1;//payment.getTransactionId();
			boolean paymentStatus = true; //payment.isStatus()
			System.out.println(paymentStatus);
			if (paymentStatus) {
				out.info(transId);
			out.info(" !!! Train Booked Successfuly !!! ");
			} else {
			out.info("Transaction failed");
			continue;
			}

			}
		else if(choice==2)
		{
			
			
		}
		else
		{
		out.info("Please enter 1 or 2 to pay");
		}
	}

	}

}
