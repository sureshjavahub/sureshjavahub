package july__25__07__2024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class View__Products__DAO
{
ArrayList<Product__Bean> al= new ArrayList<Product__Bean>();
public ArrayList<Product__Bean> getProducts() throws SQLException
{
	Connection con = DB__Connection.getCon();
	PreparedStatement ps = con.prepareStatement("select * from Product_1");
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		Product__Bean pb = new Product__Bean();
		pb.setCode(rs.getString(1));
		pb.setName(rs.getString(2));
		pb.setPrice(Float.valueOf(rs.getShort(3)));
		pb.setQTY(rs.getInt(4));
		
		al.add(pb);
		
		
	}
	return al;
}
}
