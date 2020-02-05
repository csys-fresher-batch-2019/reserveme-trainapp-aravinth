package trainticket.Login;

import java.util.Scanner;

import trainticket.createAccount.createAccountIMPL;

public class testchangePassword {

	public static void main(String[] args) throws Exception {
		createAccountIMPL obj = new createAccountIMPL();
		Scanner scan = new Scanner(System.in);
		boolean test = true,test1=false;
		while(test)
		{
			
		System.out.println("Enter your user Id:");
		int userId = scan.nextInt();
		System.out.println("Enter your Old Password:");
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
			System.out.println("Invalid userId or Password");
		}

	}

}
}
