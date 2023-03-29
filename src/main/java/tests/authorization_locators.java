package tests;

import org.openqa.selenium.By;
import builtins_types.Locator;

public class authorization_locators {
    Locator LOGIN_FIELD = new Locator("CSS_SELECTOR", ".input-login", "Поле 'Логин'");
    Locator PASSWORD_FIELD = new Locator("CSS_SELECTOR", ".input-password", "Поле 'Пароль'");
}
