package AdvancedSelenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");

        // to delete cookies
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("name of cookie");

        // get cookies
        driver.manage().getCookies();

        // to add a cookie
        driver.manage().addCookie(new Cookie("key", "value"));

    }
}
