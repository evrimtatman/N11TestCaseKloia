package com.n11;

import com.n11.util.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePage {
    @Test
    public void loginViaFacebook() {

        N11HomePage homePage = new N11HomePage();
        LoginPage login = new LoginPage();

        homePage.goToPage();
        login.gotoLoginTab();
        login.chooseLoginOption();
        login.loginFB(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        login.verifyAccountLoggedIn();
        // homePage.closePopup();
    }


}
