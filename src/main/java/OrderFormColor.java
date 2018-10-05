import com.dealership.cars.Oders.OderDetails;
import com.dealership.cars.repository.Availability;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/OrderFormColor", "*.ofc"})
public class OrderFormColor extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String carColor = request.getParameter("car_color");
        if(carColor != null && carAvailability("toyota", carColor))
        {
            response.getWriter().printf("color searched for is: %s", carColor);
        }
        else
        {
            response.getWriter().printf("enter a valid color");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String carColor = request.getParameter("car_color");
        HttpSession session = request.getSession();
        OderDetails car = (OderDetails) session.getAttribute("carType");
        if(!carColor.equalsIgnoreCase("") && carColor != null && carAvailability(car.getCarType(), carColor))
        {
            car.setCarColor(carColor);
            session.setAttribute("carType", car);
            response.sendRedirect("CarPrice.jsp");
        }
        else
        {
            response.sendRedirect("ErrorColor.jsp");
        }

    }




    private static boolean carAvailability(String car, String color)
    {
        if(car != null && Availability.isCarColorAvailable("toyota", color))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
