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


    public void clickElectronics() {
        clickByXNCssUsingJavaScript(WEB_ELEMENT_ELECTRONICS);
    }

    public void VerifyPageHeader(String expectedHeader) {
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_ELECTRONICS_HEADER);
    }


}


