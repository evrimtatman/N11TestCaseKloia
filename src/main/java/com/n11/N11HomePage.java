package com.n11;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class N11HomePage extends BasePage {


    void goToPage() {
        open(N11HomePage.URL);
    }

    public void closePopup() {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);

        $(".fancybox-close").click();

    }
    public void closeFancyPopup() {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);

        $(".fancybox-close").click();

    }



}
