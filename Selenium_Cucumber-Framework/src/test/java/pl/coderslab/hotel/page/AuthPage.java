package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage {

    private WebDriver driver;

    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterNewUserEmail(String email) {
        WebElement emailInput = driver.findElement(By.id("email_create"));
        emailInput.clear();
        emailInput.sendKeys(email);

        driver.findElement(By.id("SubmitCreate")).click();
    }

    public void loginAs(String login, String passwd) {
        WebElement loginInput = driver.findElement(By.id("email"));
        loginInput.clear();
        loginInput.sendKeys(login);

        WebElement passwdInput = driver.findElement(By.id("passwd"));
        passwdInput.clear();
        passwdInput.sendKeys(passwd);

        driver.findElement(By.id("SubmitLogin")).click();
    }
}
