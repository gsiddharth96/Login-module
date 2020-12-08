package com.login.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendUrl")
public class SendUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public SendUrl() {
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CustomerDAO cd=new CustomerDAOImpl();
		String str=request.getParameter("url");
		InputUrl u=new InputUrl();
		
			u.setUrl(str);
			cd.insertUrl(u);
			
			request.setAttribute("successMassage", str);
			request.getRequestDispatcher("record.jsp").forward(request, response);
	}

}
