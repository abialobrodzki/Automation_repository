package pl.coderslab.Page_Object_Pattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    private static WebDriver driver;

    //metoda do wywołania przed testem @Before - ustawienia początkowe
    @Before
    public void setUp() { //w przypadku zmiany przeglądarki wystarczy tu podmienić drivery i przeglądarkę
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");
    }

    @Test
    public void testLoginWithProperCredentials() {
        //klasa LoginPage zawiera metody testowe LoginPage
        LoginPage loginPage = new LoginPage(driver);
        //klasa LoginPage zawiera metody testowe LoginAs
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
        //klasa LoginPage zawiera metody testowe getLoggedUsername()
        //import z Assert(org.junit)
        Assert.assertEquals("Automated Tester", loginPage.getLoggedUsername());
        //błąd w asercji
//        Assert.assertEquals("Automated Testerrr", loginPage.getLoggedUsername());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
