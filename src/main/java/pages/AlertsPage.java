package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By getResult = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlert).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirm).click();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void triggerPromt() {
        driver.findElement(triggerPromt).click();

    }

    public void promtAlert(String alertText) {
        driver.switchTo().alert().sendKeys(alertText);
        driver.switchTo().alert().accept();

    }

    public String getResult() {
        return driver.findElement(getResult).getText();
    }

}
