package com.murtaza.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.murtaza.dto.BookDetailsDTO;
import com.murtaza.service.BookMgmtService;
import com.murtaza.service.BookMgmtServiceImpl;


//* Servlet implementation class MainServletController
	@WebServlet("/controller")
public class MainServletController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainServletController() {
		super();
	}
	private BookMgmtService service;
	
	public void init(ServletConfig config)throws ServletException{
		service =new BookMgmtServiceImpl();
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		//read form data
		String category=req.getParameter("category");
		String outputType=req.getParameter("source");
	
		try {
			//use service 
			List<BookDetailsDTO>listDTO=service.searchBooksByCategory(category);
			//keep result in request scope
			req.setAttribute("bookList", listDTO);
			//forward to result jsp page based on the button clicked
			if(outputType.equalsIgnoreCase("HTML")) {
				RequestDispatcher rd=req.getRequestDispatcher("/html_print.jsp");
				rd.forward(req, res);
			}
			else {
				RequestDispatcher rd=req.getRequestDispatcher("/excel_screen.jsp");
				rd.forward(req, res);
			}
		}
		catch(Exception e) {
		System.out.println(e.getMessage());	
		}
		
	
		
	}
	public void destroy() {
		service=null;
	}
}
