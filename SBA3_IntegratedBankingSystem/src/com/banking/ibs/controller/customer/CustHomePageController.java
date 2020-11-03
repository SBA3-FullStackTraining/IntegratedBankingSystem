package com.banking.ibs.controller.customer;

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
import com.banking.ibs.dto.Customer;

/**
 * Servlet implementation class HomePageController
 */
@WebServlet("/customerHome")
public class CustHomePageController extends HttpServlet {
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

		if(request.getParameter("customerID")==null)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("resources/jsp/identityManagement/customerHome.jsp");
			dispatcher.forward(request, response);
			return;
		}

		String userID = request.getParameter("customerID");
		String password = request.getParameter("password");


		HashMap<String, String> cred_map = loginDAO.getUserCredData("customer");
		Customer customerInfo = loginDAO.getUserInfo("customer", userID);

		if(cred_map.keySet().contains(userID) && cred_map.get(userID).equals(password)) {

			session.setAttribute("userID", userID);
			session.setAttribute("password", password);

			session.setAttribute("username", customerInfo.getFirstName()+" "+customerInfo.getLastName());
			session.setAttribute("customerInfo", customerInfo);

			RequestDispatcher dispatcher = request.getRequestDispatcher("resources/jsp/identityManagement/customerHome.jsp");
			dispatcher.forward(request, response);
		}
		else 
		{
			response.sendRedirect("resources/html/invalidCredentials.html"); 
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
