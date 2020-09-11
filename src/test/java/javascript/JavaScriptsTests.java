package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptsTests extends BaseTest {

    @Test
    public void testScrollToTable() throws InterruptedException {
        homePage.clickLargeDeepDOMPage().scrollToTable();
        Thread.sleep(2000);
    }

    @Test
    public void testScrollToSixParagraph() {
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }

}
