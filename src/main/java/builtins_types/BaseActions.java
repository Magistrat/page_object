package builtins_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseActions {
    public WebDriver driver;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

}
