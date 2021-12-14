package com.n11.util;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Helper {
    public static void switchLastTab() {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);
    }
    public static void switchFirstTab() {
        switchTo().window(0);
    }
}
