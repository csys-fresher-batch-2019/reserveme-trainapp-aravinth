package trainticket.Login;

import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.createAccount.createAccountIMPL;

public class testForgetPassword {

	public static void main(String[] args) throws Exception {
		createAccountIMPL obj = new createAccountIMPL();
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		int userId=0;
		boolean test = true, test1 = true;
		while (test) {
		out.getInput("Enter your userId:");
		userId = scan.nextInt();
		out.getInput("Enter your emailId:");
		String emailId = scan.next();
		if(obj.checkId(userId,emailId)) {
			while(test1)
			{
			out.info("New password:");
			String a1 =scan.next();
			out.info("Confirm Password:");
			String a2 = scan.next();
			if(a1.equals(a2))
			{
				obj.changePassword(userId, a1);
				test1 = false;
				test=false;
			}
			else {
				out.info("Password mismatch \nPlease Enter Correctly....");
			}
				
			}
		} else {
			out.info("Invalid");
		}
		}
}
}
