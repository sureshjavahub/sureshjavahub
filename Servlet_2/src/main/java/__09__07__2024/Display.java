package __09__07__2024;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/srr")

public class Display implements Servlet 
{

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
		String Id=req.getParameter("U_Id");
		String Fname=req.getParameter("F_name");
		String lname=req.getParameter("L_name");
		String MId=req.getParameter("M_Id");
		String PhNo=req.getParameter("Ph_No");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("User_Id"+Id+"<br>");
		pw.println("User_F_Name"+Fname+"<br>");
		pw.println("User_L_Name"+lname+"<br>");
		pw.println("User_Mail_Id"+MId+"<br>");
		pw.println("User_Ph_No"+PhNo+"<br>");
		
		
	
		
	}

}
