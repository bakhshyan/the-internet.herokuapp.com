package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTextTest extends BaseTest {

    @Test
    public void testAlertText() {
        var contextMenu = homePage.clickContextMenuPage();
        contextMenu.rightClickInBox();
        Assert.assertEquals(contextMenu.getAlertText(), "You selected a context menu", "The alert text is incorrect");
        contextMenu.acceptAlert();
    }
}
