package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main01 {
    /**
     * # Nawigacja
     * Na stronie https://mystore-testlab.coderslab.pl/index.php wykonaj następującą sekwencję kroków:
     * 1. Wejdź na stronę główną.
     * 2. Przejdź do opcji 'Sign in'
     * 3. Wybierz opcję 'No account? Create one here'
     * 4. Za pomocą metod nawigacyjnych przejdź do strony głównej.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        //na elemencie: PPM -> Copy -> Copy XPath
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.quit();
    }
}
