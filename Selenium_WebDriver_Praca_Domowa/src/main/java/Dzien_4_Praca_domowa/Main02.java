package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main02 {
    /**
     * # Inna przeglądrka
     * Ściągnij inny sterownik przeglądarki i spróbuj uruchomić dowolny test na innej przeglądarce.
     */

    //link do konfiguracji sterownika: https://www.selenium.dev/downloads/#platforms-supported-by-selenium
    //w tym przypadku MS Edge ^^
    
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/main/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
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
