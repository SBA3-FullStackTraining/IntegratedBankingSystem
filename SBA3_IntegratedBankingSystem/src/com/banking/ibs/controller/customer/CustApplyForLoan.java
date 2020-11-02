package com.banking.ibs.controller.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.ibs.dto.ApplyLoan;

/**
 * Servlet implementation class CustApplyForLoan
 */
@WebServlet("/loansummary")
public class CustApplyForLoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustApplyForLoan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//fetch values from CustApplyForLoan
		String loantype = request.getParameter("ltype");
		String loanamt = request.getParameter("loanamount");
		String loantenure = request.getParameter("loanmonths");
		
		//generate loan application number 
		char lt = loantype.charAt(0);
		Random appnum = new Random();
		int a = appnum.nextInt();
		String app = Integer.toString(a);
		String appnumber = lt+app;	
		/*
		 * PrintWriter writer = response.getWriter();
		 * writer.write("<H1>Thank you for your loan application</H1>");
		 * writer.write("<H2>Loan amount requested "+loanamt+"</H2>");
		 */
		//fetch values
		ApplyLoan applyloan = new ApplyLoan(loantype, loanamt, loantenure, appnumber);
		
		//request scope
		
		 //request.setAttribute("applyloan", applyloan); 
		// ApplyLoan applyl = (ApplyLoan) request.getAttribute("applyloan");
		
		
		//session scope
		HttpSession session = request.getSession();
		session.setAttribute("applyloan", applyloan );
		//ApplyLoan apply2 = (ApplyLoan) session.getAttribute("applyloan");
		
		response.sendRedirect("loan-confirm.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
