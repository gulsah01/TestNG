package tests.testNGFramework_JUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuAppPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C10_iframe {
    @Test
    public void iframeTest(){
        // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuAppIframe"));

        // 2 ) Bir metod olusturun: iframeTest
        //  - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        HerOkuAppPage herOkuAppPage=new HerOkuAppPage();
        Assert.assertTrue(herOkuAppPage.iFrameYaziElementi.isEnabled());
        Driver.getDriver().switchTo().frame(herOkuAppPage.iframe);
        herOkuAppPage.textBox.clear();
        //  - Text Box’a “Merhaba Dunya!” yazin.
        herOkuAppPage.textBox.sendKeys("Merhaba Dunya");
        Driver.getDriver().switchTo().defaultContent();
        //  - TextBox’in altinda bulunan “Elemental Selenium”
        //    linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin.
        //iframe'e gecen driver'i yeniden anasayfaya dondurmemiz gerekir
         Assert.assertTrue(herOkuAppPage.elementalLinki.isDisplayed());
         System.out.println(herOkuAppPage.elementalLinki.getText());
         Driver.closeDriver();
    }
}

