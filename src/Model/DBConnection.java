package Model;

import java.sql.*; // for standard JDBC programs
import java.util.*;

public class DBConnection {
	private String url = "jdbc:mysql://185.13.227.167:3306/michiai147_domin";
	private String user = "michiai147_domin";
	private String pass = "projdominion2016";
	private ResultSet resultset;
	private Connection connection;
	private PreparedStatement prepStatemnt;

	public DBConnection() throws SQLException {
		connectDB();
	}

	private void connectDB() throws SQLException {
		// connection with database
		connection = DriverManager.getConnection(url, user, pass);

	}

	public void showResults(ResultSet result) throws SQLException {

		ArrayList<String> array = new ArrayList<>();
		ResultSetMetaData metaData = result.getMetaData();
		while (result.next()) {
			for (int i = 1; i < metaData.getColumnCount() + 1; i++) {
				array.add(result.getString(i));
			}

		}

		for (String value : array)
			System.out.println(value);

	}

	private void setCardInfo(String card) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT CardID,`Card Name`, SetName, Type, Cost, `Function` "
												 + "FROM `Cards` "
												 + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
												 + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID " 
												 + "WHERE `Card Name` = '" + card + "'");
		this.resultset = prepStatemnt.executeQuery();

	}

	public ResultSet getCardInfo(String card) throws SQLException {
		setCardInfo(card);
		return resultset;

	}


	private void setCardType(String name) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT Type " 
											 	 + "FROM CardTypes "
											 	 + "JOIN Cards ON CardTypes.TypeID = Cards.TypeID " 
											 	 + "WHERE `Card Name` = '" + name + "'");
		this.resultset = prepStatemnt.executeQuery();
	}

	public ResultSet getCardType(String name) throws SQLException {
		setCardType(name);
		return resultset;
	}
	
	private void setCardSet(String name) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT SetName "
										 		 + "FROM `Cards` "
												 + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
												 + "WHERE `Card Name` = '" + name + "'");
		
		this.resultset = prepStatemnt.executeQuery();
	}
	
	public ResultSet getCardSet(String name) throws SQLException {
		setCardSet(name);
		return resultset;
	}

	
}
