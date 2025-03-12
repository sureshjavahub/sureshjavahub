package july__25__07__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin__DAO 

{
	
	public Admin__Bean ab=null;
	public Admin__Bean login(String U_name,String PWD) throws SQLException
	{
		 Connection con = DB__Connection.getCon();
		 PreparedStatement ps = con.prepareStatement("select * from Admin_1 where U_name=? AND PWD=?");
		 ps.setString(1, U_name);
		 ps.setString(2, PWD);
		 ResultSet rs = ps.executeQuery();
		 if(rs.next())
		 {
			 ab=new Admin__Bean();
			 ab.setU_name(U_name);
			 ab.setPWD(PWD);
			 ab.setF_name(rs.getString(3));
			 ab.setL_name(rs.getString(4));
			 ab.setAddrss(rs.getString(5));
			 ab.setMail(rs.getString(6));
			 ab.setPhone(rs.getLong(7));
			 
		 }
return  ab;
		 
		 
	}
	
		
	
	

}
