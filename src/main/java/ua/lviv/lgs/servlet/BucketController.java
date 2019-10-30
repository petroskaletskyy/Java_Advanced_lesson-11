package ua.lviv.lgs.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.lviv.lgs.domain.BucketOrder;
import ua.lviv.lgs.service.BucketOrderService;
import ua.lviv.lgs.service.impl.BucketOrderServiceImpl;

@WebServlet("/bucket")
public class BucketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BucketOrderService bucketService = BucketOrderServiceImpl.getBucketOrderServiceImpl();   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer bookId = Integer.parseInt(request.getParameter("bookId"));
		
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("customerId");
		
		BucketOrder bucket = new BucketOrder(userId, bookId, new Date());
		bucketService.create(bucket);
		
		response.setContentType("text");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("Success");
	}

}
