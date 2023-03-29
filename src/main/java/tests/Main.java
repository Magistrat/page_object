package tests;

import org.openqa.selenium.WebDriver;

import static org.driver.Driver.return_driver;

public class Main {
    static WebDriver driver = return_driver();

    public static void main(String[] args) {
        System.out.println("Тест Java");

        run_first_auth(driver);

        driver.quit();
    }


    public static void run_first_auth(WebDriver driver){
        AuthorizationPage page = new AuthorizationPage(driver);
        page.check_authorization_page();
    }
}
