package AdvancedSelenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/browserTabs.html");

        System.out.println("Current tab is: " + driver.getWindowHandle());
        System.out.println("----------");

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        }
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(tabs.size() + " Tabs open");

        for (String tab : tabs) {
            Thread.sleep(1000);
            driver.switchTo().window(tab);
            System.out.println("Current tab is: " + tab);

        }

        driver.switchTo().window(tabs.get(0));
        System.out.println("----------");
        System.out.println("Current tab is: " + driver.getWindowHandle());

    }
}
