package utils;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }


    public void goBack() {
        navigation.back();
    }

    public void goForward() {
        navigation.forward();
    }

    public void refresh() {
        navigation.refresh();
    }

    public void goTo(String url) {
        navigation.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("The number of opened tab is " + windows.size());

        /*print all opened tabs count**/
        for (String window : windows) {
            System.out.println("Windows handle:" + window);

        }
        for (String window : windows) {
            System.out.println("Current opened tab is " + window);
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }


    }

    public void switchToExample2Tab() {
        var windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
        }
    }
}
