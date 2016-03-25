package Model;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Game g1 = new Game(2);
		DBConnection connect = new DBConnection();
		
		/* --- possible functions to get ArrayLists --- */
			//connect.getSelectQuery(tablename, columns, where-clause);
			connect.print(connect.getSelectQuery("Cards", "*", "CardName='Duchy'"));
	}
}
