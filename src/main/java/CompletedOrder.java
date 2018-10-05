
import com.dealership.cars.Oders.ProcessedOrder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/CompletedOrder"})
public class CompletedOrder extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        response.getWriter().printf("Order processed successfully");
        response.getWriter().printf("Your order number is 1111111111");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        ProcessedOrder processedOrder = (ProcessedOrder) session.getAttribute("final_order");
        processedOrder.setOrderNumber((long) 1111111111);
        response.sendRedirect("OrderSuccessful.jsp");

    }

}