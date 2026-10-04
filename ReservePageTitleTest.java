package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import utilities.BaseTest;

public class ReservePageTitleTest extends BaseTest {

    @Test
    public void testReservePageTitle() {
        HomePage home = new HomePage(driver);
        home.selectFromCity("Boston");
        home.selectToCity("London");
        home.clickFindFlights();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "BlazeDemo - reserve", "Reserve page title mismatch!");
        System.out.println("Page title is: " + actualTitle);
    }
}

