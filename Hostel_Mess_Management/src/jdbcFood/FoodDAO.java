package jdbcFood;
import java.sql.*;

import ConnectionConfig.Connector;

public class FoodDAO {
	Connection con;
	PreparedStatement ps;
	public FoodDAO() throws Exception{
		con=Connector.getConnection();
		
	}
	
	public void addFood(Food f) throws Exception{
		try
		{
			ps=con.prepareStatement("insert into food values(?,?,?);");
			ps.setInt(1,f.getfid());
			ps.setString(2, f.getfname());
			ps.setString(3, f.getV_N());
			
			ps.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	
	}
	
	public void deleteFood(int foodid) throws Exception{
		try
		{
			ps=con.prepareStatement("delete from food where fid=?");
			ps.setInt(1,foodid);
			ps.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
