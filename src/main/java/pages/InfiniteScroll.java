package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfiniteScroll {
    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScroll(WebDriver driver) {
        this.driver = driver;
    }
}
