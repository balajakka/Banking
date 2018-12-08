package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by balajakka on 06/12/2018.
 */
public class TestDriver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }
}
