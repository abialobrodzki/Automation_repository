package pl.coderslab.hotel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class MyAddressesPage {
    private WebDriver driver;

    /**
     * wyszukanie przycisku do dodania adresu
     */
    @FindBy(css = "a[title='Add an address']")
    WebElement newAddressBtn;
    @FindBy(css = ".bloc_adresses .address")
    List<WebElement> addresses;

    /**
     * kliknięcie w przycisk dodający adres
     */
    public MyAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNewAddress() {
        newAddressBtn.click();
    }

    //sprawdzanie, czy adres jest widoczny, lista pól większa od 0, jak tak to udało się go dodać
    public boolean addressIsVisible() {
        return addresses.size() > 0;
    }

    /**
     * opcjonalne nr 2 - usunięcie adresu
     */
    public void removeAddresses() {
        for (WebElement address : addresses) {
            address.findElement(By.cssSelector("a[title=Delete]")).click();
            driver.switchTo().alert().accept();
        } /** klikniecie accept w alercie w okienku przeglądarki */
    }

    /**
     * opcjonalnie 4 - do weryfikacji utworzonego adresu
     */
    public String getFirstAddressAsText() {
        WebElement address = addresses.get(0);
        String[] lines = address.getText().split("\n");
        lines = Arrays.copyOf(lines, lines.length - 2);
        return String.join("\n", lines);
    }
}
