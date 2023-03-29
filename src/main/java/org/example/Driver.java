package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import static org.example.Settings.PLATFORM_DRIVER;
import static org.example.Settings.PORTAINER_COMMAND_EXECUTOR;
import static org.example.Settings.OPTIONS;
import static org.example.Settings.MOBILE_EMULATION;
import static org.example.Settings.ENABLE_AUTOMATION;


public class Driver {

    public static void main(String[] args) {
        try {
            WebDriver driver = CreateDriver();
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static WebDriver CreateDriver() throws MalformedURLException {
        WebDriver driver = null;


        ChromeOptions options = new ChromeOptions();
        for (int i = 0; i < OPTIONS.length - 1; i++) {
            options.addArguments(OPTIONS[i]);
        }
        options.setExperimentalOption("mobileEmulation", MOBILE_EMULATION);
        options.setExperimentalOption("excludeSwitches", ENABLE_AUTOMATION);

        
        switch (PLATFORM_DRIVER) {
            case ("local") -> {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver(options);
            }
            case ("docker") -> {

                options.setCapability("browserName", "chrome");
                options.setCapability("browserVersion", "100.0");
                options.setCapability("enableVNC", true);
                options.setCapability("enableVideo", false);

                driver = new RemoteWebDriver(URI.create(PORTAINER_COMMAND_EXECUTOR).toURL(), options);
            }
            default -> {
            }
        }
        driver.get("https://portainer.keyauto.ru/preprod/ssp/");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return driver;
    }
}