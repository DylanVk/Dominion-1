
import java.sql.* ;  // for standard JDBC programs
import java.util.*;

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
		System.out.println("CardID = Cardname, setname, type, cost, function");
		while(result.next())
		{
			String cardID = result.getString("CardID");
			String cardname = result.getString("Card Name");
			String setname = result.getString("SetName");
			String type = result.getString("Type");
			String cost = result.getString("Cost");
			String function = result.getString("Function");
			System.out.println(cardID + " = " + cardname + ", " + setname + ", " +  type + ", " +  cost + ", " +  function);
		}
	}
	
	private void setCardInfo(String card) throws SQLException
	{
		this.resultset = stmnt.executeQuery("SELECT CardID,`Card Name`, SetName, Type, Cost, `Function` " 
									 + "FROM `Cards` "
									 + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
								     + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID "
								     
									 + "WHERE `Card Name` = '" + card + "'");
		
	}
	
	private void setCardInfo() throws SQLException
	{
		this.resultset = stmnt.executeQuery("SELECT CardID,`Card Name`, SetName, Type, Cost, `Function` " 
									 + "FROM `Cards` "
									 + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
								     + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID ORDER BY CardID");
	}
	
	public ResultSet getCardInfo(String card) throws SQLException
	{
		setCardInfo(card);
		return resultset;
		
	}
	
	public ResultSet getCardInfo() throws SQLException
	{
		setCardInfo();
		return resultset;
		
	}

	
}
