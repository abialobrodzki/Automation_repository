package pl.coderslab.shop.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {
    private WebDriver driver;

    @FindBy(name = "birthday")
    WebElement birthdayInput;

    @FindBy(name = "newsletter")
    WebElement newsletterCheckbox;

    @FindBy(css = ".btn.btn-primary.form-control-submit")
    WebElement submitButton;

    @FindBy(css = ".alert.alert-success")
    WebElement successInformation;

    @FindBy(name = "password")
    WebElement passwordInput;

    public UserInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //zapisanie do newslettera
    public void signInForNewsletter() {
        if (!newsletterCheckbox.isSelected())
            newsletterCheckbox.click();
    }

    //wypisanie z newslettera
    public void signOutFromNewsletter() {
        if (newsletterCheckbox.isSelected())
            newsletterCheckbox.click();
    }

    //ustawia datę urodzin na podanego Stringa
    public void setBirthdate(String birthDate) {
        birthdayInput.click();
        birthdayInput.clear();
        birthdayInput.sendKeys(birthDate);
    }

    //ustawia hasło
    public void submitUserInfo() {
        passwordInput.sendKeys("CodersLab");
        submitButton.click();
    }

    //zwraca informacje czy zmiana się powiodła
    public String getUpdateInformation() {
        return successInformation.getText();
    }
}
