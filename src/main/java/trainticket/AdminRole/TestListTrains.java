package trainticket.AdminRole;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestListTrains {
	public static Connection connect() throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String server = "192.168.56.229";
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@"+server+":1521:XE","system", "oracle");
			System.out.println(connection);
			return connection;
			
	}}

