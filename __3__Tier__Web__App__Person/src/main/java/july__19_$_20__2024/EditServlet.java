package july__19_$_20__2024;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
private static final String PersonBean = null;

protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
	Cookie[] c = req.getCookies();
	if(c==null)
	{
		req.getRequestDispatcher("Msg.jsp").forward(req, res);;
	}
	
	else
	{
		
		PersonBean pb= (PersonBean)req.getServletContext().getAttribute("personBean");
	pb.setF_name(req.getParameter("F_name"));
	pb.setL_name(req.getParameter("L_name"));
	pb.setAddress(req.getParameter("address"));
	pb.setMail(req.getParameter("mail"));
	pb.setPhone(Long.valueOf(req.getParameter("phone")));	
	
	try {
		if(new Edit__DAO().update(pb)>0)
		{
			
			req.setAttribute("msg","Details Updated Successfully....");
			req.getRequestDispatcher("Update.jsp").forward(req,res);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
}
