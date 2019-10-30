package ua.lviv.lgs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lviv.lgs.domain.Customer;
import ua.lviv.lgs.service.CustomerService;
import ua.lviv.lgs.service.impl.CustomerServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService = CustomerServiceImpl.getCustomerService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("login");
		String password = request.getParameter("password");

		Customer customer = customerService.getCustomerByEmail(email);

		if ((customer != null) && (customer.getCustomerPassword().equals(password))) {
			request.setAttribute("userEmail", email);
			request.setAttribute("userFirstName", customer.getFirstName());
			request.getRequestDispatcher("cabinet.jsp").forward(request, response);

		}
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
