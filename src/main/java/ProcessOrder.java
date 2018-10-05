import com.dealership.cars.Oders.OderDetails;
import com.dealership.cars.Oders.ProcessedOrder;
import com.dealership.cars.Validation.customerDetailsValidation;
import com.dealership.cars.repository.Availability;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Calendar;

@WebServlet(urlPatterns = {"/ProcessOrder"})
public class ProcessOrder extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        response.getWriter().printf("Processing Order....");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String streetName = request.getParameter("street_name");
        String zipCode = request.getParameter("zip_code");
        String ccNumber = request.getParameter("cc_number");
        String expDate = request.getParameter("exp_date");
        String secCode = request.getParameter("sec_code");

        if(firstName != null && lastName != null && streetName != null && zipCode != null && ccNumber != null && expDate != null && secCode != null)
        {

            if(customerDetailsValidation.isFirstNameValid(firstName) && customerDetailsValidation.isFirstNameValid(lastName))
            {
                response.getWriter().printf("Processing Order....");
                Calendar cal = Calendar.getInstance();
                HttpSession session = request.getSession();
                OderDetails orderDetails = (OderDetails) session.getAttribute("carType");
                ProcessedOrder processedOrder = new ProcessedOrder();
                processedOrder.setOrderDetails(orderDetails);
                processedOrder.setFirstName(firstName);
                processedOrder.setLastName(lastName);
                processedOrder.setStreetName(streetName);
                processedOrder.setZipCode(zipCode);
                processedOrder.setCCNumber(ccNumber);
                processedOrder.setExpiryDate(expDate);
                processedOrder.setSecurityCode(secCode);
                processedOrder.setOrderDate(cal.getTime());
                session.setAttribute("final_order", processedOrder);

                try
                {
                    Thread.sleep(5000);
                    response.getWriter().printf("Completing Order....");
                    Thread.sleep(5000);
                    response.sendRedirect("FinalOrderSummary.jsp");
                }
                catch(Exception e)
                {

                }
            }
            else
            {
                response.sendRedirect("ErrorCustomerDetails.jsp");
            }


        }
        else
        {
            response.sendRedirect("ErrorCustomerDetails.jsp");
        }



    }

}