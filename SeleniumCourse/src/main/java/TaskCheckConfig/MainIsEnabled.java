package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainIsEnabled {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pl.wikipedia.org/");
        WebElement search = driver.findElement(By.id("searchInput"));
        if (search.isEnabled()) {
            search.sendKeys("Selenium");
            search.submit();
        } else {
            System.out.println("Element not enabled");
        }
    }
}
