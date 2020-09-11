package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowTest extends BaseTest {
    @Test
    public void testWindows()  {
        var windowManager = homePage.clickDynamicLoadingPage().clickExample2WithCTRL();
        getWindowManager().switchToExample2Tab();
        Assert.assertTrue(windowManager.startButtonIsDisplayed(),"Start button is missing");

    }
}
