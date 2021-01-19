package assertVisible_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assertVisible extends assertInteractive {

    public assertVisible(WebDriver driver)
    {
            super(driver);
    }
    public Boolean Assert_aramaYapilanUrun()
    {
        ElementVisible(assert_aramaYapilanUrun);
        return elementAssert.isDisplayed();
    }
    public Boolean Assert_urunAd()
    {
        ElementVisible(assert_urunAd);
        return elementAssert.isDisplayed();
    }
    public Boolean Assert_ilkYorumTesekkur()
    {
        ElementVisible(assert_ilkYorumTesekkur);
        return elementAssert.isDisplayed();
    }
}
