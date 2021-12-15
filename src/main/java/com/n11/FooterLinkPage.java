package com.n11;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class FooterLinkPage extends BasePage{

   public void getFooterLinks(){
        ElementsCollection footerLinks = $$(".is-dark");

    }
}
