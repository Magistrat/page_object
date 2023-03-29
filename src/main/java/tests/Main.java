package tests;

import builtins_types.CustomWebdriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.driver.Driver.return_driver;

public class Main {
    static WebDriver driver = return_driver();

    public static void main(String[] args) {
        System.out.println("Тест Java");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


//        final By locator_test = By.xpath("//span[text()=\"Телефон\"]/..");


        driver.quit();
    }

}
