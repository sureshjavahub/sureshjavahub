package __10__07__2024;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Login_Servlet")

public class Login_Servlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name="name";
		String password="12345";
		
		String parameter_1 = req.getParameter("U_name");
		String parameter_2= req.getParameter("pwd");
		if(name.equalsIgnoreCase(parameter_1)&&password.equals(parameter_2))
		{
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			pw.println("Welcome "+name);
		}
		
		else
		{
			PrintWriter pw = res.getWriter();
			pw.println("sorry username or password error");
		}

	}

}
