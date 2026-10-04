package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.ReservePage;
import utilities.BaseTest;

public class PurchasePageTitleTest extends BaseTest {

    @Test
    public void testPurchasePageTitle() {
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "BlazeDemo Purchase", "Purchase page title mismatch!");
        System.out.println("Page title is: " + actualTitle);
    }
}

