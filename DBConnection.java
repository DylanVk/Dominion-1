
import java.sql.* ;  // for standard JDBC programs

public class DBConnection {
	String url = "jdbc:mysql://185.13.227.167:3306/michiai147_domin";
	String user = "michiai147_domin";
	String pass = "projdominion2016";
	Statement stmnt;
	ResultSet resultset;
	Connection connection;
	
	public DBConnection() throws SQLException {
		connectDB();
	}
	
	private void connectDB() throws SQLException {
		// connection with database
		connection = DriverManager.getConnection(url, user, pass);
		
		stmnt = connection.createStatement();
		resultset = stmnt.executeQuery("SELECT * FROM Cards");
		
		showResults(resultset);
	}
	
	private void showResults(ResultSet result) throws SQLException {
		while(result.next())
		{
			String cardName = result.getString("Card Name");
			System.out.println(cardName);
			
		}
	}
	
}
