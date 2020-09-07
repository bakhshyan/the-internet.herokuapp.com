package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalSliderInput = By.xpath("//div[@class='sliderContainer']/input");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider() {
        driver.findElement(horizontalSliderInput).sendKeys("0");
    }

    public void moveSlider(double rangeNumber) {
        clickSlider();
        for (int i = 1; i <= rangeNumber * 2; i++) {
            driver.findElement(horizontalSliderInput).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
       return driver.findElement(sliderValue).getText();
    }
}



