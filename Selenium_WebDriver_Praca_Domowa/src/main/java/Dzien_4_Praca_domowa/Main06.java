package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main06 {
    /**
     * # Rejestracja użytkownika
     * Ważną funkcjonalnością sklepu jest możliwość zarejestrowania nowego użytkownika.
     * W tym celu przygotuj skrypt, który będzie miał możliwość tworzenie dowolnej liczby użytkowników
     * w sklepie https://mystore-testlab.coderslab.pl/index.php.
     * Po stworzeniu użytkownika uzupełnij również jego dane adresowe (Your Account / Addresses).
     * Postaraj się, aby dane były w jak największym stopniu losowe.
     * **Wskazówki:**
     * - Skrypt powinien mieć możliwość zdefiniowania dowolnej liczby użytkowników, którą chcemy utworzyć.
     * - Zwróć uwagę na komunikat: *"The email is already used, please choose another one or sign in."*
     * - Stwórz kilka tablic, które będą zawierały poszczególne dane wymagane do wypełnienia adresu,
     * a następnie dla każdego z użytkowników losuj dowolny element z danej tablicy.
     * - Wykorzystaj losowanie liczb i dodawaj losowe liczby do adresów e-mail.
     */
    public static void main(String[] args) {
        /** deklaracja liczby użytkowników */
        final int USERS = 3;

        for (int j = 1; j <= USERS; j++) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            /** przejście do rejestracji użytkownika */
            driver.get("https://mystore-testlab.coderslab.pl/index.php");
            WebElement logIn = driver.findElement(By.xpath("//*[contains(@title,'Log in to your customer account')]"));
            if (logIn.isDisplayed()) {
                logIn.click();
            } else {
                System.out.println("Element logIn not displayed");
            }
            WebElement register = driver.findElement(By.xpath("//*[contains(@data-link-action,'display-register-form')]"));
            if (register.isDisplayed()) {
                register.click();
            } else {
                System.out.println("Element register not displayed");
            }
            /** losowanie płci 1-Male 2-Female */
            int i = (int) Math.floor((Math.random() * 2) + 1);
            WebElement gender = driver.findElement(By.xpath("//*/span/input[contains(@value,'" + i + "')]"));
            if (!gender.isDisplayed()) {
                gender.click();
            } else {
                System.out.println("Element gender not displayed");
            }
            /** losowanie imienia z tablicy Name */
            String[] Name = {"Adrian", "Artur", "Martyna", "John", "Marry"};
            i = (int) Math.floor((Math.random() * Name.length));
            WebElement firstName = driver.findElement(By.xpath("//*[contains(@name,'firstname')]"));
            if (firstName.isDisplayed()) {
                firstName.clear();
                firstName.sendKeys(Name[i]);
            } else {
                System.out.println("Element firstName not displayed");
            }
            /** losowanie nazwiska z tablicy Surname */
            String[] Surname = {"Doe", "Nowak", "Kowalski"};
            i = (int) Math.floor((Math.random() * Surname.length));
            WebElement lastName = driver.findElement(By.xpath("//*[contains(@name,'lastname')]"));
            if (lastName.isDisplayed()) {
                lastName.clear();
                lastName.sendKeys(Surname[i]);
            } else {
                System.out.println("Element lastName not displayed");
            }
            /** tworzenie maila */
            String newMail = Surname[i] + System.currentTimeMillis() + "@gmail.com";
            WebElement mail = driver.findElement(By.xpath("//*[contains(@name,'email')]"));
            if (mail.isDisplayed()) {
                mail.clear();
                mail.sendKeys(newMail);
            } else {
                System.out.println("Element mail not displayed");
            }
            /** tworzenie hasła */
            String newPassword = "secretpass";
            WebElement password = driver.findElement(By.xpath("//*[contains(@name,'password')]"));
            if (password.isDisplayed()) {
                password.clear();
                password.sendKeys(newPassword);
            } else {
                System.out.println("Element password not displayed");
            }
            /** dodanie daty urodzin */
            String newBirthday = "01/13/1992";
            WebElement birthday = driver.findElement(By.xpath("//*[contains(@name,'birthday')]"));
            if (birthday.isDisplayed()) {
                birthday.clear();
                birthday.sendKeys(newBirthday);
            } else {
                System.out.println("Element birthday not displayed");
            }
            /** zgody marketingowe */
            if (i % 2 == 0) {
                driver.findElement(By.xpath("//*[contains(@name,'optin')]")).click();
                driver.findElement(By.xpath("//*[contains(@name,'newsletter')]")).click();
            }
            /** zatwierdzenie */
            driver.findElement(By.xpath("//*[contains(@data-link-action,'save-customer')]")).click();

            /** wyjście */
            driver.quit();
        }
    }
}
