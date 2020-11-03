package com.banking.ibs.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

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
 * Servlet implementation class AdminHomePageController
 */
@WebServlet("/adminHome")
public class AdminHomePageController extends HttpServlet {
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID = request.getParameter("adminID");
		String password = request.getParameter("password");

		PrintWriter writer = response.getWriter();
		HashMap<String, String> cred_map = loginDAO.getUserCredData("admin");

		if(cred_map.keySet().contains(userID) && cred_map.get(userID).equals(password)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("userID", userID);

			RequestDispatcher dispatcher = request.getRequestDispatcher("resources/jsp/identityManagement/adminHome.jsp");
			dispatcher.forward(request, response);
		}
		else 
		{
			response.sendRedirect("./resources/html/invalidCredentials.html"); 
		}
	}

}
