package pl.coderslab.hotel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.hotel.page.*;

import java.time.Duration;

public class HotelPageObjectSteps {
    /**
     * # Cucumber - Zadanie 4
     * Stwórz dodatkowe testy dla portalu https://hotel-testlab.coderslab.pl/en/,
     * które umożliwi sprawdzanie funkcjonalności dodania pierwszego adresu do utworzonego już konta użytkownika.
     * Sekwencja kroków:
     * - logowanie do systemu
     * - zakładka **Accounts** (rozwiń nazwę użytkownika)
     * - przycisk **My addresses**
     * - przycisk **Add new address**
     * - wypełnienie i zapisanie formularza.
     */

    private WebDriver driver;
    private MyAddressesPage myAddressesPage;
    /**
     * dodane do kroków opcjonalnych
     */
    private String lastName;
    private String firstName;
    private String country;

    /**
     * klasa z krokami: dodawanie nowego adresu
     */
    @Given("I'm on main page") //przypadki testowe są oznaczane (CTRL + LPM)
    public void openHotelMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //czekajka
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://hotel-testlab.coderslab.pl");
    }

    @When("I go to login page")
    public void iGoToLoginPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
    }

    @And("I login using {string} and {string}")
    public void iLoginUsingAndPasswd(String login, String passwd) {
        AuthPage authPage = new AuthPage(driver);
        authPage.loginAs(login, passwd);
    }

    @And("I go to my addresses page")
    public void iGoToMyAddressesPage() {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.goToMyAddresses();
    }

    @When("I add new address")
    public void iAddNewAddress() {
        myAddressesPage = new MyAddressesPage(driver);
        myAddressesPage.addNewAddress();
    }

    @And("I enter new address {string}, {string}, {string}, {string}, {string}")
    public void iEnterNewAddress(String alias, String address, String postalCode, String city, String phoneNumber) {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.enterNewAddressData(alias, address, postalCode, city, phoneNumber);
        /** do kroków opcjonalnych */
        firstName = newAddressPage.getFirstName();
        lastName = newAddressPage.getLastName();
        country = newAddressPage.getCountry();
        newAddressPage.saveAddress();
    }

    //weryfikacja czy adres poprawnie dodany
    @Then("I can see new address")
    public void iCanSeeNewAddress() {
        Assert.assertTrue(myAddressesPage.addressIsVisible());
    }

    /**
     * opcjonalne nr 1 - sprawdzenie, czy nie ma już dodanego adresu
     */
    @Then("I can see there is no addresses")
    public void iCanSeeThereIsNoAddresses() {
        myAddressesPage = new MyAddressesPage(driver);
        Assert.assertFalse(myAddressesPage.addressIsVisible());
    }

    /**
     * opcjonalne nr 2 - usunięcie adresu
     */
    @And("I remove the address")
    public void iRemoveTheAddress() {
        myAddressesPage.removeAddresses();
    }

    /**
     * opcjonalne nr 3 - potwierdzenie usunięcia adresu
     */
    @And("I can see that address was removed")
    public void iCanSeeThatAddressWasRemoved() {
        Assert.assertFalse(myAddressesPage.addressIsVisible());
    }

    /**
     * opcjonalne nr 4 - potwierdzenia dodania nowego adresu
     */
    @And("I verify created address {string}, {string}, {string}, {string}, {string}")
    public void iVerifyCreatedAddress(String alias, String address, String postalCode, String city, String phoneNumber) {
        String actualAddress = myAddressesPage.getFirstAddressAsText();
        String nameSurname = firstName + " " + lastName;
        String expectedAddress = String.join("\n", alias.toUpperCase(), nameSurname, address,
                postalCode + " " + city, country, phoneNumber);
        Assert.assertEquals(expectedAddress, actualAddress);
    }
}
