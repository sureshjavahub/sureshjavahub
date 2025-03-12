package july__25__07__2024;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Product__Update__Servlet")
public class Update__Product__Servlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
	HttpSession ss = req.getSession(false);
	
	if(ss!=null)
	{
		ArrayList<Product__Bean> al=(ArrayList<Product__Bean>)ss.getAttribute("al");
		String P_code = req.getParameter("code");
		Iterator<Product__Bean> itr = al.iterator();
		while(itr.hasNext())
		{
			Product__Bean pb = itr.next();
			if(P_code.equals(pb.getCode()))
			{
				pb.setName(req.getParameter("name"));
				pb.setPrice(Float.valueOf(req.getParameter("price")));
				pb.setQTY(Integer.valueOf(req.getParameter("QTY")));
				Integer k=0;
				try {
					 k = new Update__Product__DAO().update_Product(pb);
					 if(k>0)
						{
							req.getRequestDispatcher("Product__Update__Sucess.jsp").forward(req, res);
					
						}
					 else
					 {
						 req.getRequestDispatcher("Msg.jsp").forward(req, res);
					 }
				} 
				
				
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
	}
}


}
