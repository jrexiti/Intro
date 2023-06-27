package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/dropdown.html");
        Thread.sleep(3000);

        Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
        menuItem.selectByVisibleText("Honda");
    }
}