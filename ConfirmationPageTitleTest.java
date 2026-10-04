package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.ReservePage;
import Pages.PurchasePage;
import utilities.BaseTest;

public class ConfirmationPageTitleTest extends BaseTest {

    @Test
    public void testConfirmationPageTitle() {
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterDetails("Kiran", "123 Test Street", "Koppal", "KA", "583231", "1234567890123456", "Kiran G");
        purchase.clickPurchase();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "BlazeDemo Confirmation", "Confirmation page title mismatch!");
        System.out.println("Page title is: " + actualTitle);
    }
}
