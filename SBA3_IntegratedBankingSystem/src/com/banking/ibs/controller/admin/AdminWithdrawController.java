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

import com.banking.ibs.dao.serviceImpl.AccountManagementDAOImpl;
import com.banking.ibs.dao.serviceImpl.LoginPageDAOImpl;

/**
 * Servlet implementation class AdminWithdrawController
 */
@WebServlet("/AdminWithdrawController")
public class AdminWithdrawController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AccountManagementDAOImpl accountManagementDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
    	String driver = config.getServletContext().getInitParameter("jdbcDriver");
    	String url = config.getServletContext().getInitParameter("jdbcUrl");
    	String username = config.getServletContext().getInitParameter("jdbcUsername");
    	String password = config.getServletContext().getInitParameter("jdbcPassword");
    	
    	this.accountManagementDAO = new AccountManagementDAOImpl(driver, url, username, password);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accountNumber = request.getParameter("accountNumber");
		String accountbalance = request.getParameter("accountbalance");

		PrintWriter writer = response.getWriter();
		HashMap<String, String> cred_map = accountManagementDAO.getUserAcc_Data();

		if(cred_map.keySet().contains(accountNumber) && cred_map.get(accountNumber).equals(accountbalance)) {

			//response.sendRedirect("home.html"); // static [pre-defined html file]

			//writer.write("<h1>Congratulations!</h1>");  // dynamic [on the fly html]
			//writer.write("<h2>Successfully logged in!</h2>");

			//-------------------------------------------------------------------------

			//request scope
			//request.setAttribute("username", username);

			//session scope
			HttpSession session = request.getSession();
			session.setAttribute("accountNumber", accountNumber);

			// application scope
			//ServletContext context =  this.getServletContext();
			//context.setAttribute("username", username);

			// continue the same request cycle
			RequestDispatcher dispatcher = request.getRequestDispatcher("./resources/jsp/accountManagement/Withdraw_Admin.jsp");
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
