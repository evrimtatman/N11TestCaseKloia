package com.n11;


import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginPage extends BasePage{
    public void gotoLoginTab() {
        findByCss("a.btnSignIn").click();
    }
    public void chooseLoginOption(){
        findByCss("div.btnLogin").click();
    }
    public void loginFB(String mail,String pswd){
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);
        $("input#email").sendKeys(mail);
        $("input#pass").sendKeys(pswd);
        $("label.uiButton.uiButtonConfirm.uiButtonLarge").click();
        switchTo().window(0);

    }

    public boolean verifyAccountLoggedIn() {
        $("a.menuLink.user").shouldBe(visible, Duration.ofSeconds(30));
        $("a[title='Giriş Yap']").shouldNotHave(visible);
       // $("head>title").shouldHave(attribute("text", "n11.com - Hayat Sana Gelir"));
        return true;
    }

}
