
import java.sql.* ;  // for standard JDBC programs

public class DBConnection {
	private String url = "jdbc:mysql://185.13.227.167:3306/michiai147_domin";
	private String user = "michiai147_domin";
	private String pass = "projdominion2016";
	private Statement stmnt;
	private ResultSet resultset;
	private Connection connection;
	
	public DBConnection() throws SQLException {
		connectDB();
	}
	
	private void connectDB() throws SQLException {
		// connection with database
		connection = DriverManager.getConnection(url, user, pass);
		
		stmnt = connection.createStatement();
		
		
	}
	
	public void showResults(ResultSet result) throws SQLException {
		while(result.next())
		{
			String cardName = result.getString("Card Name");
			String setname = result.getString("SetName");
			System.out.println(cardName + " ==> " + setname);
			
		}
	}
	
	public ResultSet getCardInfo(String card) throws SQLException
	{
		resultset = stmnt.executeQuery("SELECT `Card Name`, SetName "
									 + "FROM `Cards` "
									 + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
									 + "WHERE `Card Name` = '" + card + "'");
		
		//showResults(resultset);
		return resultset;
		
	}

	
}
