package com.dealership.cars.Oders;

public class OderDetails
{
    public String getCarType()
    {
        return carType;
    }

    public void setCarType(String carType)
    {
        OderDetails.carType = carType;
    }

    public String getCarColor()
    {
        return carColor;
    }

    public void setCarColor(String carColor)
    {
        this.carColor = carColor;
    }

    public int getCarPrice()
    {
        return carPrice;
    }

    public void setCarPrice(int carPrice)
    {
        this.carPrice = carPrice;
    }

    static String carType = null;
    static String carColor = null;
    static int carPrice = 0;

}
