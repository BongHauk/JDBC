import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.dribver.OracleDriver");
			DriverManager.getConnection(url,"scott","tiger");
			
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
