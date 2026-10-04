package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ConfirmationPage;
import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import utilities.BaseTest;

public class FunctionalTestTwo extends BaseTest {

   
    public void testCompleteFlightBooking() {
        
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

       
        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

      
        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterDetails("Kiran", "123 Test Street", "Koppal", "KA", "583231",
                              "4111111111111111", "Kiran G");
        purchase.clickPurchase();

       
        ConfirmationPage confirm = new ConfirmationPage(driver);
        String message = confirm.getConfirmationText();
        Assert.assertEquals(message, "Thank you for your purchase today!");
    }
}
