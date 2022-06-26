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
import pl.coderslab.hotel.page.RoomsListPage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelReservationTest {
    /**
     * # Page Object Pattern - Zadanie 3
     * Zakończ rozbudowę testów dla aplikacji https://hotel-testlab.coderslab.pl/en/
     * dodając test weryfikujący możliwość rezerwacji (dodanie do koszyka) dowolnego hotelu z listy.
     * ## Część dodatkowa (opcjonalna)
     * Dodaj do skryptu proces obsługi zamówienia w koszyku.
     */

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

        roomsListPage.getBook();
        Assert.assertEquals("Confirmed", roomsListPage.getSuccessText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
