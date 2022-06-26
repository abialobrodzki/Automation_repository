package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private static final String ALERT_SELECTOR = "alert-success";
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(By.className("account_user_name")).getText();
    }

    public boolean successMessageIsVisible() {
        return driver.findElement(By.className(ALERT_SELECTOR)).isDisplayed();
    }

    public String getSuccessMessage() {
        return driver.findElement(By.className(ALERT_SELECTOR)).getText();
    }

    public void returnHome() {
        driver.findElement(By.className("logo")).click();
    }

    public void goToMyAddresses() {
        driver.findElement(By.cssSelector("a[title=Addresses]")).click();
    }
}