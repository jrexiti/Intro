package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_LocatingByXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.xpath("//button[@id='btn_one']")).click();

    }
}
