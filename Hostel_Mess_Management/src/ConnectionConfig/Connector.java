package ConnectionConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;


public class Connector {
	private static Connection con;
	public static Connection getConnection() throws Exception{
		if(con==null) {
			ResourceBundle rs=ResourceBundle.getBundle("ConnectionConfig/mess");
			String driverPath=rs.getString("driverpath");
			String url=rs.getString("url");
			String user=rs.getString("user");
			String pass=rs.getString("pass");
			Class.forName(driverPath);
			con=DriverManager.getConnection(url,user,pass);
			
		}
		return con;
	}

}
