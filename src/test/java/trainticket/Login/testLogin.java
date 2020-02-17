package trainticket.Login;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import trainticket.AdminRole.TestListTrains;
import trainticket.Logger.logger;
import trainticket.createAccount.createAccountIMPL;
import trainticket.findingTrain.testFindTrain;

public class testLogin {

	public static void main(String[] args) throws Exception {
		createAccountIMPL obj = new createAccountIMPL();
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		int flag = 1;
		while (flag == 1) {
			out.getInput("Enter the User Id");
			int userId = scan.nextInt();
			out.getInput("Enter the user Password");
			String userPassword = scan.next();
			if (obj.checkLogin(userId, userPassword)) {
				out.info("Login Successful");
				testFindTrain.main(null);
				flag--;
			} else {
				out.info("Invalid Username/Password");
				out.info("To changepassword...");
				out.info("Enter 1 to try Again or 2 to change password");
				int choice = scan.nextInt();
				if(choice ==1)
				{
					flag=1;
				}
				else
				{
					testForgetPassword.main(null);
				}

			}

		}
	}
}
