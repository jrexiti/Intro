package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/popups.html");
        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        // driver.switchTo().alert().dismiss();

    }
}
