package pl.coderslab.hotel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.hotel.page.AuthPage;
import pl.coderslab.hotel.page.MainPage;
import pl.coderslab.hotel.page.MyAccountPage;
import pl.coderslab.hotel.page.UserPage;

import java.time.Duration;

public class HotelRegistrationTest {
    /**
     * # Page Object Pattern 1 - Zadanie 1
     * Przygotuj skrypt testowy, który będzie testował funkcjonalność rejestracji
     * użytkownika na stronie: https://hotel-testlab.coderslab.pl/en/
     * Użyj do tego wzorca projektowego Page Object Pattern.
     * Wykonana powinna być następująca sekwencja kroków:
     * - strona główna
     * - przycisk **'Sign in'**
     * - przycisk **Create an account**
     * - wypełnienie formularza
     * - przycisk **Register**
     */

    private static WebDriver driver;

    //metoda do wywołania przed testem @Before - ustawienia początkowe
    @Before
    public void setUp() { //w przypadku zmiany przeglądarki wystarczy tu podmienić drivery i przeglądarkę
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void testRegisterNewUser() {
        //przekazanie drivera do konstruktora
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
        //podejście obiektowe
//        AuthPage authP = mainPage.signInWithObject();

        //wypełnianie pola z mailem
        AuthPage authPage = new AuthPage(driver); //przy obiekcie authP nie jest potrzebna ta linijka
        authPage.enterNewUserEmail(generateUniqueEmail());

        //rejestracja usera
        String firstname = "John";
        UserPage regPage = new UserPage(driver);
        regPage.enterRequiredUserData(firstname, "Doe", "secretpass");

        //asercje
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.successMessageIsVisible());
        Assert.assertEquals("Your account has been created.", myAccountPage.getSuccessMessage());
        Assert.assertEquals(firstname, myAccountPage.getUserName());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private static String generateUniqueEmail() {
        return "art" + System.currentTimeMillis() + "@random.com";
    }
}
