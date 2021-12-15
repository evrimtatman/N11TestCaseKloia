package com.n11;

import com.n11.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class N11ProductListPage extends BasePage {

    public static String CATEGORY_ITEM = "//a[contains(text(),'Parfüm & Deodorant')]";
    public static String PRODUCT_POSITION = "[data-position='7']";
    private static String N11_FAVORITE_PAGE_URL = "https://www.n11.com/hesabim/favorilerim";

    public void clickCatList(String item) {
        $(By.cssSelector(".catMenu")).shouldHave(text(item)).click();
    }

    public void clickSubCatList(String item) {
        $(".l12.subCatMenu > ul  a[title='Parfüm & Deodorant']").shouldBe(visible);
        $(By.cssSelector(".subCatMenu [title='Parfüm & Deodorant']")).click();

        // $(By.cssSelector(".subCatMenu.l12")).shouldHave(text(item)).click();
        // SelenideElement elem = $(By.cssSelector("[title^='" + prodName + "']"));
    }

    public void addToWishList() {
        findByCss("a#getWishList").shouldBe(enabled).click();
    }

    public void confirmWishList(){
        findByCss("#addToFavouriteWishListBtn").shouldBe(visible).click();
        findByCss(".btn.btnBlack.confirm").shouldBe(enabled).click();
    }

    public void searchBrand(String brandName) {
        findByCss(".searchInput [type]").shouldBe(enabled).sendKeys(brandName);
    }
    public void clickSearchButton(){
            findByCss("#allFilterSearchBtn").click();
    }
    public void clickChosenProduct(int productPosition){
        findByCss(PRODUCT_POSITION).click();
    }
    public String getProdTitle() {
        String selectedProductTitle = findByCss(".proName").getText();
        return selectedProductTitle;
    }
    public void goToFavoritePage() {
        open(N11_FAVORITE_PAGE_URL);
    }
    public String getWishListAddedProdName() {
        String addedProductFullName= $$("a.plink").first().getAttribute("title");
        return addedProductFullName;
    }
    public void verifyTexts(String text1, String text2) {
        Assert.assertEquals(text1, text2);
    }
}


