package jdbcStaff;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ConnectionConfig.Connector;

public class StaffDAO {
	Connection con;
	PreparedStatement ps;
	public StaffDAO() throws Exception{
		con=Connector.getConnection();
		
	}
	
	public void addStaff(Staff s) throws Exception{
		try
		{
			ps=con.prepareStatement("insert into staff values(?,?,?,?,?,?,null);");
			ps.setInt(1,s.getsid());
			ps.setString(2, s.getlname());
			ps.setString(3, s.getfname());
			ps.setString(4, s.getdob());
			ps.setString(5, s.getaddress());
			ps.setString(6, s.getmobile());
			
			ps.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	
	}
	
	public void deleteStaff(int staffid) throws Exception{
		try
		{
			ps=con.prepareStatement("delete from staff where sid=?");
			ps.setInt(1,staffid);
			ps.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
