package pagesClick_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

public class pagesXpath {
    @CacheLookup public static By urunArama = By.className("desktopOldAutosuggestTheme-input");
    @CacheLookup public static By araButton = By.className("SearchBoxOld-buttonContainer");
    @CacheLookup public static By urunIphone = By.xpath("//a[@data-productid='HB00000NSBZ4']");
    @CacheLookup public static By yorumlarButton = By.id("reviewsTabTrigger");
    @CacheLookup public static By ilkYorumEvetTikla = By.xpath("//div[@class='paginationContentHolder']/div[1]//div[@class='hermes-ReviewCard-module-tAGUS']");
}