package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainByName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.name("hotel_location")).sendKeys("Warsaw");
        WebElement searchNowBtn = driver.findElement(By.name("search_room_submit"));
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        WebElement subscribeBtn = driver.findElement(By.name("submitNewsletter"));

        searchNowBtn.submit();
//        searchNowBtn.click(); //różnica pomiędzy click a submit
        driver.quit();
    }
}
