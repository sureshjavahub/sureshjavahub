package july__16__2024;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/CallerServlet")

public class CallerServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String choice = req.getParameter("choice");
		if(choice.equalsIgnoreCase("Prime"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("PrimeServlet");
			rd.forward(req, res);
			
		}
		
		else if (choice.equalsIgnoreCase("Factor")) 
		{
				RequestDispatcher rd = req.getRequestDispatcher("FactorServlet");
				rd.forward(req, res);
		}
		else if (choice.equalsIgnoreCase("Factorial")) 
		{
			RequestDispatcher  rd = req.getRequestDispatcher("FactorialServlet");
			rd.forward(req, res);
			
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("SquareServlet");
			rd.forward(req, res);
		}
		
		
	}

}
