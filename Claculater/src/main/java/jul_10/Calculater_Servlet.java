package jul_10;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/cal")

public class Calculater_Servlet implements Servlet
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
		Integer N_1=Integer.valueOf(req.getParameter("value_1"));
		Integer N_2=Integer.valueOf(req.getParameter("value_2"));
		String op=req.getParameter("op");
		//Integer r;
		PrintWriter pw = res.getWriter();
		
		 switch(op) {
		case "+":pw.println(N_1+"+"+N_2+"="+(N_1+N_2));	
		break;
		
		case "-":pw.println(N_1+"-"+N_2+"="+(N_1-N_2));
		break;
		
		case "x":pw.println(N_1+"x"+N_2+"="+(N_1*N_2));
		break;
		
		case "/":pw.println(N_1+"/"+N_2+"="+(N_1/N_2));
		break;

		default:
		pw.println("invalid operater");
			break; 
		}
		
	}

}
