package com.n11;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    BasePage(){
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        clearBrowserCookies();

    }
    public static String URL = "https://www.n11.com/";

    SelenideElement findByCss(String css){ return $(By.cssSelector(css)); }

    ElementsCollection allByCss(String css){
        return $$(By.cssSelector(css));
    }

}