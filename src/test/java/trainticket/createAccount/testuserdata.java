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
		l.setUserName(scan.next());
		System.out.println("Enter password");
	    l.setUserPassword(scan.next());
		System.out.println("Enter gender");
		l.setGender(scan.next());
		System.out.println("Enter date of birth");
		l.setDob(scan.next());
		System.out.println("Enter contact number");
		l.setContactNumber(scan.nextLong());
		int userid = 0;
		while(test) {
		System.out.println("Enter email Id");
		l.setMailId(scan.next());
		String a=l.getMailId();
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


