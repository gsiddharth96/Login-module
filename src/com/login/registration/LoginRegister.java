package com.login.registration;

 import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginRegister() {
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDAO cd=new CustomerDAOImpl();
		String userName=request.getParameter("username");
		String password=request.getParameter("password1");
		String submitType=request.getParameter("submit");
		Customer c=new Customer();
		
		c=cd.getCustomer(userName, password);
		
		if(submitType.equals("login") && c!=null && c.getUsername()!=null){
			
			HttpSession session = request.getSession();
			session.setAttribute("username1", userName);
			
			request.setAttribute("massage", c.getUsername());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else if(submitType.equals("register")){
			c.setPassword(password);
			c.setUsername(userName);
			
			cd.insertCustomer(c);
			
			request.setAttribute("successMassage", "Registration done!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		//else if(submitType.equals("logout")){
//			HttpSession session = request.getSession();
//			session.removeAttribute("username1");
//			session.invalidate();
//			request.setAttribute("logoutMassage", "You are Logout!!!");
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//		}
		else{
			request.setAttribute("massage", "You are not Registered!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
