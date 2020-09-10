package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptsTests extends BaseTest {

    @Test
    public void scrollToTable() throws InterruptedException {
        homePage.clickLargeDeepDOM().scrollToTable();
        Thread.sleep(2000);
    }

}
