package jdbcServes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ConnectionConfig.Connector;
import jdbcFood.Food;

public class ServesDAO {
	Connection con;
	PreparedStatement ps;
	public ServesDAO() throws Exception{
		con=Connector.getConnection();
	}
	
	public void updateServes(Serves s) throws Exception{
		try {
			ps=con.prepareStatement("update serves set fid=? where hid=? and fday=? and ftime=?");
			ps.setInt(1, s.getFid());
			ps.setInt(2, s.getHid());
			ps.setString(3, s.getFday());
			ps.setString(4, s.getFtime());
			
			ps.executeUpdate();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}
	
	public List<Food> selectFood(Serves s) throws Exception{
		ps=con.prepareStatement("select fid from serves where hid=? and fday=? and ftime=?");
		ps.setInt(1, s.getHid());
		ps.setString(2, s.getFday());
		ps.setString(3, s.getFtime());
		ResultSet rs=ps.executeQuery();
		int id = 0;
		while(rs.next()) {
			id=rs.getInt(1);
		}
		ps=con.prepareStatement("select fname,V_N from food where fid=?");
		ps.setInt(1, id);
		ResultSet r=ps.executeQuery();
		List<Food> list=new ArrayList<>();
		Food f=null;
		while(r.next()) {
			f=new Food(id,r.getString(1),r.getString(2));
			list.add(f);
		}
		return list;
	}
	/*public static void main(String args[])
	{
		try
		{
			ServesDAO s1=new ServesDAO();
			Serves s=new Serves(0,1,"Friday","Breakfast");
			List<Food> list=new ArrayList<>();
			list=s1.selectFood(s);
				System.out.println(list.get(0).getfname());
				System.out.println(list.get(0).getV_N());
			
				
				
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}*/

}

