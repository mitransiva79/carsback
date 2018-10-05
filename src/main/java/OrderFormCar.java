import com.dealership.cars.Oders.OderDetails;
import com.dealership.cars.repository.Availability;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = {"/OrderFormCar"})
public class OrderFormCar extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String carName = request.getParameter("car_type");
        if(carName != null && carAvailability(carName))
        {
            response.getWriter().printf("car searched for is: %s", carName);
        }
        else
        {
            response.getWriter().printf("enter a valid car");
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String carName = request.getParameter("car_type");
        if(!carName.equalsIgnoreCase("") && carName != null && carAvailability(carName))
        {
            OderDetails order = new OderDetails();
            order.setCarType(carName);
            // store the User object in the session
            HttpSession session = request.getSession();
            session.setAttribute("carType", order);
            response.sendRedirect("CarColor.jsp");
        }
        else
        {
            response.sendRedirect("ErrorCar.jsp");
        }

    }




    private static boolean carAvailability(String car)
    {
        if(car != null && Availability.isCarMakeAvailable(car))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
