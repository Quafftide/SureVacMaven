package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Customer;
import EntityDAO.CustomerDAO;

/**
 * Servlet implementation class CustomerRegisterServlet
 */
@WebServlet("/CustomerRegisterServlet")
public class CustomerRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//PrintWriter out = response.getWriter();
		
		String cust_name = request.getParameter("cust_name");
		String cust_email = request.getParameter("cust_email");
		String cust_city = request.getParameter("cust_city");
		String cust_country = request.getParameter("cust_country");
		String cust_complaint= request.getParameter("cust_complaint");
		String cust_pwd = request.getParameter("cust_pwd");
		
		CustomerDAO dao = new CustomerDAO();
		Customer c = new Customer(cust_name, cust_email, cust_city, cust_country, cust_complaint,cust_pwd);
		dao.addCustomerComplaint(c);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
