package jdbcStoredProcedure;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demo1 {
	public static Connection getConnection() {

		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String user="root";
		String password="root";

		Connection conn=null;



		try {
			//load driver
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);

			if(conn!=null)
				System.out.println("Connected");
			else
				System.out.println("Error While Connecting");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Sql:"+e.getMessage()+",Error:"+e.getErrorCode());
		}


		return conn;
}
}
