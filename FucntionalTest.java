package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ReservePage;
import utilities.BaseTest;

public class FucntionalTest extends BaseTest {

    @Test
    public void testSearchFlightsValidCities() {
        // Navigate to homepage and select cities
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

        // Verify flight list is displayed
        ReservePage reserve = new ReservePage(driver);
        Assert.assertTrue(reserve.isFlightListDisplayed(), "Flight list is not displayed");
    }
}

