package trainticket;

import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.Login.testLogin;
import trainticket.Login.testchangePassword;
import trainticket.createAccount.testuserdata;

public class testHomePage {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		logger out = logger.getInstance();
		out.info("WELCOME TO RESERVEME");
		out.info("1.New User \n2.Existing User \n3.Change password");
		out.info("choose your choice");
		while(true) {
		int choice = scan.nextInt();
		if(choice == 1)
		{
			testuserdata.main(null);
		}
		else if(choice==2)
		{
			testLogin.main(null);
			
		}
		else if(choice ==3)
		{
			testchangePassword.main(null);
		}
		else
		{
		out.info("Please enter 1 or 2 to book tickets");
		}
	}
	}
}
