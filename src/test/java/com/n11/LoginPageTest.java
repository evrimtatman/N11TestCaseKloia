package com.n11;

import org.testng.annotations.Test;

public class LoginPageTest extends BasePage {
    @Test
    public void loginViaFacebook() {

        N11HomePage homePage = new N11HomePage();
        LoginPage login =new LoginPage();

        homePage.goToPage();
        login.gotoLoginTab();
        login.chooseLoginOption();
            login.loginFB("","");
        login.verifyAccountLoggedIn();
       // homePage.closePopup();


    }


}
