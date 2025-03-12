package july__25__07__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Product__DAO 
{
public int add_Product(Product__Bean pb) throws SQLException
{
	Connection con = DB__Connection.getCon();
	PreparedStatement ps = con.prepareStatement("insert into Product_1 values(?,?,?,?)");
	ps.setString(1, pb.getCode());
	ps.setString(2, pb.getName());
	ps.setFloat(3, pb.getPrice());
	ps.setInt(4, pb.getQTY());
	
	int k = ps.executeUpdate();
	return k;
}
}
