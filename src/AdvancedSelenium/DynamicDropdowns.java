package AdvancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.easyjet.com/en");
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ensCloseBanner")));
        driver.findElement(By.id("ensCloseBanner")).click();

        driver.findElement(By.cssSelector("input[name='origin']")).clear();
        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("london");

        List<WebElement> origins = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
        System.out.println(origins.get(0).getText());
        System.out.println("----------");

        for (WebElement origin : origins) {
            System.out.println(origin.getText());

            if (origin.getText().contains("Luton")) {
                origin.click();
            }

        }

    }
}
