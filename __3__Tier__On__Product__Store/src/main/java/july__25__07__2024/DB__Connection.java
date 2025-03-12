package july__25__07__2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB__Connection 
{
private static Connection con=null;

public static Connection getCon() {
	return con;
}
private DB__Connection()
{
	
}
static
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection(DB__Information.DBURL, DB__Information.U_NAME, DB__Information.PASSWARD);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}



}
