package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest {

    @Test
    public void testWait() {
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "The loaded text is incorrect");

    }
}
