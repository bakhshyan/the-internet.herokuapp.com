package iframe;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void testIframe()  {

        String text1 = "Hello";
        String text2 = "World";

        var editorPage = homePage.clickWysiwygEditorPage();
        editorPage.clearArea();
        editorPage.setTextArea(text1);
        editorPage.IncreaseIndent();
        editorPage.setTextArea(text2);

        Assert.assertEquals(editorPage.getEditorText(),text1+text2,"The body text is incorrect");
    }
}
