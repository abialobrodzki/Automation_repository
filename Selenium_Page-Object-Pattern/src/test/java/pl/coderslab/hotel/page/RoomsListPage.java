package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoomsListPage {
    /**
     * zadanie 2 - lista z pokojami
     */
    private WebDriver driver;
//    @FindBy(xpath = "//*[@id=\"category_data_cont\"]/div[4]/div/div[2]/a/span") //pozwala unikać pisania driver.findElement
//    WebElement bookNowBtn;

    public RoomsListPage(WebDriver driver) {
        this.driver = driver;
    }

    //do asercji używać metody, które coś zwracają
    public String getHotelName() {
        return driver.findElement(By.className("hotel_cat_id_btn")).getText();
    }

    //to nie są pola tekstowe z datami, odczytujemy wartość pola tekstowego getAttribute z pola "value"
    public String getCheckInTime() {
        return driver.findElement(By.id("check_in_time")).getAttribute("value");
    }

    public String getCheckOutTime() {
        return driver.findElement(By.id("check_out_time")).getAttribute("value");
    }

    public boolean areRoomsFound() {
        return !driver.findElements(By.className("room_cont")).isEmpty();
    }

    /**
     * zadanie 3 - rezerwacja hotelu
     */
    public void getBook() {
        // dodanie 2 pokoi i przejście do potwierdzenia rezerwacji
        driver.findElement(By.className("icon-plus")).click();
        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/a")).click();

        // potwierdzenie rezerwacji
        driver.findElement(By.xpath("//*[@id=\"advanced-payment\"]/div[2]/label/div/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"advanced-payment\"]/div[3]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();

        // potwierdzenie płatności
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
    }

    public String getSuccessText() {
        // potwierdzenie rezerwacji
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p[3]/span")).getText();
    }
}
