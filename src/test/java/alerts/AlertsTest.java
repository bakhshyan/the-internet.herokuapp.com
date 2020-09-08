package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {

    @Test
    public void testTriggerAlert() {
        var alertsPage = homePage.clickAlertPage();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        Assert.assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "The alert text is incorrect");
    }

    @Test
    public void testTriggerConfirm() {
        var alertsPage = homePage.clickAlertPage();
        alertsPage.triggerConfirm();
        alertsPage.dismissAlert();
        Assert.assertEquals(alertsPage.getResult(), "You clicked: Cancel", "The alert text is incorrect");
    }

    @Test
    public void testTriggerPrompt() {
        String alertText = "Test";
        var alertPage = homePage.clickAlertPage();
        alertPage.triggerPromt();
        alertPage.promtAlert(alertText);
        Assert.assertEquals(alertPage.getResult(), "You entered: " + alertText, "The alert text is incorrect ");
    }
}
