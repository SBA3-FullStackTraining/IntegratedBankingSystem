package com.banking.ibs.controller.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.ibs.dto.LoanPreclose;

/**
 * Servlet implementation class CustReqLoanPreclose
 */
@WebServlet("/loanpreclosereqform")
public class CustReqLoanPreclose extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustReqLoanPreclose() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String laccnum = request.getParameter("loanaccountnumber");
		String preclose = request.getParameter("lclose");
		
		
		LoanPreclose lpreclose = new LoanPreclose(preclose, laccnum);
		
		 //fetch values from jsp
	    HttpSession session = request.getSession();
		session.setAttribute("lpreclose", lpreclose );
		
		//
		if(preclose.equals("c")) {
			response.sendRedirect("pcconfirm.jsp");
		}else {
			response.sendRedirect("loan-preclose.jsp");
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
