package svl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class med_login
 */

@WebServlet("/med_reg")
public class med_reg extends HttpServlet 
{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public med_reg() {
        super();
        // TODO Auto-generated constructor stub

}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Symptoms = request.getParameter("Symptoms");
		String Time_of_incident = request.getParameter("Time_of_incident");
		String Medication = request.getParameter("Medication");
		String Insurance = request.getParameter("Insurance");
		String Address = request.getParameter("Address");
		String Contact = request.getParameter("Contact");
		if(Symptoms.isEmpty() || Time_of_incident.isEmpty() || Medication.isEmpty() || 
				Insurance.isEmpty() || Address.isEmpty() || Contact.isEmpty() )
	
			
			
	{
		RequestDispatcher req = request.getRequestDispatcher("Evaluation.jsp");
		req.include(request, response);
	}
	else
	{
		RequestDispatcher req = request.getRequestDispatcher("Chatroom.jsp");
		req.forward(request, response);
	}
	
	}
}