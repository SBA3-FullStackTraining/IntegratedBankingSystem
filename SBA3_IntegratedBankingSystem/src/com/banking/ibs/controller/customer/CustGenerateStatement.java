package com.banking.ibs.controller.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.ibs.dto.LoanStatement;

/**
 * Servlet implementation class CustGenerateStatement
 */
@WebServlet("/loanstatement")
public class CustGenerateStatement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustGenerateStatement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String lacctnumber = request.getParameter("loanaccountnumber");
	    String startdate = request.getParameter("startdate");
	    String enddate = request.getParameter("enddate");
	    
	    LoanStatement lstatement = new LoanStatement(lacctnumber, startdate, enddate);
	    
	    //fetch values from jsp
	    HttpSession session = request.getSession();
		session.setAttribute("lstatement", lstatement );
	    
		
		//redirect
		response.sendRedirect("loan-statement.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
