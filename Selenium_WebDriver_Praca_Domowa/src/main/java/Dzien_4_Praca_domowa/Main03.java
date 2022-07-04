package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main03 {
    /**
     * # Wyszukiwanie elementów - formularz
     * Pod linkiem https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html
     * dostępny jest formularz, którego wypełnianie i wysyłanie należy zautomatyzować.
     * Wypełnij dane w formularzu:
     * First name: Karol
     * Last name: Kowalski
     * Gender: Male
     * Date of birth: 05/22/2010
     * Address: Prosta 51
     * Email: karol.kowalski@mailinator.com
     * Password: Pass123
     * Company: Coders Lab
     * Comment: To jest mój pierwszy automat testowy
     * Zatwierdź formularz - **SUBMIT**
     * 💁‍♂️ **Wskazówki:**
     * - Pamiętaj o odpowiednich komentarzach. Tak, aby móc w przyszłości wrócić do tego skryptu.
     * - Pamiętaj, aby każdy element był poprawnie i jednoznacznie zlokalizowany.
     * - Staraj się pracować krok po kroku.
     * Zlokalizuj pierwszy element, sprawdź, czy skrypt poprawnie go rozpoznaje, następnie kolejny i kolejny.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstName = driver.findElement(By.id("first-name"));
        if (firstName.isDisplayed()) {
            firstName.clear();
            firstName.sendKeys("Karol");
        } else {
            System.out.println("Element firstName not displayed");
        }
        WebElement lastName = driver.findElement(By.id("last-name"));
        if (lastName.isDisplayed()) {
            lastName.clear();
            lastName.sendKeys("Kowalski");
        } else {
            System.out.println("Element lastName not displayed");
        }
        //https://stackoverflow.com/questions/70975538/visible-enabled-or-selected-element-in-selenium
        //korzystamy z tego, że płeć "Male" w kodzie występuje jako pierwsza
        WebElement gender = driver.findElement(By.xpath("//input[@name='gender']"));
        if (!gender.isSelected()) {
            gender.click();
        } else {
            System.out.println("Element gender not selected");
        }
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        if (dateOfBirth.isDisplayed()) {
            dateOfBirth.clear();
            dateOfBirth.sendKeys("05/22/2010");
        } else {
            System.out.println("Element dateOfBirth not displayed");
        }
        WebElement address = driver.findElement(By.id("address"));
        if (address.isDisplayed()) {
            address.clear();
            address.sendKeys("Prosta 51");
        } else {
            System.out.println("Element address not displayed");
        }
        WebElement email = driver.findElement(By.id("email"));
        if (email.isDisplayed()) {
            email.clear();
            email.sendKeys("karol.kowalski@mailinator.com");
        } else {
            System.out.println("Element email not displayed");
        }
        WebElement password = driver.findElement(By.id("password"));
        if (password.isDisplayed()) {
            password.clear();
            password.sendKeys("Pass123");
        } else {
            System.out.println("Element password not displayed");
        }
        WebElement company = driver.findElement(By.id("company"));
        if (company.isDisplayed()) {
            company.clear();
            company.sendKeys("Coders Lab");
        } else {
            System.out.println("Element company not displayed");
        }
        /** opcjonalne - start */
        WebElement role = driver.findElement(By.xpath("//*[@id=\"role\"]/option[2]"));
        if (role.isDisplayed()) {
            role.click();
        } else {
            System.out.println("Element role not displayed");
        }
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[6]")).click();
        //oznaczenie górnego checkboxa
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        //oznaczenie wszystkich checboxow
        for (int i = 1; i <= 6; i++) {
            driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[" + i + "]/label/input")).click();
        }
        /** opcjonalne - koniec */
        WebElement comment = driver.findElement(By.id("comment"));
        if (comment.isDisplayed()) {
            comment.clear();
            comment.sendKeys("To jest mój pierwszy automat testowy");
        } else {
            System.out.println("Element comment not displayed");
        }
        WebElement submit = driver.findElement(By.id("submit"));
        if (submit.isDisplayed()) {
            submit.click();
        } else {
            System.out.println("Element Btn submit not displayed");
        }
        WebElement textSucces = driver.findElement(By.id("submit-msg"));
        if (textSucces.isDisplayed()) {
            System.out.println(textSucces.getText());
        } else {
            System.out.println("Element textSucces not displayed");
        }
        driver.quit();
    }
}
