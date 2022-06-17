package TaskCheckConfig.Funkcje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main01 {
    /**
     * # Funkcje
     * Będąc na stronie rejestracji nowego użytkownika https://hotel-testlab.coderslab.pl/en/,
     * wyszukaj wszystkie pola oraz zweryfikuj za pomocą odpowiednich metod czy są one widoczne,
     * aby wpisać tam wartości.
     * - First Name
     * - Last Name
     * - Email
     * - Password
     * Potwierdź rejestrację nowego użytkownika (wcześniej sprawdzając, czy przycisk jest widoczny).
     */
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("hide_xs")).click();
        driver.findElement(By.id("email_create")).sendKeys(generateEmail());
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        if (firstName.isDisplayed()) {
            firstName.sendKeys("Martyna");
        } else {
            System.out.println("Element not displayed");
        }
        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        if (lastName.isDisplayed()) {
            lastName.sendKeys("Super");
        } else {
            System.out.println("Element not displayed");
        }
        WebElement email = driver.findElement(By.id("email"));
        if (!email.isDisplayed()) {
            System.out.println("Element not displayed");
        }
        WebElement password = driver.findElement(By.id("passwd"));
        if (password.isDisplayed()) {
            password.sendKeys("martyna");
        } else {
            System.out.println("Element not displayed");
        }
        WebElement button = driver.findElement(By.id("submitAccount"));
        if (button.isDisplayed()) {
            button.click();
        } else {
            System.out.println("Element not displayed");
        }

        driver.quit();
    }

    public static String generateEmail() {
        return "ab" + System.currentTimeMillis() + "@test.com"; //od daty powstania systemu Unix
    }
}
