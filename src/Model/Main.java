package Model;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Game g1 = new Game(2);
		DBConnection connect = new DBConnection();
		
		/* --- possible functions to get resultsets --- */
			connect.showResults(connect.getCardInfo("Smithy"));
			connect.showResults(connect.getCardType("Duchy"));
			connect.showResults(connect.getCardSet("Duchy"));
	}
}
