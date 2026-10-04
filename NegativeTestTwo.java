package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import utilities.BaseTest;

public class NegativeTestTwo extends BaseTest {

    @Test
    public void testInvalidCreditCardCharacters() {
        // Step 1: Select cities and search flights
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

        // Step 2: Choose first flight
        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

        // Step 3: Enter passenger details with invalid credit card characters
        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterDetails("Kiran", "123 Test Street", "Koppal", "KA", "583231",
                              "abcd1234", "Kiran G"); // invalid characters
        purchase.clickPurchase();

        // Step 4: Verify error message
        Assert.assertTrue(driver.getCurrentUrl().contains("confirmation.php"),
                "Expected to reach confirmation page even with blank credit card");


    }
}
