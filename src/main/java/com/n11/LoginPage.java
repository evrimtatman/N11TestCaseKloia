package com.n11;


import com.n11.BasePage;
import com.n11.util.Helper;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {
    public void gotoLoginTab() {
        findByCss("a.btnSignIn").click();
    }
    public void chooseLoginOption(){
        findByCss("div.btnLogin").click();
    }

    public void loginFB(String mail,String pswd){
        Helper.switchLastTab();
        $("#email").sendKeys(mail);
        $("#pass").sendKeys(pswd);
        $("label.uiButton.uiButtonConfirm.uiButtonLarge").click();
        Helper.switchFirstTab();
    }

    public boolean verifyAccountLoggedIn() {
        $("a.menuLink.user").shouldBe(visible, Duration.ofSeconds(30));
        String accountName = $(".menuLink.user").getOwnText();
        return !accountName.equals("Giriş Yap");
    }

}
