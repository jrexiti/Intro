package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

    // to interact with the frame swtich the driver focus on the frame and switch
    // back out once done

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/iframes.html");

        // frames on the DOM are indexed, so index can be used to switch driver focus on
        // a particular frame

        driver.switchTo().frame(0);

        driver.findElement(By.cssSelector(".toggle")).click();

        driver.switchTo().parentFrame();

    }

}
