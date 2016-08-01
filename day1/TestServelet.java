package com.sang;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServelet
 */
@WebServlet("/TestServelet")
public class TestServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" doGet");
	//	response.getWriter().append(request.getContextPath());
		

		doPost(request, response);
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" doPost");
	//	response.getWriter().append(request.getContextPath());
	//	response.getWriter().append(" Hello! Sang Yuk");//request.getContextPath());
		response.getWriter().append(" You got 99.9 score in this class. <br/>");
		
		response.getWriter().append(" You are a excellent programer.");//request.getContextPath());
	     //   request.getRequestDispatcher("/NewFile.html").forward(request,response);
			
//request.getRequestDispatcher("/NewText.txt").forward(request,response);		
			// doGet(request, response);
	}

}
