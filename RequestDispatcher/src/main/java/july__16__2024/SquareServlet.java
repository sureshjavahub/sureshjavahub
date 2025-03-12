package july__16__2024;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
//import java.lang.Math;

@WebServlet("/SquareServlet")

public class SquareServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	
	{
		Integer val = Integer.valueOf(req.getParameter("value"));
		RequestDispatcher rd = req.getRequestDispatcher("input.html");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Square of "+val+" is "+val*val);
		rd.include(req, res);
		
		
		
	}

}
