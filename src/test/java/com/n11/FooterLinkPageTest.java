package com.n11;

import org.testng.annotations.Test;

import java.util.List;

public class FooterLinkPageTest extends BasePage{
    @Test
    public void footerLinkCompare() {
    N11HomePage homePage = new N11HomePage();
    FooterLinkPage fp = new FooterLinkPage();
     homePage.goToPage();
     fp.getFooterLinks();

    }
}
