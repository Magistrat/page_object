package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

import static setting.Settings.PLATFORM_DRIVER;
import static setting.Settings.PORTAINER_COMMAND_EXECUTOR;
import static setting.Settings.OPTIONS;
import static setting.Settings.MOBILE_EMULATION;
import static setting.Settings.ENABLE_AUTOMATION;
import static setting.Settings.IMPLICITLY_TIMEOUT;


public class Driver {

    public static WebDriver return_driver() {
        try {
            return create_driver();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public static WebDriver create_driver() throws MalformedURLException {
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

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_TIMEOUT));
        driver.get("https://portainer.keyauto.ru/preprod/ssp/");

        return driver;
    }
}