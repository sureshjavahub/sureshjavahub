package july__19_$_20__2024;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RegisterServlet")


public class RegisterServlet extends HttpServlet

{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		PersonBean pb = new PersonBean();
		pb.setU_name(req.getParameter("U_name"));
		pb.setPwd(req.getParameter("pwd"));
		pb.setF_name(req.getParameter("F_name"));
		pb.setL_name(req.getParameter("L_name"));
		pb.setAddress(req.getParameter("address"));
		pb.setMail(req.getParameter("mail"));
		pb.setPhone(Long.valueOf(req.getParameter("phone")));
		try {
			int k = new Register__DAO().insert(pb);
			if(k>0)
			{
				req.setAttribute("msg","user registerd sucessfully");
				
				try {
					req.getRequestDispatcher("Register.jsp").forward(req,res);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
