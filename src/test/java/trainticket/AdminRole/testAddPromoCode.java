package trainticket.AdminRole;

import java.util.Scanner;

import trainticket.Logger.logger;

public class testAddPromoCode {

	public static void main(String[] args) throws Exception {
		AdminListOfTrainsImpl obj = new AdminListOfTrainsImpl();
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		out.getInput("Enter the Promo Code:");
		String PromoCode = scan.next();
		out.getInput("Enter discount value");
		int discountValue = scan.nextInt();
		obj.addPromo(PromoCode,discountValue);
		
	}

}
