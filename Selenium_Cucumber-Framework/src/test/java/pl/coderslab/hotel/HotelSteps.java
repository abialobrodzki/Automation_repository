package pl.coderslab.hotel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HotelSteps {
    /**
     * # Cucumber - Zadanie 2
     * Z wykorzystaniem Cucumber przygotuj test, który będzie zakładał konto
     * na stronie https://hotel-testlab.coderslab.pl/.
     * Wykonana powinna być następująca sekwencja kroków:
     * - strona główna
     * - przycisk **'Sign in'**
     * - przycisk **Create an account**
     * - wypełnienie formularza
     * - przycisk **Register
     */

    private WebDriver driver;

    /**
     * klasa z krokami
     */
    @Given("I'm on hotel main page") //przypadki testowe są oznaczane (CTRL + LPM)
    public void openHotelMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //czekajka
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://hotel-testlab.coderslab.pl");
    }

    @When("I sign in")
    public void iSignIn() {
        driver.findElement(By.className("user_login")).click();
    }

    @And("I enter unique email address on authentication page")
    public void iEnterUniqueEmailAddressOnAuthenticationPage() {
        String uniqueEmail = "ab" + System.currentTimeMillis() + "@gmail.com";
        driver.findElement(By.className("account_input")).sendKeys(uniqueEmail);
        driver.findElement(By.id("SubmitCreate")).click();
    }

    /**
     * wyrażenie regularne
     */
    // (.+) ciąg znaków o dowolnej długości, jeden lub więcej
    @And("^I enter name (.+) surname (.+) and password (.+)$")
    public void iEnterNameSurnameAndPassword(String name, String surname, String passwd) {
        driver.findElement(By.id("customer_firstname")).sendKeys(name);
        driver.findElement(By.id("customer_lastname")).sendKeys(surname);
        driver.findElement(By.id("passwd")).sendKeys(passwd);
        driver.findElement(By.id("submitAccount")).click();
    }

    /**
     * Cucumber Expression
     */
    //dodanie "" w definicji kroków powoduje pojawienie się {String}
    @Then("I can see success message with text {string}")
    /** sprawdzenie alarmów */
    public void iCanSeeSuccessMessageWithText(String message) {
        String alertMessage = driver.findElement(By.className("alert-success")).getText();
        Assert.assertEquals(message, alertMessage);
    }

    @And("I close hotel browser")
    public void iCloseHotelBrowser() {
        driver.quit();
    }
}
