package july__25__07__2024;

import java.io.IOException;

import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/AdminLoginServlet")

public class Admin__Login__Servlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		try {
			Admin__Bean ab = new Admin__DAO().login(req.getParameter("U_name"), req.getParameter("PWD"));
			if(ab==null)
			{
			req.setAttribute("msg", "invalid Credentials...");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			}
			
			else
			{
				HttpSession ss = req.getSession();
				ss.setAttribute("adminBean", ab);
				
				req.getRequestDispatcher("Admin__Login__Sucess.jsp").forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
