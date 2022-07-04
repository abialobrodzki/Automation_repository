package Dzien_4_Praca_domowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main08 {
    /**
     * # Filtrowanie produktów
     * Sprawdź funkcjonalność zakupu produktów w sklepie
     * https://mystore-testlab.coderslab.pl//index.php
     * Dokonaj zamówienia dowolnych produktów. W koszyku powinny być minimum 2 produkty z różnych kategorii.
     * **Wskazówki:**
     * - Zwróć uwagę, że wielokrotne zakupy mogą spowodować brak towaru w naszym sklepie.
     * Przygotuj skrypt również na taką sytuację.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        final int ORDERS = 2; //liczba zamówień

        /** logowanie */
        WebElement logIn = driver.findElement(By.xpath("//*[contains(@title,'Log in')]"));
        if (logIn.isDisplayed()) {
            logIn.click();
        } else {
            System.out.println("Element logIn not displayed");
        }
        WebElement email = driver.findElement(By.xpath("//*[contains(@name,'email')]"));
        if (email.isDisplayed()) {
            email.clear();
            email.sendKeys("private4@gmail.com");
        } else {
            System.out.println("Element email not displayed");
        }
        WebElement password = driver.findElement(By.xpath("//*[contains(@name,'password')]"));
        if (password.isDisplayed()) {
            password.clear();
            password.sendKeys("private4");
        } else {
            System.out.println("Element password not displayed");
        }
        WebElement btnSubmit = driver.findElement(By.xpath("//*[contains(@id,'submit-login')]"));
        if (btnSubmit.isDisplayed()) {
            btnSubmit.click();
        } else {
            System.out.println("Element btnSubmit not displayed");
        }
        for (int j = 1; j <= ORDERS; j++) {
            /** przejście do strony głównej */
            WebElement homeIn = driver.findElement(By.xpath("//*[contains(@src,'logo')]"));
            if (homeIn.isDisplayed()) {
                homeIn.click();
            } else {
                System.out.println("Element homeIn not displayed");
            }
            /** przejście do listy produktów */
            WebElement shopIn = driver.findElement(By.xpath("//*[contains(@class,'all-product')]"));
            if (shopIn.isDisplayed()) {
                shopIn.click();
            } else {
                System.out.println("Element shopIn not displayed");
            }
            /** dodanie 1 produktu - Clothes: Hummingbird printed t-shirt */
            WebElement prodOne = driver.findElement(By.xpath("//*[contains(@alt,'Hummingbird printed t-shirt')]"));
            if (prodOne.isDisplayed()) {
                prodOne.click();
            } else {
                System.out.println("Element prodOne not displayed");
            }
            WebElement outStock1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
            if (!outStock1.isDisplayed()) {
                System.out.println("prodOne empty stock");
            } else {
                System.out.println("prodOne on stock");
                //parametry bluzki XL - black - 1szt
                driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[4]")).click();
                driver.findElement(By.xpath("//*[@id=\"group_2\"]/li[2]/*")).click();
                WebElement quantity = driver.findElement(By.xpath("//*[contains(@name,'qty')]"));
                //nieskuteczna metoda - nie zawsze się ustawia zadaną ilość
//        if (quantity.isDisplayed()) {
//            quantity.clear();
//            quantity.sendKeys("2");
//        } else {
//            System.out.println("Element quantity not displayed");
//        }
                for (int i = 1; i < 2; i++) {
                    WebElement btnAddClic = driver.findElement(By.xpath("//*[contains(@class,'material-icons touchspin-up')]"));
                    if (btnAddClic.isDisplayed()) {
                        btnAddClic.click();
                    } else {
                        System.out.println("Element btnAddClic not displayed");
                    }
                }
                //dodanie do koszyka
                WebElement btnAddToCart = driver.findElement(By.xpath("//*[contains(@data-button-action,'add')]"));
                if (btnAddToCart.isDisplayed()) {
                    btnAddToCart.click();
                } else {
                    System.out.println("Element btnAddToCart not displayed");
                }
                Thread.sleep(1000);
                //kontynuacja zakupów
                WebElement btnContinue = driver.findElement(By.xpath("//*[contains(@class,'btn btn-secondary')]"));
                if (btnContinue.isDisplayed()) {
                    btnContinue.click();
                } else {
                    System.out.println("Element btnContinue not displayed");
                }
            }
            /** cofnięcie strony */
            driver.navigate().back();
            /** dodanie 2 produktu - Accessories: Mug Today is a good day */
            WebElement prodTwo = driver.findElement(By.xpath("//*[contains(@alt,'Mug Today is a good day')]"));
            if (prodTwo.isDisplayed()) {
                prodTwo.click();
            } else {
                System.out.println("Element prodTwo not displayed");
            }
            WebElement outStock2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
            if (!outStock2.isDisplayed()) {
                System.out.println("prodTwo empty stock");
            } else {
                System.out.println("prodTwo on stock");
                //zwiększenie ilości "^"
                for (int i = 1; i < 10; i++) {
                    WebElement btnAddClic2 = driver.findElement(By.xpath("//*[contains(@class,'material-icons touchspin-up')]"));
                    if (btnAddClic2.isDisplayed()) {
                        btnAddClic2.click();
                    } else {
                        System.out.println("Element btnAddClic2 not displayed");
                    }
                }
                //dodanie do koszyka
                WebElement btnAddToCart2 = driver.findElement(By.xpath("//*[contains(@data-button-action,'add')]"));
                if (btnAddToCart2.isDisplayed()) {
                    btnAddToCart2.click();
                } else {
                    System.out.println("Element btnAddToCart2 not displayed");
                }
                Thread.sleep(1000);
                //kontynuacja zakupów
                WebElement btnContinue2 = driver.findElement(By.xpath("//*[contains(@class,'btn btn-secondary')]"));
                if (btnContinue2.isDisplayed()) {
                    btnContinue2.click();
                } else {
                    System.out.println("Element btnContinue2 not displayed");
                }
            }
            /** cofnięcie strony */
            driver.navigate().back();
            /** dodanie 3 produktu - Art: Hummingbird - Vector graphics */
            WebElement prodThree = driver.findElement(By.xpath("//*[contains(@alt,'Hummingbird - Vector graphics')]"));
            if (prodThree.isDisplayed()) {
                prodThree.click();
            } else {
                System.out.println("Element prodThree not displayed");
            }
            //out of stock
            WebElement outStock3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
//            WebElement outStock3 = driver.findElement(By.xpath("//*[contains(@disabled,'')]"));
//            WebElement outStock3 = driver.findElement(By.xpath("//*[contains(@class,'material-icons product-unavailable')]"));
            if (outStock3.isDisplayed()) {
                System.out.println("prodThree empty stock");
            } else {
                System.out.println("prodThree on stock");
            }
            /** cofnięcie strony */
            driver.navigate().back();
            /** przejście do koszyka */
            WebElement btnCart = driver.findElement(By.xpath("//*[contains(@href,'cart&action=show')]"));
            if (btnCart.isDisplayed()) {
                btnCart.click();
            } else {
                System.out.println("Element btnCart not displayed");
            }
            //przejście do płatności
            WebElement btnOrder = driver.findElement(By.xpath("//*[contains(@href,'order')]"));
            if (btnOrder.isDisplayed()) {
                btnOrder.click();
            } else {
                System.out.println("Element btnOrder not displayed");
            }
            //potwierdzenie adresu
            WebElement btnConfirmAddress = driver.findElement(By.xpath("//*[contains(@name,'confirm-addresses')]"));
            if (btnConfirmAddress.isDisplayed()) {
                btnConfirmAddress.click();
            } else {
                System.out.println("Element btnConfirmAddress not displayed");
            }
            //potwierdzenie sposobu dostawy
            WebElement btnConfirmDelivery = driver.findElement(By.xpath("//*[contains(@name,'confirmDeliveryOption')]"));
            if (btnConfirmDelivery.isDisplayed()) {
                btnConfirmDelivery.click();
            } else {
                System.out.println("Element btnConfirmDelivery not displayed");
            }
            Thread.sleep(1000);
            //potwierdzenie płatności
            WebElement btnConfirmPayment = driver.findElement(By.xpath("//*[@id=\"payment-option-2\"]"));
            if (!btnConfirmPayment.isDisplayed()) {
                btnConfirmPayment.click();
            } else {
                System.out.println("Element btnConfirmPayment not displayed");
            }
            //potwierdzenie regulaminu
            driver.findElement(By.xpath("//*[contains(@name,'conditions')]")).click();
            //potwierdzenie zamówienia
            WebElement btnConfirmOrder = driver.findElement(By.xpath("//*[contains(@class,'btn-primary center-block')]"));
            if (btnConfirmOrder.isDisplayed()) {
                btnConfirmOrder.click();
            } else {
                System.out.println("Element btnConfirmOrder not displayed");
            }
            /** potwierdzenie złożenia zamówienia */
            WebElement ConfirmOrder = driver.findElement(By.xpath("//*[contains(@class,'h1')]"));
            if (ConfirmOrder.isDisplayed()) {
                System.out.println("ORDER IS CONFIRMED");
            } else {
                System.out.println("ORDER IS NOT CONFIRMED");
            }
        }
        driver.quit();
    }
}
