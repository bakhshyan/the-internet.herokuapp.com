package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By body = By.id("tinymce");
    private By increaseIndentButton = By.xpath(".//div[@id='mceu_12']/button");
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearArea() {
        switchToEditArea();
        driver.findElement(body).clear();
        switchtoMainArea();
    }

    public void setTextArea(String textArea) {
        switchToEditArea();
        driver.findElement(body).sendKeys(textArea);
        switchtoMainArea();

    }

    public void IncreaseIndent() {
        driver.findElement(increaseIndentButton).click();

    }

    public String getEditorText() {
        switchToEditArea();
        String bodyText = driver.findElement(body).getText();
        switchtoMainArea();
        return bodyText;
    }
    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    private void switchtoMainArea() {
        driver.switchTo().parentFrame();
    }
}
