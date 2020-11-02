package com.banking.ibs.controller.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.ibs.dto.Payemi;

/**
 * Servlet implementation class CustPayEmi
 */
@WebServlet("/payloanemi")
public class CustPayEmi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustPayEmi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//fetch emaipayment details
		String loanacct = request.getParameter("loanacct");
		String emiamount =request.getParameter("emiamount");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		
		Payemi emipay = new Payemi(loanacct, emiamount, month, year);
		
		
		//session scope
		HttpSession session = request.getSession();
		session.setAttribute("emipay", emipay );
		
		response.sendRedirect("emi-confirm.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
