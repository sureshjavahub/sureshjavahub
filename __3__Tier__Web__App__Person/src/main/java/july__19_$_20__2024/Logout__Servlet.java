package july__19_$_20__2024;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LogoutServlet")


public class Logout__Servlet extends HttpServlet

{
	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
		Cookie[] ck = req.getCookies();
		if(ck==null)
		{
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			ServletContext sc = req.getServletContext();
			sc.removeAttribute("personBean");
			ck[0].setMaxAge(0);
			res.addCookie(ck[0]);
			req.setAttribute("msg", "user loged out sucessfully....");
		}
		
		req.getRequestDispatcher("Logout.jsp").forward(req, res);
}
}
