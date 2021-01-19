package assertVisible_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assertInteractive extends  assertXpath {

    WebDriver webDriver;
    WebElement elementAssert;

    public assertInteractive(WebDriver driver)
    {
        this.webDriver = driver;
    }
    public void ElementVisible(By Element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementAssert = wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
    }
}
