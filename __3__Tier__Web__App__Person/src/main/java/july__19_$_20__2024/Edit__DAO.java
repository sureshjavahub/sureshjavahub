package july__19_$_20__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Edit__DAO
{
	int k=0;
public int update(PersonBean pb) throws SQLException
{
	Connection con = DB__Connection.getCon();
	PreparedStatement ps = con.prepareStatement("update Person__Details set f_name=?,l_name=?,address=?,mail=?,phone=? where u_name='suresh'");
	ps.setString(1, pb.getF_name());
	ps.setString(2, pb.getL_name());
	ps.setString(3, pb.getAddress());
	ps.setString(4, pb.getMail());
	ps.setLong(5, pb.getPhone());
	 k = ps.executeUpdate();
	
	return k; 
}
}
