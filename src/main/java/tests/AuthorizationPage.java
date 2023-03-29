package tests;

import builtins_types.BaseActions;
import org.openqa.selenium.WebDriver;

import static tests.AuthorizationLocators.LOGIN_FIELD;
import static tests.AuthorizationLocators.PASSWORD_FIELD;

public class AuthorizationPage {
    public WebDriver driver;
    public AuthorizationPage(WebDriver driver){
        this.driver = driver;
    }


    public void check_authorization_page(){
        BaseActions base_act = new BaseActions(driver);
        base_act.check_element_visibility(LOGIN_FIELD);
        base_act.check_element_visibility(PASSWORD_FIELD);
    }


}
