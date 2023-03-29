package builtins_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static setting.Settings.EXPLICITLY_TIMEOUT;
import static setting.Settings.POLL_FREQUENCY;

public class CustomWebdriverWait {
    public WebDriver driver;
    public float timeout;
    public float poll_frequency;
    public float attempts_number;
    protected int sleep_frequency;

    public CustomWebdriverWait(WebDriver driver, float timeout, float poll_frequency){
        this.driver = driver;
        this.timeout = timeout;
        if (poll_frequency == 0)
            this.poll_frequency = POLL_FREQUENCY;
        else
            this.poll_frequency = poll_frequency;
        this.attempts_number = timeout / poll_frequency;

    }

    public CustomWebdriverWait(WebDriver driver, float timeout){
        this.driver = driver;
        this.timeout = timeout;
        this.poll_frequency = POLL_FREQUENCY;
        this.attempts_number = timeout / POLL_FREQUENCY;
    }

    public CustomWebdriverWait(WebDriver driver){
        this.driver = driver;
        this.timeout = EXPLICITLY_TIMEOUT;
        this.poll_frequency = POLL_FREQUENCY;
        this.attempts_number = EXPLICITLY_TIMEOUT / POLL_FREQUENCY;
    }

//    НЕЛЬЗЯ ПЕРЕДАТЬ МЕТОД

//    public void until(metod, String message){
//        sleep_frequency = (int)(this.poll_frequency * 1000);
//        for(int i = 0; i < (int)this.attempts_number; i++){
//            try {
////                metod
//
//
//            } catch (Exception e) {
////                Ловля нужных ошибок
//                System.out.println(message);
//                continue;
//            }
//            try {
//                Thread.sleep(sleep_frequency);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//    }

}
