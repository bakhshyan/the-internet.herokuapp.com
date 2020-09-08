package forgotpassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testForgotPassword() {
        var forgotPasswordPage = homePage.clickForgotPasswordPage();
        forgotPasswordPage.setEmailField("tau@example.com");
        var emailSentPage = forgotPasswordPage.clickRetrievePassword();
        Assert.assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"),"Alert text is inccorect");

    }

}
