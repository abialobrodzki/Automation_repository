package TaskCheckConfig.Wyszukiwanie_elementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main05_ByCssSelector {
    /**
     * # Wyszukaj elementy przy pomocy lokalizatora By.cssSelector
     * Po utworzeniu konta na stroniehttps://hotel-testlab.coderslab.pl/en
     * zidentyfikuj następujące pola korzystając z lokalizatora `By.cssSelector`:
     * - MY PERSONAL INFORMATION
     * - MY ADDRESSES
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

        //pomoc selektory https://www.w3schools.com/cssref/css_selectors.asp
        driver.findElement(By.cssSelector("a[href$=identity]"));
        driver.findElement(By.cssSelector("a[title=Addresses]"));
        driver.quit();
    }

    public static String generateEmail() {
        return "ab" + System.currentTimeMillis() + "@test.com"; //od daty powstania systemu Unix
    }
}
