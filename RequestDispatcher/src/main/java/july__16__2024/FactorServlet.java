package july__16__2024;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/FactorServlet")

public class FactorServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		Integer val = Integer.valueOf(req.getParameter("value"));
		String s="";
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		RequestDispatcher rs = req.getRequestDispatcher("input.html");
		
		for(Integer i=1;i<=val;i++)
		{
			if(val%i==0)
			{
				s+=i+" ";
			}
		}
		pw.println("factors of "+val+" are: "+s);
		rs.include(req, res);
		
		
		
		
	}

}
