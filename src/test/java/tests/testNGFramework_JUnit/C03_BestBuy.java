package tests.testNGFramework_JUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_BestBuy {
    @Test
    public void bestBuyTest(){
        //o Sayfa URL’inin https://www.bestbuy.com/ ‘a eşit olduğunu test edin
        Driver.getDriver().get(ConfigReader.getProperty("bestBuyUrl"));
        String expectedUrl =ConfigReader.getProperty("bestBuyUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"Istenen Url'i bulamadi");

        //o titleTest => Sayfa başlığının “Rest" içermediğini(contains) test edin
        String expectedTitle="Rest";
        String actualTitle=Driver.getDriver().getTitle();
        softAssert.assertNotEquals(actualTitle,expectedTitle,"Beklenen baslik mevcut baslikla eslesti");

        //o logoTest => BestBuy logosunun görüntülendiğini test edin
        BestBuyPage bestBuyPage=new BestBuyPage();
        softAssert.assertTrue(bestBuyPage.logoGorunurlugu.isDisplayed(),"BestBuy logosu goruntulendi");

        //o FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        softAssert.assertTrue(bestBuyPage.francaisElementi.isDisplayed(),"Fransizca linki goruntulendi");

        softAssert.assertAll();
        Driver.closeDriver();


    }
}
