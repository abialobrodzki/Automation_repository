package TaskCheckConfig.Funkcje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainGetText {
    // Funkcja getText() zwraca wartość atrybutu innerText elementu.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pl.wikipedia.org/");
        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());
    }
}
