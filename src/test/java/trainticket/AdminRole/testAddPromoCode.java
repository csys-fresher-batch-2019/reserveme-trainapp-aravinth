package trainticket.AdminRole;

import java.util.Scanner;

public class testAddPromoCode {

	public static void main(String[] args) throws Exception {
		AdminListOfTrainsImpl obj = new AdminListOfTrainsImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Promo Code:");
		String PromoCode = scan.next();
		System.out.println("Enter discount value");
		int discountValue = scan.nextInt();
		obj.addPromo(PromoCode,discountValue);
		
	}

}
