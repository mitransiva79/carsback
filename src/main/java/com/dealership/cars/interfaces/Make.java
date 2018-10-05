package com.dealership.cars.interfaces;

import java.util.*;

public interface Make
{
    Set<String> getMake();
    Map<String, List<String>> getColor();
    Map<String, Integer> getPrice();

}
