package Model;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Game g1 = new Game(2);
		DBConnection connect = new DBConnection();
		
		/* --- possible functions to get ArrayLists --- */
			//connect.print(connect.getCardInfo("Smithy"));
			//connect.print(connect.getCardType("Duchy"));
			//connect.print(connect.getCardSet("Duchy"));
			//connect.print(getAllActionCards());
			connect.print(connect.getCardCosts("Duchy"));
	}
}
