package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    public static HomePage homePage = new HomePage();

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("User on Amazon Homepage")
    public void userOnAmazonHomepage() throws IOException {

        openBrowser("https://www.amazon.com");

    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("User click Toys and games")
    public void userClickToysAndGames() {
        homePage.selectToysAndGames();
    }

    @And("User click Art and Crafts")
    public void userClickArtAndCrafts() {
        homePage.selectArtAndCrafts();
    }

    @And("User click craft kits")
    public void userClickCraftKits() {
        homePage.selectCraftKits();
    }

    @And("User click Frees shipping check box")
    public void userClickFreesShippingCheckBox() {
        homePage.selectFreeShippingCheckBox();
    }

    @Then("Verify page header {string} in craft kits page")
    public void verifyPageHeaderInCraftKitsPage(String expectedHeader) {
        homePage.verifyCraftPageHeader(expectedHeader);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("User click Prime")
    public void userClickPrime() {
        homePage.selectPrime();
    }

    @And("User click Try Prime Button")
    public void userClickTryPrimeButton() {
        homePage.selectTryPrimeButton();
    }

    @And("User enter Email and Password")
    public void userEnterEmailAndPassword() {
        homePage.enterUserCredentials();
    }

    @And("User click sign-In Button")
    public void userClickSignInButton() {
        homePage.selectSignInButton();
    }

    @Then("Verify page header {string} in signIn page")
    public void verifyPageHeaderInSignInPage(String expectedHeader) {
        homePage.verifySignInPageHeader(expectedHeader);
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("user click on search bar")
    public void userClickOnSearchBar() {
        homePage.selectSearchField();
    }

    @And("user enter {string} in search bar")
    public void userEnterInSearchBar(String searchText) {
        homePage.sendKeysToSearchBar(searchText);
    }


    @And("User should see {string} in search bar")
    public void userShouldSeeInSearchBar(String expectedValue) {
        homePage.verifyExpectedResultText(expectedValue);
    }

    @But("I should not see {string} values in the search bar")
    public void iShouldNotSeeValuesInTheSearchBar(String notExpectedValue) {
        homePage.verifyNotExpectedValue(notExpectedValue);
    }

    @Then("I verify {string} as page url")
    public void iVerifyAsPageUrl(String expectedUrl) {
        homePage.verifyExpectedUrl(expectedUrl);

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("User click books")
    public void userClickBooks() {
        homePage.selectBookFromNavBar();
    }


    @And("User select {string} from books page")
    public void userSelectFromBooksPage(String bookCategories) {
        homePage.selectBookCategories(bookCategories);
    }

    @And("User should see {string} in each page")
    public void userShouldSeeInEachPage(String expectedHeader) {
        homePage.checkPageHeader(expectedHeader);
    }


    @Then("User verify {string} in each page")
    public void userVerifyInEachPage(String expectedUrl) {
        homePage.verifyUrl(expectedUrl);
    }
}