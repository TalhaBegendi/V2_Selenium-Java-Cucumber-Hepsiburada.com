package assertVisible_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class assertVisible {

    WebDriver webDriver;
    WebElement elementAssert;

    public assertVisible(WebDriver driver)
    {

        this.webDriver = driver;
    }
    public Boolean Assert_aramaYapilanUrun()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementAssert = wait.until(ExpectedConditions.visibilityOfElementLocated(assertXpath.assert_aramaYapilanUrun));
        return elementAssert.isDisplayed();
    }
    public Boolean Assert_urunAd()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementAssert = wait.until(ExpectedConditions.visibilityOfElementLocated(assertXpath.assert_urunAd));
        return elementAssert.isDisplayed();
    }
    public Boolean Assert_ilkYorumTesekkur()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementAssert = wait.until(ExpectedConditions.visibilityOfElementLocated(assertXpath.assert_ilkYorumTesekkur));
        return elementAssert.isDisplayed();
    }
}
