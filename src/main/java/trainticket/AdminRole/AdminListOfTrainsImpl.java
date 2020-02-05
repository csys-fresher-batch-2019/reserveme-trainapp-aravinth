package trainticket.AdminRole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AdminListOfTrainsImpl implements AdminListOfTrainsDAO {

	public void addTrains(AdminListOfTrains l) throws Exception {
		Connection con = TestListTrains.connect();
		String sql = "insert into train_lists(train_name,train_num,Source_station,Destination_station,ticket_price,journey_date,travelling_time)values(?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, l.trainname);
		pst.setInt(2, l.trainnum);
		pst.setString(3, l.Sourcestation);
		pst.setString(4, l.Destinationstation);
		pst.setInt(5, l.ticketPrice);
		java.sql.Date journeyDate = java.sql.Date.valueOf(l.journeyDate);
		pst.setDate(6, journeyDate);
		pst.setString(7, l.travellingTime);
		pst.executeUpdate();
		int trainNum = l.trainnum;
		/*Statement stmt = con.createStatement();
		String sql4 = "select travel_id.currval from dual";
		ResultSet row = stmt.executeQuery(sql4);
		row.next();
		int travelId = row.getInt("currval");*/
		String sql1 = "insert into seat_availabilities(train_num,tot_no_of_seats, no_of_seats_available) values(?,?,?)";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setInt(1, trainNum);
		pst1.setInt(2, l.totNumOfSeats);
		pst1.setInt(3, l.availableSeats);
		pst1.executeUpdate();
		System.out.println("Succesfully Train_lists added");
		// scan.close();
	}

	public void removeTrain(int trainNum) throws Exception {
		Connection con = TestListTrains.connect();
		Statement stmt=con.createStatement();
		String sql = "delete from seat_availabilities where train_num = "+trainNum;
		//PreparedStatement pst = con.prepareStatement(sql);
		//pst.setInt(1, travelId);	
		System.out.println(sql);

		int rows = stmt.executeUpdate(sql);
		String sql1 = "delete  from train_lists where train_num ="+trainNum;
		System.out.println(sql1);
		int rows1 = stmt.executeUpdate(sql1);

	//	PreparedStatement pst1 = con.prepareStatement(sql1);
	//	pst1.setInt(1, travelId);
	//	pst1.executeUpdate();

		System.out.println("Succesfully Train deleted" + rows);
		con.close();

	}

	public void updateTimings(int trainNum, String travellingTime) throws Exception {
		Connection con = TestListTrains.connect();
		String sql = "update train_lists set travelling_time =? where train_num = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,travellingTime);
		pst.setInt(2,trainNum);

		// System.out.println(sql);
		int rows = pst.executeUpdate();
		con.close();
		System.out.println("Succesfully Train Lists updated" + rows);

	}

	public void addPromo(String PromoCode, int discountValue) throws Exception {
		Connection con = TestListTrains.connect();
		String sql = "insert into promo_table values (?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, PromoCode);
		pst.setInt(2, discountValue);
		pst.executeUpdate();
		con.close();
		System.out.println("Succesfully Promo Code Added...");

	}

}
