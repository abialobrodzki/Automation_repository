package pl.coderslab.shop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.shop.page.LoginPage;
import pl.coderslab.shop.page.UserInfoPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ChangeUserInfoSteps {
    //zaciągana konfiguracja
    UserInfoPage userInfoPage;
    WebDriver driver;

    @Given("^User is logged in to CodersLab shop$")
    public void userIsLooggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
    }

    @When("^User goes to UserInformationPage$")
    public void heGoesToUserInformationPage() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=identity");
        userInfoPage = new UserInfoPage(driver);
    }

    //ustawianie daty urodzenia
    @And("^User changes his birthday to \"([^\"]*)\"$")
    public void userChangesHisBirthdayTo(String date) {
        userInfoPage.setBirthdate(date);
    }

    //zapisywanie do newslettera
    @And("^User signs up for our newsletter$")
    public void userSignsUpForOurNewsletter() {
        userInfoPage.signInForNewsletter();
    }

    //wyświetlane zapisane informacje
    @And("^User saves information$")
    public void userSavesInformation() {
        userInfoPage.submitUserInfo();
    }

    //wyświetla znaki, które nie są cudzysłowiem
    @Then("^User sees \"([^\"]*)\"$")
    public void userSees(String message) {
        Assert.assertEquals(message, userInfoPage.getUpdateInformation());
    }
}
