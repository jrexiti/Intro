package AdvancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/contactForm.html");

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Jay");
        ;
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Rexiti");
        ;
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("jay@mail.com");
        ;
        driver.findElement(By.cssSelector("textarea")).sendKeys("test comment");
        ;

        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        WebElement reset = driver.findElement(By.cssSelector("[type='reset']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click(), arguments[1].click()", reset, submit);

    }
}
