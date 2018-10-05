package com.dealership.cars.Validation;

import java.util.regex.Pattern;

public class customerDetailsValidation
{
    public static boolean isFirstNameValid(String firstName)
    {
        if(Pattern.matches("[a-zA-Z]+", firstName))
        {
            return true;
        }
        return false;

    }


}
