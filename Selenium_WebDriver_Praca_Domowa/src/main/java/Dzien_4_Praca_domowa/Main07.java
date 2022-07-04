package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main07 {
    /**
     * # Filtrowanie produktów
     * Sprawdź funkcjonalność filtrowania produktów w sklepie
     * https://mystore-testlab.coderslab.pl//index.php.
     * Przygotuj skrypt, który zweryfikuje czy po wyborze odpowiedniego filtra
     * wyświetlają się tylko i wyłącznie produkty spełniające jego warunki
     * np. czy wyświetlają się tylko produkty w danym przedziale cenowym.
     * **Wskazówki:**
     * - Pamiętaj, aby sprawdzić parametry każdego z wyświetlonych produktów,
     * nie tylko pierwszego wyświetlonego.
     * - Do porównywania skorzystaj z instrukcji warunkowych
     * if ... (jeżeli cena jest ok -> wyświetl odpowiedni komunikat).
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        /** przejście do listy produktów */
        WebElement shopIn = driver.findElement(By.xpath("//*[contains(@class,'all-product')]"));
        if (shopIn.isDisplayed()) {
            shopIn.click();
        } else {
            System.out.println("Element shopIn not displayed");
        }
        /** zastosowanie filtrów */
        // wybranie kategorii
        WebElement categories = driver.findElement(By.xpath("//*[contains(@href,'Categories-Clothes')]"));
        if (categories.isDisplayed()) {
            categories.click();
            Thread.sleep(1000);
        } else {
            System.out.println("Element categories not displayed");
        }
        // wybranie rozmiaru - size
        WebElement size = driver.findElement(By.xpath("//*[contains(@href,'Size-M')]"));
        if (size.isDisplayed()) {
            size.click();
            Thread.sleep(1000);
        } else {
            System.out.println("Element size not displayed");
        }
        // wybranie ceny
        WebElement price = driver.findElement(By.xpath("//*[contains(@href,'Price-%E2%82%AC-18-20')]"));
        if (price.isDisplayed()) {
            price.click();
            Thread.sleep(1000);
        } else {
            System.out.println("Element price not displayed");
        }
        //wybranie koloru
        WebElement color = driver.findElement(By.xpath("//*[contains(@href,'Color-Black')]"));
        if (color.isDisplayed()) {
            color.click();
            Thread.sleep(1000);
        } else {
            System.out.println("Element color not displayed");
        }
        /** odczytanie aktywnych filtrów */
        WebElement textCategories = driver.findElement(By.xpath("//*[@id=\"js-active-search-filters\"]/ul/li"));
        if (textCategories.isDisplayed()) {
            System.out.println("Filtr" + textCategories.getText() + "is active");
        } else {
            System.out.println("Filtr categories not active");
        }
        WebElement textSize = driver.findElement(By.xpath("//*[@id=\"js-active-search-filters\"]/ul/li[2]"));
        if (textSize.isDisplayed()) {
            System.out.println("Filtr" + textSize.getText() + "is active");
        } else {
            System.out.println("Filtr size not active");
        }
        WebElement textPrice = driver.findElement(By.xpath("//*[@id=\"js-active-search-filters\"]/ul/li[3]"));
        if (textPrice.isDisplayed()) {
            System.out.println("Filtr" + textPrice.getText() + "is active");
        } else {
            System.out.println("Filtr price not active");
        }
        WebElement textColor = driver.findElement(By.xpath("//*[@id=\"js-active-search-filters\"]/ul/li[4]"));
        if (textColor.isDisplayed()) {
            System.out.println("Filtr" + textColor.getText() + "is active");
        } else {
            System.out.println("Filtr color not active");
        }

        /** przejście do karty produktu */
        WebElement productIn = driver.findElement(By.xpath("//*[contains(@class,'thumbnail product-thumbnail')]"));
        if (productIn.isDisplayed()) {
            productIn.click();
        } else {
            System.out.println("Element productIn not displayed");
        }
        //sprawdzanie ceny
        WebElement priceItem = driver.findElement(By.xpath("/*//div[2]/div[1]/div[2]/div/span[1]"));
        String priceCheck = priceItem.getAttribute("content");
        float priceSet = Float.parseFloat(priceCheck);
        if (priceSet >= 18.00 && priceSet <= 20.00) {
            System.out.println("price: " + priceSet + " is ok");
        } else {
            System.out.println("price: " + priceSet + " is not ok");
        }
        //sprawdzanie koloru
        WebElement colorItem = driver.findElement(By.xpath("//*[@id=\"group_2\"]/li[2]/*"));
        String colorCheck = colorItem.getAttribute("checked");
        if (colorCheck != null || colorCheck == "checked") {
            System.out.println("color is ok");
        } else {
            System.out.println("color is not ok");
        }
        driver.quit();
    }
}
