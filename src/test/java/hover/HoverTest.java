package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {
    @Test
    public void testHoverUser1() {
        var hoverPage = homePage.clickHoverPage();
        var figureCaption = hoverPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed");
        assertTrue(figureCaption.getLink().endsWith("/users/1"), "Link incorrect");
        assertEquals(figureCaption.getLinkText(), "View profile", "Caption Link text is incorrect");
        assertEquals(figureCaption.getTitle(), "name: user1", "Caption title is incorrect");
    }

}
