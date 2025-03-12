package july__25__07__2024;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Edit")

public class Edit__Servlet extends HttpServlet
{
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession ss = req.getSession(false);
		if(ss!=null)
		{
		
		@SuppressWarnings("unchecked")
		ArrayList<Product__Bean> al=(ArrayList<Product__Bean>)ss.getAttribute("al");
		String code = (String) req.getParameter("P_code");
		//System.out.println(code);
		Iterator<Product__Bean> itr = al.iterator();
		while(itr.hasNext())
		{
			Product__Bean pb = (Product__Bean)itr.next();
			if(code.equals(pb.getCode()))
			{
				req.setAttribute("pb", pb);
				req.getRequestDispatcher("Edit__Product.jsp").forward(req, res);
			}
			break;
		}
		
		}
		
	}

}
