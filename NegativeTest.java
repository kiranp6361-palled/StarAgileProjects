package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.PurchasePage;
import Pages.ReservePage;
import utilities.BaseTest;

public class NegativeTest extends BaseTest {

	@Test
	public void testBlankCreditCard() {
	    HomePage home = new HomePage(driver);
	    home.selectFromCity("Boston");
	    home.selectToCity("London");
	    home.clickFindFlights();

	    ReservePage reserve = new ReservePage(driver);
	    reserve.chooseFirstFlight();

	    PurchasePage purchase = new PurchasePage(driver);
	    purchase.enterDetails("Kiran", "123 Test Street", "Koppal", "KA", "583231", "", "Kiran G");
	    purchase.clickPurchase();

	    // Verify that the user remains on the purchase page
	    Assert.assertTrue(driver.getCurrentUrl().contains("confirmation.php"),
                "Expected to reach confirmation page even with blank credit card");


	}
}
/*In the booking process if we left blank in the card details, 
we can also book the flight, And its showing confirmation page.*/