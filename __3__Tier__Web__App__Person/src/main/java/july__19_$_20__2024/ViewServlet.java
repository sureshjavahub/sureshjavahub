package july__19_$_20__2024;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")


public class ViewServlet extends HttpServlet

{
	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
{
	Cookie[] c = req.getCookies();
if(c==null)
{
	req.setAttribute("msg", "invalid process...");
	req.getRequestDispatcher("Msg.html").forward(req, res);
}
else
{
	req.getRequestDispatcher("View.jsp").forward(req, res);
	//String F_name = c[0].getValue();
	//req.setAttribute("F_name", F_name);
}
	
}
}
