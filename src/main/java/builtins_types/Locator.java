package builtins_types;

import org.openqa.selenium.By;

public class Locator {

    public By By;
    public String selector;
    public String description;

    public Locator(By By, String selector, String description) {
        this.By = By;
        this.selector = selector;
        this.description = description;
    }

}
