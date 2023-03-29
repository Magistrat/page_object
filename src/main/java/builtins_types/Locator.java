package builtins_types;

import org.openqa.selenium.By;

public class Locator {

    public By By_obj;
    public String selector;
    public String description;

    public Locator(String _By, String selector, String description) {
        this.selector = selector;
        this.description = description;

        switch (_By){
            case ("CSS_SELECTOR"):
                this.By_obj = By.cssSelector(selector);
            case ("XPATH"):
                this.By_obj = By.xpath(selector);
            default:
//                Поднимаем ошибку
                break;
        }

    }
}
