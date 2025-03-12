package __08__07__2024;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/dis")
public class Servlet__1 implements Servlet {

	@Override
	public void destroy() {
		// no code

	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		
		return "";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// no code

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String user_name=req.getParameter("U_name");
		String mail_Id=req.getParameter("M_Id");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("user name:"+user_name+"<br>");
		pw.println("Mail  id:"+mail_Id+"<br>");

	}

}
 