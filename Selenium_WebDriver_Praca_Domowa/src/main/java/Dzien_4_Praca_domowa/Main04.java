package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main04 {
    /**
     * # Ćwiczenia z wyszukiwania xPath
     * Na portalu sklepu internetowego
     * https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1
     * wyszukaj następujące elementy:
     * - social title
     * - First name
     * - Last name
     * - Email
     * - Password
     * - Show
     * - Birthdate
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");
        WebElement socialTitle = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//label[2]/span"));
        if (socialTitle.isDisplayed()) {
            socialTitle.click();
        } else {
            System.out.println("Element socialTitle not displayed");
        }
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//div[1]/input"));
        if (firstName.isDisplayed()) {
            firstName.clear();
            firstName.sendKeys("test");
        } else {
            System.out.println("Element firstName  not displayed");
        }
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//div[3]//input"));
        if (lastName.isDisplayed()) {
            lastName.clear();
            lastName.sendKeys("test xpath");
        } else {
            System.out.println("Element lastName  not displayed");
        }
        WebElement email = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//div[4]//input"));
        if (email.isDisplayed()) {
            email.clear();
            email.sendKeys("testxpath@gmail.com");
        } else {
            System.out.println("Element email not displayed");
        }
        WebElement password = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//div[5]//input"));
        if (password.isDisplayed()) {
            password.clear();
            password.sendKeys("xptahpass");
        } else {
            System.out.println("Element password not displayed");
        }
        WebElement show = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//button"));
        if (show.isDisplayed()) {
            show.click();
        } else {
            System.out.println("Element show not displayed");
        }
        WebElement birthdate = driver.findElement(By.xpath("//*[@id=\"customer-form\"]//div[6]//input"));
        if (birthdate.isDisplayed()) {
            birthdate.clear();
            birthdate.sendKeys("05/31/1970");
        } else {
            System.out.println("Element birthdate not displayed");
        }
    }
}
