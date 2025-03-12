package july__25__07__2024;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Add_Product_Servlet")

public class Add__Product__Servlet extends HttpServlet
{
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
{
		
		if(req.getSession(false) != null) 
		{
		Product__Bean pb = new Product__Bean();
		pb.setCode(req.getParameter("Pcode"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Float.valueOf(req.getParameter("price")));
		pb.setQTY(Integer.valueOf(req.getParameter("QTY")));
		
		try {
			int k = new Product__DAO().add_Product(pb);
			if( k>0)
			{
				req.setAttribute("msg", "Product added sucessfully....");
				req.getRequestDispatcher("Product.jsp").forward(req, res);
				
			}
			
			/*else
			{
				req.setAttribute("msg", "Prouct not added...");
				
				req.getRequestDispatcher("P__MSG.jsp").forward(req, res);
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		else
		{
			req.setAttribute("msg", "Session Expited Login again....");
			req.getRequestDispatcher("Session.jsp").forward(req, res);
			
		}
	
}
}
