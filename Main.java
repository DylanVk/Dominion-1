import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Game g1 = new Game(2);
		DBConnection connect = new DBConnection();
		connect.showResults(connect.getCardInfo("Smithy"));
	}

}
