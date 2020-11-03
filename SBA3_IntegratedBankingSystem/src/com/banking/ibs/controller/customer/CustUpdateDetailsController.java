package com.banking.ibs.controller.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.ibs.dao.serviceImpl.LoginPageDAOImpl;

/**
 * Servlet implementation class CustUpdateDetailsController
 */
@WebServlet("/customerUpdateDetails")
public class CustUpdateDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private LoginPageDAOImpl loginDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
    	String driver = config.getServletContext().getInitParameter("jdbcDriver");
    	String url = config.getServletContext().getInitParameter("jdbcUrl");
    	String username = config.getServletContext().getInitParameter("jdbcUsername");
    	String password = config.getServletContext().getInitParameter("jdbcPassword");
    	
    	this.loginDAO = new LoginPageDAOImpl(driver, url, username, password);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(request.getParameter("passwordReset")!=null || request.getParameter("newPassword")!=null)
		{
			if(request.getParameter("passwordReset")!=null)
			{
				session.setAttribute("passwordReset", "request");
			}
			else
			{
				String newPassword = request.getParameter("newPassword").toString();
				String userID = session.getAttribute("userID").toString();
				
				boolean changeUpdate = loginDAO.changePassword("customer", userID, newPassword);
				
				session.setAttribute("passwordReset", Boolean.toString(changeUpdate));
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("resources/jsp/identityManagement/customerResetPassword.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
