package com.dealership.cars.repository;

import com.dealership.cars.properties.CarTypes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Availability
{
    public static boolean isCarMakeAvailable(String make)
    {
        CarTypes types = new CarTypes();
        Set<String> makes = types.getMake();
        for(String m : makes)
        {
            if(m.equalsIgnoreCase(make))
            {
                return true;
            }
        }
        return false;

    }

    public static boolean isCarColorAvailable(String car, String color)
    {
        CarTypes types = new CarTypes();
        Map<String, List<String>> colors = types.getColor();
        if(colors.containsKey(car))
        {
            for(String c : colors.get(car))
            {
                if(c.equalsIgnoreCase(color))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCarPriceAvailable(String car, int price)
    {
        CarTypes types = new CarTypes();
        Map<String, Integer> carPrice = types.getPrice();
        if(carPrice.containsKey(car) && price == carPrice.get(car))
        {
            return true;
        }

        return false;

    }

}
