package com.n11;

import org.testng.annotations.AfterTest;

public class BasePageTest extends BasePage {
        N11ProductListPage favPage = new N11ProductListPage();


    @AfterTest
    public void removeAddedFavoriteProds() {
        //favPage.goToFavoritePage();

    }}
