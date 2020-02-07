package trainticket.AdminRole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestListTrains {
	public static Connection connect() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		String server = "localhost";
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@" + server + ":1521:XE", "system",
				"oracle");
		System.out.println(connection);
		return connection;

	}
}
