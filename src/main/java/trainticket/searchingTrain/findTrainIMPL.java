package trainticket.searchingTrain;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import trainticket.AdminRole.TestListTrains;

public class findTrainIMPL implements findTrainDAO{

	public ArrayList<findTrain> SearchTrain(String sourceStation , String destinationStation, String journeyDate) throws Exception {
		Connection con = TestListTrains.connect();
		String sql = "select train_name,train_num,ticket_price,travelling_time from train_lists where source_station =? and destination_station= ?and  journey_date=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, sourceStation);
		pst.setString(2, destinationStation);
		java.sql.Date journey = java.sql.Date.valueOf(journeyDate);
		pst.setDate(3, journey);

		ResultSet rows = pst.executeQuery();
		ArrayList<findTrain> trains = new ArrayList<findTrain>();
		while (rows.next()) {
			
			findTrain f = new findTrain();
			
			f.train_name = rows.getString("train_name");
			f.train_num = rows.getInt("train_num");
			f.price = rows.getInt("ticket_price");
			Statement stmt = con.createStatement();
			f.travelling_time = rows.getString("travelling_time");
			ResultSet  rs = stmt.executeQuery("select  no_of_seats_available from seat_availabilities where train_num = "+f.train_num);
			while(rs.next())
			{
				int seats1 = rs.getInt("no_of_seats_available");
				if(seats1>0)
				{
			trains.add(f);
				}
			}
		}
		con.close();

		return trains;
	}

}