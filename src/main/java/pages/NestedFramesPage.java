package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    //    private String leftFrameName = "frame-left";
//    private String bottomFrameName = "frame-bottom";
    private By bodyText = By.xpath("/html/body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToTopFrame() {
        driver.switchTo().frame("frame-top");
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame("frame-bottom");
    }

    private void switchToFrame(String frame) {
        driver.switchTo().frame("frame-" + frame);
    }

    private void switchtoMainFrame() {
        driver.switchTo().defaultContent();
    }

    public String getFrameText(String frameName) {
        switch (frameName){
            case "left":
                switchToTopFrame();
                switchToFrame(frameName);
                break;
            case "right":
                switchToTopFrame();
                switchToFrame(frameName);
                break;
            case "middle":
                switchToTopFrame();
                switchToFrame(frameName);
                break;
            case "bottom":
                switchToBottomFrame();
                break;
        }
        String bodyText = driver.findElement(this.bodyText).getText();
        switchtoMainFrame();
        return bodyText;
    }
}
