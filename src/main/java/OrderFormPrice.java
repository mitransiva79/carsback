import com.dealership.cars.Oders.OderDetails;
import com.dealership.cars.repository.Availability;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/OrderFormPrice", "*.ofc"})
public class OrderFormPrice extends HttpServlet
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String carPrice = request.getParameter("car_price");
        int carPriceInt = 0;
        if(!carPrice.equalsIgnoreCase("") && carPrice != null)
        {
            try
            {
                carPriceInt = Integer.parseInt(carPrice);
                if(carAvailability("toyota", carPriceInt))
                {
                    response.getWriter().printf("Color %s is available", carPrice);
                }
                else
                {
                    response.sendRedirect("ErrorPrice.jsp");
                }
            }
            catch(NumberFormatException e)
            {
                response.sendRedirect("ErrorPrice.jsp");
            }
        }
        else
        {
            response.getWriter().printf("enter a valid price");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String carPrice = request.getParameter("car_price");
        int carPriceInt;
        if(!carPrice.equalsIgnoreCase("") && carPrice != null)
        {
            try
            {
                carPriceInt = Integer.parseInt(carPrice);
                HttpSession session = request.getSession();
                OderDetails car = (OderDetails) session.getAttribute("carType");
                if(carAvailability(car.getCarType(), carPriceInt))
                {
                    car.setCarPrice(carPriceInt);
                    response.sendRedirect("OrderSummary.jsp");
                    /*response.getWriter().printf("Order has been placed for:   ");
                    response.getWriter().printf(" Car:   %s", car.getCarType());
                    response.getWriter().printf("   Color: %s", car.getCarColor());
                    response.getWriter().printf("   Car: %s", car.getCarPrice());*/
                }
                else
                {
                    response.sendRedirect("ErrorPrice.jsp");
                }
            }
            catch(NumberFormatException e)
            {
                response.sendRedirect("ErrorPrice.jsp");
            }
        }
        else
        {
            response.sendRedirect("ErrorPrice.jsp");
        }


    }




    private static boolean carAvailability(String car, int price)
    {
        if(car != null && Availability.isCarPriceAvailable(car, price))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
