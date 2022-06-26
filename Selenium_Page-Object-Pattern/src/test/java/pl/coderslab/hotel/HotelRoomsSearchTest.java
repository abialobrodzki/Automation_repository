package pl.coderslab.hotel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.hotel.page.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelRoomsSearchTest {
    /**
     * # Page Object Pattern - Zadanie 2
     * Rozbuduj testy dla aplikacji:
     * https://hotel-testlab.coderslab.pl/en/ z wykorzystaniem Page Object Pattern.
     * Tym razem Twój test powinien sprawdzać możliwość wyszukania hotelu po nazwie.
     * Sekwencja kroków:
     * - logowanie użytkownika
     * - wyszukiwarka na stronie głównej
     * - wyszukaj dowolny hotel.
     */
    //PATRZEĆ co testujemy - wystarczy niepoprawne hasło i test też przechodzi!!!

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-uuuu");
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
        MainPage mainPage = new MainPage(driver);
        AuthPage authPage = mainPage.signInWithObject();

        authPage.loginAs("testowyuser@gmail.com", "secretpass");
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.returnHome();

        //daty
        String hotelName = "The Hotel Prime";
        String checkInDate = LocalDate.now().format(DATE_FORMATTER);
        String checkOutDate = LocalDate.now().plusDays(1).format(DATE_FORMATTER);

        mainPage.enterSearchDetails(hotelName, checkInDate, checkOutDate);

        RoomsListPage roomsListPage = new RoomsListPage(driver);
        Assert.assertEquals(hotelName, roomsListPage.getHotelName());
        Assert.assertEquals(checkInDate, roomsListPage.getCheckInTime());
        Assert.assertEquals(checkOutDate, roomsListPage.getCheckOutTime());
        Assert.assertTrue(roomsListPage.areRoomsFound());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
