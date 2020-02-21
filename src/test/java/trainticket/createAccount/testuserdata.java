package trainticket.createAccount;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import trainticket.createAccount.createAccountIMPL;
import trainticket.AdminRole.TestListTrains;
import trainticket.Logger.logger;
import trainticket.createAccount.createAccount;

public class testuserdata {

	public static void main(String args[])throws Exception{
		createAccountIMPL obj = new createAccountIMPL();
		createAccount l = new createAccount();
		 Connection con = TestListTrains.connect();
        boolean test =true;
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		out.getInput("Enter username");
		l.setUserName(scan.next());
		out.getInput("Enter password");
	    l.setUserPassword(scan.next());
	    out.getInput("Enter gender");
		l.setGender(scan.next());
		out.getInput("Enter date of birth");
		l.setDob(scan.next());
		out.getInput("Enter contact number");
		l.setContactNumber(scan.nextLong());
		int userid = 0;
		while(test) {
			out.getInput("Enter email Id");
		l.setMailId(scan.next());
		String a=l.getMailId();
		if(obj.checkEmail(a)) {
			test=false;
			userid=obj.AddUser(l);
		} 
		else {
			out.info("Sorry Your Account Already Exist!!!");
		}
		}
		out.info("Your Userid\n"+userid);
		trainticket.Login.testLogin.main(null);
	}
}


