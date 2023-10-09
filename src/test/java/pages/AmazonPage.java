package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    /*
    TestNG de page class'lari
    surekli kullandigimiz bir sayfa/webSitesi'ndeki
    locate'leri ve
    ilgili sayfada kullanilacak login gibi basit methodlari icerir.

    TestNG page classlarindaki locatelere erisim icin
    Test classlarinda page classindan obje olusturulmasini benimsemistir
     */
     public AmazonPage(){
         PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramakutusu;

     @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElementi;

}
