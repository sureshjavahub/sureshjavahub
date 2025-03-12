package july__25__07__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update__Product__DAO

{
public Integer update_Product(Product__Bean pb) throws SQLException
{
	Connection con = DB__Connection.getCon();
	
	PreparedStatement ps = con.prepareStatement("update  Product_1 set price=?,quantity=? where code=?");
	ps.setFloat(1, pb.getPrice());
	ps.setInt(2, pb.getQTY());
	ps.setString(3, pb.getCode());
	int k = ps.executeUpdate();
	return k;
	
	
}
}
