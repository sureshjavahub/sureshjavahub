package july__19_$_20__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Register__DAO 

{
	public int insert(PersonBean pb) throws SQLException 
	{
		
		Connection con = DB__Connection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Person__Details values (?,?,?,?,?,?,?)");
			ps.setString(1, pb.getU_name());
			ps.setString(2, pb.getPwd());
			ps.setString(3, pb.getF_name());
			ps.setString(4, pb.getL_name());
			ps.setString(5, pb.getAddress());
			ps.setString(6, pb.getMail());
			ps.setLong(7, pb.getPhone());
			int k = ps.executeUpdate();
			return k;
			
	
	}
}
	
	

