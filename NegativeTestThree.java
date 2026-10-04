package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import utilities.BaseTest;

public class NegativeTestThree extends BaseTest {

    @Test
    public void testSameDepartureAndDestinationCity() {
        // Step 1: Select same city for departure and destination
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("Boston"); // same city
        home.clickFindFlights();

        // Step 2: Verify error message or invalid search handling
        Assert.assertTrue(driver.getPageSource().contains("Flights from Boston to Boston"),
                "Expected flight list for same departure and destination city");

    }
}
//  We cannot run this code because we cannot select same cities in the application 