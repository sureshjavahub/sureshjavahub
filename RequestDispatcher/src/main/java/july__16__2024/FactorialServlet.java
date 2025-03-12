package july__16__2024;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/FactorialServlet")

public class FactorialServlet extends GenericServlet

{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	
	{
	Integer val = Integer.valueOf(req.getParameter("value"));
	Float result=1f;
	RequestDispatcher rs = req.getRequestDispatcher("input.html");
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	for(Integer i=val;i>1;i--)
	{
		result*=i;
	}
	
	pw.println("The factorial of "+val+" is "+result);
	rs.include(req, res);

}
}
