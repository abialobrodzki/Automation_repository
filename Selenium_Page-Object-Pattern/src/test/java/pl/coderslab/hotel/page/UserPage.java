package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {

    private WebDriver driver;

    //zaciągniecie elementu z WebDriver driver
    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    //tworzenie metody przyjmującej 3 parametry - wypełnienie pól imię, nazwisko, hasło
    public void enterRequiredUserData(String name, String lastname, String passwd) {
        WebElement nameInput = driver.findElement(By.id("customer_firstname"));
        nameInput.clear();
        nameInput.sendKeys(name);

        WebElement lastnameInput = driver.findElement(By.id("customer_lastname"));
        lastnameInput.clear();
        lastnameInput.sendKeys(lastname);

        WebElement passwdInput = driver.findElement((By.id("passwd")));
        passwdInput.clear();
        passwdInput.sendKeys(passwd);

        driver.findElement((By.id("submitAccount"))).click();
    }
}
