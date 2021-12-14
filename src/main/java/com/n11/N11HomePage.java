package com.n11;

import com.n11.util.Helper;

import static com.codeborne.selenide.Selenide.*;

public class N11HomePage extends BasePage {


    void goToPage() {
        open(N11HomePage.URL);
    }

    public void closePopup() {
        Helper.switchLastTab();
        $(".fancybox-close").click();
    }

    public void closeFancyPopup() {
        Helper.switchLastTab();
        $(".fancybox-close").click();
    }
}