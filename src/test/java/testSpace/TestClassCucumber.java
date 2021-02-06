package testSpace;

import assertVisible_Xpath.assertVisible;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesClick_Xpath.pagesClick;

public class TestClassCucumber   {
    WebDriver Webdriver;
    @Given("^Chrome baslatilir.$")
    public  void ChromeIslemler()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        Webdriver = new ChromeDriver();
        Webdriver.manage().window().maximize();
    }
    @When("^Hepsiburada.com giris yapilir.$")
    public  void HepsiburadaGiris()
    {
        Webdriver.get("https://www.hepsiburada.com/");
    }
    @And("^Iphone urunleri aranır.$")
    public void UrunArama()
    {
        pagesClick urunArama = new pagesClick(Webdriver);
        urunArama.UrunArama("iphone");
        urunArama.AraButton();
    }
    @And("^Iphone urunlerinin basariyla geldigi gorulur.$")
    public void UrunAramaAssert() {
        assertVisible urunAramaAssert = new assertVisible(Webdriver);
        Assert.assertTrue(urunAramaAssert.Assert_aramaYapilanUrun());
    }
    @And("^Iphone 11 urunu tiklanir.$")
    public void UrunDetay()
    {
        pagesClick urunDetay = new pagesClick(Webdriver);
        urunDetay.UrunIphone();
    }
    @And("^Iphone 11 urunu basariyla geldigi gorulur.$")
    public void UrunAdAssert()
    {
        assertVisible urunAdAssert = new assertVisible(Webdriver);
        Assert.assertTrue(urunAdAssert.Assert_urunAd());
    }
    @And("^Iphone 11 urunu degerlendirmeler butonuna tiklanir.$")
    public void UrunDetayYorumlar()
    {
        pagesClick urunDegerlendirmelerButton = new pagesClick(Webdriver);
        urunDegerlendirmelerButton.YorumlarButton();

    }
    @And("^İphone 11 urunu ilk degerlendirme evet butonuna tiklanir.$")
    public void UrunIlkYorumEvetTikla()
    {
        pagesClick urunIlkYorumEvetTikla = new pagesClick(Webdriver);
        urunIlkYorumEvetTikla.IlkYorumEvetTikla();
    }
    @And("^Ilk yorum basariyla tiklandigi ve Tesekkur Ederiz yazisinin basariyla geldigi gorulur.$")
    public void UrunAramaAssertIlkYorumTesekkur()
    {
        assertVisible urunAramaAssertIlkYorumTesekkur = new assertVisible(Webdriver);
        Assert.assertTrue(urunAramaAssertIlkYorumTesekkur.Assert_ilkYorumTesekkur());
    }
    @Then("^Testin tamamlandigi gorulur.$")
    public void TestFinish()
    {
        Webdriver.quit();
    }
}

