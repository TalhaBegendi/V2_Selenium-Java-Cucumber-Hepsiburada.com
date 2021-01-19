package notCucumberOnlyPOM;
import assertVisible_Xpath.assertVisible;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesClick_Xpath.pagesClick;

public class TestClass {
    private static ChromeDriver Webdriver;
    @BeforeClass
    public  static void HepsiburadaGiris()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Talha BEĞENDİ/Documents/Selenium/ChromeDriver/chromedriver.exe");
        Webdriver = new ChromeDriver();
        Webdriver.manage().window().maximize();
        Webdriver.get("https://www.hepsiburada.com/");
    }
    @Test
    public void Senaryo_01_UrunArama()
    {
        pagesClick urunArama = new pagesClick(Webdriver);
        assertVisible urunAramaAssert = new assertVisible(Webdriver);
        urunArama.UrunArama("iphone");
        urunArama.AraButton();
        //Assert.assertTrue(urunAramaAssert.Assert_aramaYapilanUrun());
       // urunArama.UrunIphone();
       // Assert.assertTrue(urunAramaAssert.Assert_urunAd());
       // urunArama.YorumlarButton();
        //urunArama.IlkYorumEvetTikla();
        //Assert.assertTrue(urunAramaAssert.Assert_ilkYorumTesekkur());
    }
}
