package trainticket;

import java.util.Scanner;

import trainticket.Login.testForgetPassword;
import trainticket.Login.testLogin;
import trainticket.Login.testchangePassword;
import trainticket.createAccount.testuserdata;

public class testHomePage {

	public static void main(String[] args) throws Exception {
		System.out.println("WELCOME TO RESERVEME");
		System.out.println("1.New User \n2.Existing User \n3.Change password");
		System.out.println("choose your choice");
		Scanner scan = new Scanner(System.in);
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
			System.out.println("Please enter 1 or 2 to book tickets");
		}
	}
	}
}
