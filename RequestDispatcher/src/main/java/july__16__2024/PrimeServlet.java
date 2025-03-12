package july__16__2024;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")

public class PrimeServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Integer val = Integer.valueOf(req.getParameter("value"));
		PrintWriter pw = res.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("input.html");
		res.setContentType("text/html");
		Integer count=0;
		
		if(val==2)
		{
			pw.println(val+" is prime");
		}
		
		else  {
			
		
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			{
				count++;
				pw.println("not a prime");
				
				break;
			}
			
			
		}
		if(count==0)
		{
			pw.println("Prime number");
		}
		
		}
		
		
		rd.include(req, res);
		
		
	}

}
