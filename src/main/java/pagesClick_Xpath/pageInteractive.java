package pagesClick_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageInteractive extends pagesXpath {

        WebDriver webDriver;
        WebElement webElement;

    public pageInteractive(WebDriver driver)
    {
        this.webDriver = driver;
   }
    public void ElementClick(By element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
    }
    public void ElementSendkey(By element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
