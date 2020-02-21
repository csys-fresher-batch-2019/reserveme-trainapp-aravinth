package trainticket.Login;

import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.createAccount.createAccountIMPL;

public class testchangePassword {

	public static void main(String[] args) throws Exception {
		createAccountIMPL obj = new createAccountIMPL();
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		boolean test = true,test1=false;
		while(test)
		{			
		out.getInput("Enter your user Id:");
		int userId = scan.nextInt();
		out.getInput("Enter your Old Password:");
		String oldPassword = scan.next();
		test1 = obj.checkPassword(userId,oldPassword);
		if (test1 == true)
		{
			test=false;
			test1 =false;
			testForgetPassword.main(null);	
		}
		else if(test==false)
		{
			out.info("Invalid userId or Password");
		}
	}
}
}
