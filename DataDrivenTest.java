package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.ConfirmationPage;
import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import utilities.BaseTest;

public class DataDrivenTest extends BaseTest {

    @DataProvider(name = "bookingData")
    public Object[][] bookingData() {
        return new Object[][] {
            {"Kiran", "123 Test Street", "Koppal", "KA", "583231", "4111111111111111", "Kiran G"},
            {"Ravi", "456 Main Road", "Bangalore", "KA", "560001", "5555444433332222", "Ravi K"},
            {"Anita", "789 Market Lane", "Hyderabad", "TS", "500001", "4444333322221111", "Anita S"}
        };
    }

    @Test(dataProvider = "bookingData")
    public void testMultipleBookings(String name, String address, String city, String state,
                                     String zip, String cardNumber, String cardName) {
        // Step 1: Select cities and search flights
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

        // Step 2: Choose first flight
        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

        // Step 3: Enter passenger details and purchase
        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterDetails(name, address, city, state, zip, cardNumber, cardName);
        purchase.clickPurchase();

        // Step 4: Verify confirmation
        ConfirmationPage confirm = new ConfirmationPage(driver);
        String message = confirm.getConfirmationText();
        Assert.assertEquals(message, "Thank you for your purchase today!");
    }
}

