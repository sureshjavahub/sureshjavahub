package july__25__07__2024;
import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/ViewProducts")

public class View__Products__Servlet extends HttpServlet

{
@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	HttpSession ss = req.getSession(false);
	if( ss!=null)
	{
		try {
			ArrayList<Product__Bean> products = new View__Products__DAO().getProducts();
			ss.setAttribute("al", products);
			req.getRequestDispatcher("View__Products.jsp").forward(req, res);
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else
	{
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}
}
}
