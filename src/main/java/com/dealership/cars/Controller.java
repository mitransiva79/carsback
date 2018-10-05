package com.dealership.cars;

import com.dealership.cars.Oders.OderDetails;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Controller")
public class Controller extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        OderDetails order = new OderDetails();

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        request.setAttribute("order", order);
        requestDispatcher.forward(request, response);

    }
}
