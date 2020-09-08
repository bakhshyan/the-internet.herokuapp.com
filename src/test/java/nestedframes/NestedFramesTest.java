package nestedframes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramesTest extends BaseTest {

    @Test
    public void testNestedFrames() {

        var nestedFramesPages = homePage.clickNestedFramesPage();
        Assert.assertEquals(nestedFramesPages.getFrameText("left").toUpperCase(),"LEFT","Body message is incorrect");
        Assert.assertEquals(nestedFramesPages.getFrameText("bottom").toUpperCase(),"BOTTOM","Body message is incorrect");



    }
}
