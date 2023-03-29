package builtins_types;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static setting.Settings.EXPLICITLY_TIMEOUT;
import static setting.Settings.POLL_FREQUENCY;

public class BaseActions {
    public WebDriver driver;
    public float timeout;
    public float poll_frequency;
    public float attempts_number;
    protected int sleep_frequency;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
        this.timeout = EXPLICITLY_TIMEOUT;
        this.poll_frequency = POLL_FREQUENCY;
        this.attempts_number = EXPLICITLY_TIMEOUT / POLL_FREQUENCY;
        this.sleep_frequency = (int)(this.poll_frequency * 1000);
    }

    public void check_element_visibility(Locator locator_by){
        System.out.println(locator_by.By_obj + locator_by.selector);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(
                        (locator_by.By_obj)
                )
        );

    }
}
