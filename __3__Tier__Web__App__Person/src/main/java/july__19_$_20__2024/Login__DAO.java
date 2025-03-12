package july__19_$_20__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login__DAO 
{
	public PersonBean pb=null;
	public PersonBean login(String U_name,String pwd) throws SQLException 
	{
		Connection con = DB__Connection.getCon();
		PreparedStatement ps = con.prepareStatement("select * from Person__Details  where U_name=? and pwd=?");
		ps.setString(1, U_name);
		ps.setString(2, pwd);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			pb=new PersonBean();
			pb.setU_name(U_name);
			pb.setAddress(pwd);
			pb.setF_name(rs.getString(3));
			pb.setL_name(rs.getString(4));
			pb.setAddress(rs.getString(5));
			pb.setMail(rs.getString(6));
			pb.setPhone(rs.getLong(7));
			
			
		}
		return pb;
	}

}
