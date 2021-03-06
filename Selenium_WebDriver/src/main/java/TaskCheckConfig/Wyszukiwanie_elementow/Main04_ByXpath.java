package TaskCheckConfig.Wyszukiwanie_elementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main04_ByXpath {
    /**
     * # Wyszukaj elementy przy pomocy lokalizatora By.xpath
     * Będąc na stronie rejestracji nowego użytkownika (patrz zadanie 3),
     * wyszukaj za pomocą lokalizatorów **xpath**
     * wszystkie wymagane pola tekstowe oraz wypełnij je dowolnymi danymi:
     * - First Name
     * - Last Name
     * - Email
     * - Password
     * Kliknij przycisk **Register**, który również wyszukaj przy pomocy lokalizatora `By.xpath`.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        WebElement accountInput = driver.findElement(By.className("account_input"));
        accountInput.sendKeys(generateEmail()); //generowanie adresu
        driver.findElement(By.id("SubmitCreate")).click();

        Thread.sleep(2000); //dodać wyjątek do sygnatury metody
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Rambo");
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("StrongPass");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
        driver.quit();
    }

    public static String generateEmail() {
        return "ab" + System.currentTimeMillis() + "@test.com"; //od daty powstania systemu Unix
    }
}
