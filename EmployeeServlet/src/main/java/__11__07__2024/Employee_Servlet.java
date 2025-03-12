package __11__07__2024;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/form")

public class Employee_Servlet implements Servlet {

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
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String Address = req.getParameter("add");
		String gender = req.getParameter("gender");
		Float sal = Float.valueOf(req.getParameter("sal"));
		String Profile = req.getParameter("profile");
		String[] hobby = req.getParameterValues("hobby");
		
		PrintWriter pw = res.getWriter();
		pw.println(id);
		pw.println(name);
		pw.println(Address);
		pw.println(gender);
		pw.println(sal);
		
		pw.println(Profile);
		for(String h:hobby)
		{
			pw.println(h);
		}
		
	}

}
