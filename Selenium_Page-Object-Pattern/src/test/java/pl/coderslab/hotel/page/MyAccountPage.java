package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    public static final String ALERT_SELECTOR = "alert-success";
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    //tworzenie danych do asercji po zarejestrowaniu
    public String getUserName() {
        return driver.findElement(By.className("account_user_name")).getText();
    }

    public boolean successMessageIsVisible() {
        return driver.findElement(By.className(ALERT_SELECTOR)).isDisplayed();
    }

    public String getSuccessMessage() {
        return driver.findElement(By.className(ALERT_SELECTOR)).getText();
    }

    /** zadanie 2 - cofnięcie do strony głównej */
    public void returnHome() {
        driver.findElement(By.className("logo")).click();
    }
}
