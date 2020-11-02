package com.banking.ibs.controller.customer;

import java.io.IOException;
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
 * Servlet implementation class CustRegistrationFormController
 */
@WebServlet("/custRegister")
public class CustRegistrationFormController extends HttpServlet {
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
		HttpSession session = request.getSession();
		
		Customer newCustomer = new Customer("TBD", "TBD", request.getParameter("firstname"), request.getParameter("lastname"),
				request.getParameter("phone"), request.getParameter("email"), request.getParameter("dob"), request.getParameter("city"),
				request.getParameter("state"), request.getParameter("country"), request.getParameter("pincode"), request.getParameter("address"), 
				request.getParameter("id_proof"), request.getParameter("id_number"));
		
		boolean updateFlag = loginDAO.addNewRegisteredCustomer(newCustomer);
		
		session.setAttribute("updateFlag", Boolean.toString(updateFlag));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("resources/jsp/identityManagement/customerRegistrationStatus.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
