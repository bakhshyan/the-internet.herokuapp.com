package horizontalslider;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {
    double range = 2.5;

    @Test
    public void testHorizontalSlider() throws InterruptedException {
        var horizontalSliderPage = homePage.clickHorizontalSliderPage();
        horizontalSliderPage.moveSlider(range);
        Assert.assertTrue(Double.toString(range).contains(horizontalSliderPage.getSliderValue()));
        System.out.println(horizontalSliderPage.getSliderValue());

    }
}
