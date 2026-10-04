package TestCases;

	import org.testng.Assert;
	import org.testng.annotations.Test;
	import utilities.BaseTest;

	public class HomePageTitleTest extends BaseTest {

	    @Test
	    public void testHomePageTitle() {
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, "BlazeDemo", "Home page title mismatch!");
	        System.out.println("Page title is: " + actualTitle);
	    }
	}

