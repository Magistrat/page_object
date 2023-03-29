package tests;

import org.openqa.selenium.WebDriver;

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
        driver.quit();
    }

}
