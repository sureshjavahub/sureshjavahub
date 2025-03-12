package july__17__2024;

import java.io.IOException;
import java.lang.reflect.GenericSignatureFormatError;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.*;
@WebServlet("/Request_Dispatcher_Servlet")

public class Request___Dispatcher__Servlet  extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	
	{
		RequestDispatcher rs = req.getRequestDispatcher("Employee.jsp");
		rs.forward(req, res);
		
	}

}
;