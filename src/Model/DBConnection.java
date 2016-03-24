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
	private ArrayList<String> arrayData = new ArrayList<>();

	public DBConnection() throws SQLException {
		connectDB();
	}

	private void connectDB() throws SQLException {
		connection = DriverManager.getConnection(url, user, pass);
	}

	public void print(ArrayList<String> array) {
		for (String value : array)
			System.out.println(value);
	}

	public void dataToArrayList(ResultSet result) throws SQLException {
		ResultSetMetaData metaData = resultset.getMetaData();
		while (resultset.next())
			for (int i = 1; i < metaData.getColumnCount() + 1; i++)
				arrayData.add(resultset.getString(i));
	}

	private void setCardInfo(String card) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT CardID,`Card Name`, SetName, Type, Cost, `Function` "
												 + "FROM `Cards` " 
												 + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
												 + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID " 
												 + "WHERE `Card Name` = '" + card + "'");
		this.resultset = prepStatemnt.executeQuery();

	}

	public ArrayList<String> getCardInfo(String card) throws SQLException {
		setCardInfo(card);
		return arrayData;

	}

	private void setCardType(String name) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT Type " 
												 + "FROM CardTypes "
												 + "JOIN Cards ON CardTypes.TypeID = Cards.TypeID " 
												 + "WHERE `Card Name` = '" + name + "'");
		dataToArrayList(this.resultset = prepStatemnt.executeQuery());
	}

	public ArrayList<String> getCardType(String name) throws SQLException {
		setCardType(name);
		return arrayData;
	}

	private void setCardSet(String name) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT SetName " 
												 + "FROM `Cards` "
												 + "JOIN CardSets ON Cards.SetID = CardSets.SetID " 
												 + "WHERE `Card Name` = '" + name + "'");
		dataToArrayList(this.resultset = prepStatemnt.executeQuery());
	}

	public ArrayList<String> getCardSet(String name) throws SQLException {
		setCardSet(name);
		return arrayData;
	}

	private void setAllActionCards() throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT `Card Name` " 
												 + "FROM Cards "
											 	 + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID " 
												 + "WHERE Type LIKE 'action%'");
		dataToArrayList(this.resultset = prepStatemnt.executeQuery());
	}

	public ArrayList<String> getAllActionCards() throws SQLException {
		setAllActionCards();
		return arrayData;
	}

	private void setCurseCard() throws SQLException {
		prepStatemnt = connection.prepareStatement("Select CardID, `Card Name`, SetName, Type, Cost, `Function` "
												 + "FROM Cards " 
												 + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID "
												 + "JOIN CardSets ON Cards.SetID = CardSets.SetID " 
												 + "WHERE Type = 'Curse'");
		dataToArrayList(this.resultset = prepStatemnt.executeQuery());
	}

	public ArrayList<String> getCurseCard() throws SQLException {
		setCurseCard();
		return arrayData;
	}

	private void setCardFunction(String name) throws SQLException {
		prepStatemnt = connection.prepareStatement("Select `Function` " 
												 + "FROM Cards " 
												 + "WHERE  `Card Name` = '" + name + "'");
		dataToArrayList(this.resultset = prepStatemnt.executeQuery());
	}

	public ArrayList<String> getCardFunction(String name) throws SQLException {
		setCardFunction(name);
		return arrayData;
	}

	private void setCardCosts(String name) throws SQLException {
		prepStatemnt = connection.prepareStatement("SELECT Cost " 
												 + "FROM Cards " 
												 + "WHERE `Card Name` = '" + name + "'");
		dataToArrayList(this.resultset = prepStatemnt.executeQuery());
	}

	public ArrayList<String> getCardCosts(String name) throws SQLException {
		setCardCosts(name);
		return arrayData;
	}

}
