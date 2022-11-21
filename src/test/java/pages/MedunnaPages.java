package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPages {
    public MedunnaPages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement dropDownRegister;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement login;

    @FindBy(xpath = "//span[text()='Registration']")
    public WebElement registrationText;
    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement passwordStrength5;
    @FindBy(xpath = "//*[@name='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement logSignin;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement signinUsername;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement signinPassword;

    @FindBy(xpath = "//*[@class='form-check form-check-inline']")
    public WebElement rememberme;

    @FindBy(xpath = "//*[@class='alert alert-warning fade show']")
    public WebElement forgetpassword;

    @FindBy(xpath = "//*[@class='alert alert-warning fade show'][2]")
    public WebElement donthave;

    @FindBy(xpath = "//*[@class='btn btn-secondary']")
    public WebElement cancel;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath = "//h1")
    public WebElement wellcomeToMedunnaText;
    @FindBy(xpath = "//*[text()='Failed to sign in!']")
    public WebElement SigningirisYapilamadi;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement kullanicilogin;

    @FindBy(xpath = "//*[text()='Settings']")
    public  WebElement kullaniciProfilSettings;

    @FindBy(xpath = "//*[@name='firstName']")
    public  WebElement hastaProfilSettingsFirstName;

    @FindBy(xpath = "//*[@id='lastName']")
    public  WebElement hastaProfilSettingsLastName;

    @FindBy(xpath = "//*[@name='email']")
    public  WebElement hastaProfilSettingsEmail;

    @FindBy(xpath = "//*[text()='Save']")
    public  WebElement hastaProfilSettingsSave;

    @FindBy(xpath= "(//strong)[1]")
    public WebElement settingsSaved;







}
