package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US003 {
    MedunnaPages medunnaPages = new MedunnaPages();

    @Given("Kullanici belirtilen medunnaUrl'e gider.")
    public void kullanici_belirtilen_medunna_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("Kullanici sayfada sag ustte bulunan kisi iconuna tiklar ve sign in ve register sekmesi acilir.")
    public void kullanici_sayfada_sag_ustte_bulunan_kisi_iconuna_tiklar_ve_sign_in_ve_register_sekmesi_acilir() {

        medunnaPages.login.click();
    }

    @When("Acilan kutucukta register secenegini tiklanir.")
    public void acilan_kutucukta_register_secenegini_tiklanir() {
        medunnaPages.dropDownRegister.click();

    }

    @When("Acilanin Register sayfasi oldugu dogrulanir.")
    public void acilanin_register_sayfasi_oldugu_dogrulanir() {
        Assert.assertTrue(medunnaPages.registrationText.isDisplayed());

    }

    @When("PassWord bolumune alti tane buyuk harf girdikten sonra bir tane kucuk harf girilir.")
    public void pass_word_bolumune_alti_tane_buyuk_harf_girdikten_sonra_bir_tane_kucuk_harf_girilir() {
        medunnaPages.password.sendKeys(ConfigReader.getProperty("passwordTC1"));


    }


    @Then("Password strenght seviyesinin degistigi test edilir.")
    public void passwordStrenghtSeviyesininDegistigiTestEdilir() {
        Assert.assertTrue(medunnaPages.passwordStrength2.isDisplayed());
    }

    @Then("Sayfa kapatilir.")
    public void sayfa_kapatilir() {
        Driver.closeDriver();

    }

    //TC02
    @And("PassWord bolumune alti tane kucuk harf girdikten sonra bir tane buyuk harf girilir.")
    public void passwordBolumuneAltiTaneKucukHarfGirdiktenSonraBirTaneBuyukHarfGirilir() {
        medunnaPages.password.sendKeys(ConfigReader.getProperty("passwordTC2"));

    }


    //TC03
    @Then("PassWord bolumune alti tane kucuk harf girdikten sonra bir tane rakam girilir.")
    public void passwordBolumuneAltiTaneKucukHarfGirdiktenSonraBirTaneRakamGirilir() {
        medunnaPages.password.sendKeys(ConfigReader.getProperty("passwordTC3"));

    }

    //TC04
    @Then("PassWord bolumune alti tane buyuk harf girdikten sonra bir tane ozel karakter girilir.")
    public void passwordBolumuneAltiTaneBuyukHarfGirdiktenSonraBirTaneOzelKarakterGirilir() {
        medunnaPages.password.sendKeys(ConfigReader.getProperty("passwordTC4"));
    }

    //TC05
    @And("Register sayfasinda bulunan Password kismina {int} karakterden az rakam,ozel karakter ve harf girilir.")
    public void registerSayfasindaBulunanPasswordKisminaKarakterdenAzRakamOzelKarakterVeHarfGirilir(int arg0) {
        medunnaPages.password.sendKeys(ConfigReader.getProperty("passwordTC5"));

    }

    @Then("{string} renk seviyesini degismedigi test edilir.")
    public void renkSeviyesiniDegismedigiTestEdilir(String arg0) {

        Assert.assertTrue(medunnaPages.passwordStrength1.isDisplayed());
    }

    //TC06
    @And("Buyuk, kucuk harf, rakam, ozel {int} karakter girilir.")
    public void buyukKucukHarfRakamOzelKarakterGirilir(int arg0) {
        medunnaPages.password.sendKeys(ConfigReader.getProperty("passwordTC6"));


    }

    @Then("Yedinci harf girilince guclu bir sifre olustugu test edilir.")
    public void yedinciHarfGirilinceGucluBirSifreOlustuguTestEdilir() {
        Assert.assertTrue(medunnaPages.passwordStrength5.isDisplayed());


    }

}