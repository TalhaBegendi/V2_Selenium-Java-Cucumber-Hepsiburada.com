package assertVisible_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;

public class assertXpath {

    @CacheLookup public static By assert_aramaYapilanUrun  = By.xpath("//h1[@class='keyword'][text()[contains(.,'iphone')]]");
    @CacheLookup public static By assert_urunAd   = By.xpath("//h1[@id='product-name'][text()[contains(.,'iPhone 11 64 GB')]]");
    @CacheLookup public static By assert_ilkYorumTesekkur = By.xpath("//div[@class='paginationContentHolder']/div[1]//span[@class='hermes-ReviewCard-module-1ZiTv'][text()[contains(.,'Teşekkür Ederiz.')]]");
}
