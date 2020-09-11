package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitExample2Test extends BaseTest {

    @Test
    public void testWaitExample2() {
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage().clickExample2();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "The loaded text is incorrect");

    }
}
