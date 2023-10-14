package tests.testNGFramework_JUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_AmazonDropdown {
    @Test
    public void amazonTest(){

    //   1.adim : Amazon'a gidin ve dropdown webelementini locate et
    Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage= new AmazonPage();


    //  2.adim locate ettigimiz webelementi parametre olarak yazip select objesi olustur
        Select select=new Select(amazonPage.dropDownElementi);

    // 3.adim select objesi ile istenen islemi yap
        select.selectByVisibleText("Baby");

    // 4. Bulunan elementin fotoğrafını cekin.
        ReusableMethods.tumSayfaFotografCek("AmazonDropdownBabyElementi");

    // 5. Sayfayi kapatin.
        Driver.closeDriver();



}}
