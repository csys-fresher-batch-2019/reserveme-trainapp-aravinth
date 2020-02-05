package trainticket.createAccount;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import trainticket.createAccount.createAccountIMPL;
import trainticket.AdminRole.TestListTrains;
import trainticket.createAccount.createAccount;

public class testuserdata {

	public static void main(String args[])throws Exception{
		createAccountIMPL obj = new createAccountIMPL();
		createAccount l = new createAccount();
		 Connection con = TestListTrains.connect();
        boolean test =true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		l.userName = scan.next();
		System.out.println("Enter password");
	    l.userPassword = scan.next();
		System.out.println("Enter gender");
		l.gender = scan.next();
		System.out.println("Enter date of birth");
		l.dob = scan.next();
		System.out.println("Enter contact number");
		l.contactNumber = scan.nextLong();
		int userid = 0;
		while(test) {
		System.out.println("Enter email Id");
		l.mailId = scan.next();
		String a=l.mailId;
		if(obj.checkEmail(a)) {
			test=false;
			userid=obj.AddUser(l);
		} 
		else {
			System.out.println("Sorry Your Account Already Exist!!!");
		}
		}
		System.out.println("Your Userid\n"+userid);
		trainticket.Login.testLogin.main(null);
		//System.out.println("Account created successfully");
	}
}


