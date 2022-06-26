package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //definicja metody logowania
    public void signIn() {
        driver.findElement(By.className("user_login")).click();
    }

    //podejście obiektowe - dla kliknięć
    /** do zadania 2 */
    public AuthPage signInWithObject() {
        signIn(); //zwraca metodę signIn
        return new AuthPage(driver);
    }

    /** zadanie 2 - rezerwacja wybranego hotelu */
    public void enterSearchDetails(String hotelName, String checkInDate, String checkOutDate) {
        driver.findElement(By.cssSelector("button.header-rmsearch-input")).click();
        WebElement hotelDropdown = driver.findElement(By.className("hotel_dropdown_ul"));
        String hotelXpath =  "//li[text() = '" + hotelName + "']";
        hotelDropdown.findElement(By.xpath(hotelXpath)).click();

        WebElement checkInTimeInput =  driver.findElement(By.id("check_in_time"));
        checkInTimeInput.clear();
        checkInTimeInput.sendKeys(checkInDate);

        WebElement checkOutTimeInput = driver.findElement(By.id("check_out_time"));
        checkOutTimeInput.clear();
        checkOutTimeInput.sendKeys(checkOutDate);

        driver.findElement(By.id("search_room_submit")).click();
    }
}
