package trainticket.createAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import trainticket.AdminRole.TestListTrains;

public class createAccountIMPL implements createAccountDAO {
	public int AddUser(createAccount l) throws Exception {

		Connection con = TestListTrains.connect();
		int userid = 0;
		String sql = "insert into user_account(user_name,user_id,user_password,gender,dob,contact_number,mail_id) values(?,user_id.nextval,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, l.userName);
		pst.setString(2, l.userPassword);
		pst.setString(3, l.gender);
		java.sql.Date dob = java.sql.Date.valueOf(l.dob);
		pst.setDate(4, dob);
		pst.setLong(5, l.contactNumber);
		pst.setString(6, l.mailId);
		pst.executeUpdate();
		System.out.println("Succesfully Account created");

		String sql1 = "select user_id from user_account where mail_id = ?";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setString(1, l.mailId);
		ResultSet rows = pst1.executeQuery();
		System.out.println(rows);
		if (rows.next()) {
			userid = rows.getInt("user_id");
			// System.out.println("user Id:"+userid);
		}
		con.close();
		return userid;
	}

	public boolean checkEmail(String mail) throws Exception {
		Connection con = TestListTrains.connect();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select mail_id from user_account where mail_id = '" + mail + "'") == 0) {
			return true;
		}
		con.close();

		return false;
	}

	public boolean checkLogin(int userId, String Password) throws Exception {
		Connection con = TestListTrains.connect();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select user_id from user_account where user_id = " + userId) != 0) {
			String sql = "select user_password from user_account where user_id = " + userId;
			ResultSet rows = stmt.executeQuery(sql);
			if (rows.next()) {
				String userPass = rows.getString("user_password");
				if (userPass.equals(Password)) {
					return true;
				} else {
					return false;
				}
			}

		}
		con.close();

		return false;
	}

	public boolean checkId(int userId, String emailId) throws Exception {
		Connection con = TestListTrains.connect();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select user_id from user_account where user_id =" + userId) == 1) {
			String sql = "select mail_id from user_account where user_id =" + userId;
			ResultSet row = stmt.executeQuery(sql);
			if (row.next()) {
				String mail = row.getString("mail_id");
				if (mail.equals(emailId)) {
					return true;
				}
			}

		}
		con.close();
		return false;

	}

	public boolean changePassword(int userId, String a1) throws Exception {
		Connection con = TestListTrains.connect();
		Statement stmt = con.createStatement();
		String sql = "update user_account set user_password='"+a1+"' where user_id =" + userId;
		stmt.executeUpdate(sql);
		con.close();
		System.out.println("Password changed succecfully");
		return true;
	}


	public boolean checkPassword(int userId, String oldPassword) throws Exception {
		Connection con = TestListTrains.connect();
		Statement stmt = con.createStatement();
		if(stmt.executeUpdate("select user_id,user_password from user_account where user_id ='"+userId+"' and user_password='"+oldPassword+"'")==1) {
			return true;
		}
		else
		{
			System.out.println("Invalid User id or password");
			con.close();
			return false;
		}
	}
	

}