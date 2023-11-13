package jdbcWorks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import ConnectionConfig.Connector;



public class WorksDAO {
	Connection con;
	PreparedStatement ps;
	public WorksDAO() throws Exception{
		con=Connector.getConnection();
	}
	
	public void updateWorks(Works w) throws Exception{
		try {
			ps=con.prepareStatement("update works set sid=? where hid=? and wday=? and wtime=?");
			ps.setInt(1, w.getsid());
			ps.setInt(2, w.gethid());
			ps.setString(3, w.getwday());
			ps.setString(4, w.getwtime());
			
			ps.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}
	public String selectHostel(Works w) throws Exception{
		ps=con.prepareStatement("select hid from works where sid=? and wday=? and wtime=?");
		ps.setInt(1, w.getsid());
		ps.setString(2, w.getwday());
		ps.setString(3, w.getwtime());
		ResultSet rs=ps.executeQuery();
		int id=0;
		while(rs.next()) {
			id=rs.getInt(1);
		}
		ps=con.prepareStatement("select hname from hostel where hid=?");
		ps.setInt(1, id);
		ResultSet r=ps.executeQuery();
		String name=null;
		while(r.next()) {
			name=r.getString(1);
		
		}
		return name;
	}
	public static void main(String args[])
	{
		try
		{
			WorksDAO w1=new WorksDAO();
			Works w=new Works(2,0,"Monday","Lunch");
			String name=w1.selectHostel(w);
			System.out.println(name);
				
				
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
