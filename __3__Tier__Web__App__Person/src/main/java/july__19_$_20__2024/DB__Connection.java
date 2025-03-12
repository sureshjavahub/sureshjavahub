package july__19_$_20__2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB__Connection 
{
	
	private static Connection con=null;
	
	private DB__Connection()
	{}
	
	static
	{
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				 con = DriverManager.getConnection(DB__Information.DBURL, DB__Information.U_NAME, DB__Information.PASSWARD);
			} catch (SQLException e) 
			
			{
				
				//Connection con;
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
public static Connection getCon()
{
return con;	
}

}
