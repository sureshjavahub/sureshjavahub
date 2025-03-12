package july__19_$_20__2024;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")

public class LoginSetvlet extends HttpServlet
{
	
	@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws  IOException, ServletException
{
	Login__DAO login__DAO = new Login__DAO();
	try {
		PersonBean pb = login__DAO.login(req.getParameter("U_name"), req.getParameter("pwd"));
		
		if(pb==null)
		{
			req.setAttribute("msg", "invalid Login process....<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}
		else
		{
			ServletContext sc = req.getServletContext();
			sc.setAttribute("personBean",pb);
			
			Cookie ck=new Cookie("fname", req.getParameter("F_name"));
			res.addCookie(ck);
		
			req.getRequestDispatcher("LoginSucess.jsp").forward(req, res);
			
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
