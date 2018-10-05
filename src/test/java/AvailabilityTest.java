
import com.dealership.cars.Validation.customerDetailsValidation;
import com.dealership.cars.repository.Availability;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AvailabilityTest
{

    @org.junit.Test
    public void isCarMakeAvailable()
    {
        assertTrue("isHondaAvailable", Availability.isCarMakeAvailable("honda"));
    }

    @Test
    public void isCarColorAvailable()
    {
        assertTrue("isRedAvailable", Availability.isCarColorAvailable("toyota", "red"));
    }


    @Test
    public void isCarPriceAvailable()
    {
        assertTrue("is10kAvailable", Availability.isCarPriceAvailable("toyota", 15000));
    }

    @Test
    public void isFirstNameValid()
    {
        assertTrue("first name invalid", customerDetailsValidation.isFirstNameValid("mitran%"));
    }

    @Test
    public void isFirstNameValidTest()
    {
        assertTrue("first name invalid", customerDetailsValidation.isFirstNameValid("mitran%"));
    }


}

