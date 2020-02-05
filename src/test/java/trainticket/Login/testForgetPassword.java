package trainticket.Login;

import java.util.Scanner;

import trainticket.createAccount.createAccountIMPL;

public class testForgetPassword {

	public static void main(String[] args) throws Exception {
		createAccountIMPL obj = new createAccountIMPL();
		Scanner scan = new Scanner(System.in);
		int userId=0;
		boolean test = true, test1 = true;
		while (test) {
		System.out.println("Enter your userId:");
		userId = scan.nextInt();
		System.out.println("Enter your emailId:");
		String emailId = scan.next();
		if(obj.checkId(userId,emailId)) {
			while(test1)
			{
			System.out.println("New password:");
			String a1 =scan.next();
			System.out.println("Confirm Password:");
			String a2 = scan.next();
			if(a1.equals(a2))
			{
				obj.changePassword(userId, a1);
				test1 = false;
				test=false;
			}
			else {
				System.out.println("Password mismatch \nPlease Enter Correctly....");
			}
				
			}
		} else {
			System.out.println("Invalid");
		}
		}
}
}
