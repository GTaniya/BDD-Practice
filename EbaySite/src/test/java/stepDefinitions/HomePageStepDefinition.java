package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    public static HomePage homePage = new HomePage();

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Ebay");  // embed it in the report
        }
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on ebay homePage")
    public void iAmOnT_mobileHomePage() throws IOException {

        openBrowser("https://www.ebay.com/");

    }


    @When("User click Electronics")
    public void userClickElectronics() {
        homePage.clickElectronics();
    }

    @Then("User should see {string} in Electronics page")
    public void userShouldSeeInElectronicsPage(String expectedText) {
        homePage.VerifyPageHeader(expectedText);
    }
}