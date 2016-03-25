package Model;

import java.sql.*; // for standard JDBC programs
import java.util.*;

public class DBConnection {
	private static String url = "jdbc:mysql://185.13.227.167:3306/michiai147_domin";
	private static  String user = "michiai147_domin";
	private static  String pass = "projdominion2016";
	private static Connection connection;
	private ResultSet resultset;
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

    private void setSelectQuery(String table, String columns, String where) throws SQLException {
        prepStatemnt = connection.prepareStatement("SELECT " + columns + " "
                + "FROM " + table + " " 
                + "JOIN CardSets ON Cards.SetID = CardSets.SetID "
                + "JOIN CardTypes ON Cards.TypeID = CardTypes.TypeID " 
                + (where.equals("") ? "" : "WHERE " + where));
        
        dataToArrayList(this.resultset = prepStatemnt.executeQuery());
    }
    
    public ArrayList<String> getSelectQuery(String table, String columns, String where) throws SQLException {
        setSelectQuery(table, columns, where);
        return arrayData;
    }
}
