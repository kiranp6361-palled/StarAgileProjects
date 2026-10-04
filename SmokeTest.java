package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import utilities.BaseTest;

public class SmokeTest extends BaseTest {

    @Test
    public void verifyHomePageLoads() {
        HomePage home = new HomePage(driver);
        Assert.assertTrue(home.isFromCityDropdownVisible(), "From City dropdown is not visible");
        Assert.assertTrue(home.isToCityDropdownVisible(), "To City dropdown is not visible");
    }
}
