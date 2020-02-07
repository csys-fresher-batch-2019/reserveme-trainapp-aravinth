package trainticket.passengerInfo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import trainticket.AdminRole.TestListTrains;

public class passengerInfoIMPL implements passengerInfoDAO {
	public int addPassenger(passengerInfo p1) {
		try (Connection con = TestListTrains.connect();) {
			String sql = "insert into passenger_details(train_num,user_id,booking_id,passenger_name,phone_number,no_of_tickets)values(?,?,booking_id.nextval,?,?,?)";
			try (PreparedStatement pst = con.prepareStatement(sql);) {
				pst.setInt(1, p1.trainNum);
				pst.setInt(2, p1.userId);
				pst.setString(3, p1.passengerName);
				pst.setLong(4, p1.phoneNumber);
				pst.setInt(5, p1.noOfTickets);
				pst.executeUpdate();

				System.out.println("Succesfully Passenger details added...");
				try(Statement stmt = con.createStatement();){

				String sql1 = "select booking_id.currval as current_value from dual";
				try(ResultSet rows = stmt.executeQuery(sql1);){
				rows.next();
				int bookingId = rows.getInt("current_value");
				String sql2 = "update seat_availabilities set no_of_seats_available = no_of_seats_available- "
						+ p1.noOfTickets + " where train_num = ?";
				try(PreparedStatement pst1 = con.prepareStatement(sql2);){
				pst1.setInt(1, p1.trainNum);
				pst1.executeUpdate();
				String sql3 = "select ticket_price from train_lists where train_num =?";
				try(PreparedStatement pst2 = con.prepareStatement(sql3);){
				pst2.setInt(1, p1.trainNum);
				int cost = 0, ticket = 0;
				try (ResultSet row = pst2.executeQuery();) {
					if (row.next())
						cost = row.getInt("ticket_price");
					ticket = cost * p1.noOfTickets;
					try(Statement stmt1 = con.createStatement();){
					String sql22 = "insert into payment_status(train_num,user_id,booking_id,tot_ticket_price)values("
							+ p1.trainNum + "," + p1.userId + "," + bookingId + "," + ticket + ")";
					stmt1.executeUpdate(sql22);
					con.close();
					return bookingId;
				}}
			}}}}}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
