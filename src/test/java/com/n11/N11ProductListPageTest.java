package com.n11;

import com.n11.util.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class N11ProductListPageTest extends BasePage {

    @Test
    public void loginViaFacebook() throws InterruptedException {

        N11HomePage homePage = new N11HomePage();
        LoginPage loginPage = new LoginPage();
        N11ProductListPage catList = new N11ProductListPage();

        homePage.goToPage();

        catList.clickCatList("Kozmetik & Kişisel Bakım");
        catList.clickSubCatList("Parfüm \\& Deodorant");
        catList.searchBrand("Lacoste");
        catList.clickSearchButton();
        catList.clickChosenProduct(7);
        String selectedProductTitle = catList.getProdTitle();

        catList.addToWishList();
        loginPage.chooseLoginOption();
        loginPage.loginFB(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        boolean isAccountLoggedIn = loginPage.verifyAccountLoggedIn();
        Assert.assertTrue(isAccountLoggedIn);

        catList.addToWishList();
        catList.confirmWishList();
        catList.goToFavoritePage();
        String addedProductFullName = catList.getWishListAddedProdName();
        catList.getWishListAddedProdName();
        catList.verifyTexts(selectedProductTitle,addedProductFullName);

    }
}