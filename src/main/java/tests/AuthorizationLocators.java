package tests;

import builtins_types.Locator;

public class AuthorizationLocators {
    public static final Locator LOGIN_FIELD = new Locator("CSS_SELECTOR", ".input-login", "Поле 'Логин'");
    public static final Locator PASSWORD_FIELD = new Locator("CSS_SELECTOR", ".input-password", "Поле 'Пароль'");
}
