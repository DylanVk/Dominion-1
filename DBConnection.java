
import java.sql.*; // for standard JDBC programs
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

		ArrayList<String> rowValues = new ArrayList<String>();
		ResultSetMetaData metaData = result.getMetaData();
		// while (result.next()) {
		// for (int i = 1; i < metaData.getColumnCount(); i++) {
		// rowValues.add(result.getString(i));
		// }
		//
		// }
		//
		// for (String data : rowValues) {
		// System.out.println(data);
		// }

		String[][] array = new String[metaData.getColumnCount()][2];
			for (int i = 0; i < array.length; i++) {
				while(result.next()){
					array[i][0] = result.getString(i);
				}
			}

	}

	private void setCardInfo(String card) throws SQLException {
		this.resultset = stmnt.executeQuery("SELECT CardID,`Card Name`, SetName, Type, Cost, `Function` FROM `Cards` "
				+ "JOIN CardSets ON Cards.SetID = CardSets.SetID "
				+ "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID " + "WHERE `Card Name` = '" + card + "'");

	}

	private void setCardInfo() throws SQLException {
		this.resultset = stmnt.executeQuery("SELECT CardID,`Card Name`, SetName, Type, Cost, `Function` "
				+ "FROM `Cards` " + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
				+ "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID ORDER BY CardID");
	}

	public ResultSet getCardInfo(String card) throws SQLException {
		setCardInfo(card);
		return resultset;

	}

	public ResultSet getCardInfo() throws SQLException {
		setCardInfo();
		return resultset;

	}

	private void setCardType(String name) throws SQLException {
		this.resultset = stmnt.executeQuery("SELECT Type " + "FROM CardTypes "
				+ "JOIN Cards ON CardTypes.TypeID = Cards.TypeID " + "WHERE `Card Name` = '" + name + "'");
	}

	public ResultSet getCardType(String name) throws SQLException {
		setCardType(name);
		return resultset;
	}

}
