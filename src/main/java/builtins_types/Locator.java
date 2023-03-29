package builtins_types;

import org.openqa.selenium.By;

public class Locator {

    public By By_obj;
    public String selector;
    public String description;

    public Locator(String _By, String selector, String description) {
        this.selector = selector;
        this.description = description;

        if ("CSS_SELECTOR".equals(_By)) {
            this.By_obj = By.cssSelector(selector);
        } else if ("XPATH".equals(_By)) {
            this.By_obj = By.xpath(selector);
        } else {
            // Поднимаем ошибку
            assert true;
        }


    }
}
