package svl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.UserDAO;
import usercl.User;

import java.io.*;
import java.sql.SQLException;
 
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class med_login
 */

@WebServlet("/med_login")
public class med_login extends HttpServlet 
{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public med_login() {
        super();
        // TODO Auto-generated constructor stub

}
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		String username = request.getParameter("username");
    		String password = request.getParameter("password");
    	
    		
    		if(username.isEmpty() || password.isEmpty() )
    		{
    			RequestDispatcher req = request.getRequestDispatcher("/index.jsp");
    			req.include(request, response);
    		}
    		else
    		{
    			RequestDispatcher req = request.getRequestDispatcher("/Evaluation.jsp");
    			req.forward(request, response);
    		}
    	}

    }
	
	

	