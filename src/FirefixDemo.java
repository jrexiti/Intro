import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefixDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/jrexiti/Desktop/Resources/drivers_v1/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
    }

}
