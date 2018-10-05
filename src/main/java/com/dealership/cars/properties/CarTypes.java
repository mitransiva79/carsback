package com.dealership.cars.properties;

import com.dealership.cars.interfaces.Make;

import java.util.*;

public class CarTypes implements Make
{

    public Set<String> getMake()
    {
        Set<String> make = new HashSet<>();
        make.add("nissan");
        make.add("toyota");
        make.add("honda");
        return make;
    }


    public Map<String, List<String>> getColor()
    {
        Map<String, List<String>> color  = new HashMap<>();

        List<String> carColorNissan = new ArrayList<>();
        carColorNissan.add("red");
        carColorNissan.add("black");
        carColorNissan.add("white");
        carColorNissan.add("grey");
        color.put("nissan", carColorNissan);

        List<String> carColorToyota = new ArrayList<>();
        carColorToyota.add("red");
        carColorToyota.add("black");
        carColorToyota.add("white");
        color.put("toyota", carColorToyota);

        List<String> carColorHonda = new ArrayList<>();
        carColorHonda.add("red");
        carColorHonda.add("black");
        carColorHonda.add("white");
        carColorHonda.add("silver");
        color.put("honda", carColorHonda);

        return color;
    }

    public Map<String, Integer> getPrice()
    {
        Map<String, Integer> price  = new HashMap<>();
        price.put("nissan", 10000);
        price.put("toyota", 15000);
        price.put("honda", 20000);
        return price;
    }
}
