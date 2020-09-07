package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class KeyPressesTest extends BaseTest {
    @Test
    public void testBackSpace() {
        var keyPressesPage = homePage.clickKeyPressesPage();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE", "Message is incorrect");

    }
}
