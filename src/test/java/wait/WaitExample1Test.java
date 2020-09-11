package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitExample1Test extends BaseTest {

    @Test
    public void testWaitExample1() {
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "The loaded text is incorrect");

    }
}
