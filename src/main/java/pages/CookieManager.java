package pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CookieManager {
    private WebDriver driver;

    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }

    public Cookie isCookiePresent(String cookieName) {
        return driver.manage().getCookieNamed(cookieName);
    }

    public void deleteCookie(String cookieName) {
        driver.manage().deleteCookieNamed(cookieName);
    }
}
