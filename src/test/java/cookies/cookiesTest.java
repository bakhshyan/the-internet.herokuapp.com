package cookies;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cookiesTest extends BaseTest {
    @Test
    public void testCookies()  {
        String cookieName = "optimizelyBuckets";
        var cookiesManager = homePage.openHomePage();
        cookiesManager.deleteCookie(cookieName);
        Assert.assertNull(cookiesManager.isCookiePresent(cookieName), "Cookie is not deleted");

    }
}
