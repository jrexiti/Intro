package Section05;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L09_Assertion_pt1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertEquals("HomePage!!!", pageTitle);

    }
}
