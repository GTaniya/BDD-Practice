package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homepage.HomePageWebElement.*;



public class HomePage extends WebAPI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void selectToysAndGames(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_TOYS_AND_GAMES));
        element.click();
    }
    public void selectArtAndCrafts(){
        clickByXpath(WEB_ELEMENT_ART_AND_CRAFTS);
    }

    public void selectCraftKits(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_CRAFT_KITS));
        element.click();
    }

    public void selectFreeShippingCheckBox(){
        selectElement(WEB_ELEMENT_FREE_SHIPPING);
    }

    public void verifyCraftPageHeader(String expectedHeader){
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_CRAFTS_HEADER);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void selectPrime(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_PRIME));
        element.click();
    }

    public void selectTryPrimeButton(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_TRY_PRIME));
        element.click();
    }


    public void enterUserCredentials(){
        WebElement email = driver.findElement(By.id("ap_email"));
        WebElement password = driver.findElement(By.id("ap_password"));

        email.sendKeys("someone@gmail.com");
        password.sendKeys("abc123");
    }

    public void selectSignInButton(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_SIGN_IN_BUTTON));
        element.click();
    }
    public void verifySignInPageHeader(String expectedHeader){
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_SIGN_IN_HEADER);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void selectSearchField(){
        clickByXpath(WEB_ELEMENT_SEARCH_BAR);
    }

    public void sendKeysToSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_BAR,searchText);
    }

    public void verifyExpectedResultText(String expectedText){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR, "value"),expectedText);
    }

    public void verifyNotExpectedValue(String notExpectedText){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR, "value"),notExpectedText);
    }

    public void verifyExpectedUrl(String expectedUrl){
        Assert.assertTrue(isUrlTrue(expectedUrl));
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void selectBookFromNavBar(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_BOOKS));
        element.click();
    }

    public void selectBookCategories(String bookCategories){
        clickElement(driver.findElement(By.xpath(getBookCategoriesLocator(bookCategories))));
    }

//    public void checkPageHeader(String ExpectedPageHeaders){
//        softAssert.assertEquals(ExpectedPageHeaders, getPageHeaderLocators(ExpectedPageHeaders));
//        softAssert.assertAll();
//    }

    public void verifyUrl(String expectedUrl) {
        Assert.assertTrue(isUrlTrue(expectedUrl));
    }





}


