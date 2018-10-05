package com.dealership.cars.Oders;

import java.util.Date;

public class ProcessedOrder
{
    private OderDetails orderDetails;
    private Date orderDate;
    private Long orderNumber;
    private String firstName;
    private String lastName;
    private String streetName;
    private String zipCode;
    private String CCNumber;
    private String expiryDate;

    public String getSecurityCode()
    {
        return securityCode;
    }

    public void setSecurityCode(String securityCode)
    {
        this.securityCode = securityCode;
    }

    private String securityCode;


    public OderDetails getOrderDetails()
    {
        return orderDetails;
    }

    public void setOrderDetails(OderDetails orderDetails)
    {
        this.orderDetails = orderDetails;
    }

    public Date getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    public Long getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getCCNumber()
    {
        return CCNumber;
    }

    public void setCCNumber(String CCNumber)
    {
        this.CCNumber = CCNumber;
    }

    public String getExpiryDate()
    {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate)
    {
        this.expiryDate = expiryDate;
    }



}
