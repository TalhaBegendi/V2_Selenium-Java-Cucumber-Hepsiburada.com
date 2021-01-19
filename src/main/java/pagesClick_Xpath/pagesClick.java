package pagesClick_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagesClick extends pageInteractive
{
    public pagesClick(WebDriver driver)
   {
       super(driver);
   }
    public void UrunArama(String urun)  {
        ElementSendkey(urunArama);
        webElement.sendKeys(urun);
    }
    public void AraButton()
    {
        ElementClick(araButton);
    }
    public void UrunIphone()
    {
        ElementClick(urunIphone);
    }
    public void YorumlarButton()
    {
        ElementClick(yorumlarButton);
    }
    public void IlkYorumEvetTikla()
    {
        ElementClick(ilkYorumEvetTikla);
    }
}