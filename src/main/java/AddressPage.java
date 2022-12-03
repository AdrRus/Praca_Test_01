import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

    public AddressPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@id='field-alias']")
    WebElement alias;

    @FindBy(xpath = "//input[@id='field-address1']")
    WebElement adres;

    @FindBy(xpath = "//input[@id='field-postcode']")
    WebElement zipPostal;

    @FindBy(xpath = "//input[@id='field-city']")
    WebElement city;

    @FindBy(xpath = "//select[@id='field-id_country']")
    WebElement Country;

    @FindBy(id = "field-phone")
    WebElement phone;

    @FindBy(css = "button.btn.btn-primary.form-control-submit.float-xs-right")
    WebElement saveNewAddress;

    public void newAddresSet(){
        alias.sendKeys("To jest nowy adress");
        adres.sendKeys("Ul.Wapniaka");
        zipPostal.sendKeys("41-340");
        city.sendKeys("Bytom");
        Select nameCountry = new Select(Country);
        nameCountry.selectByValue("17");
        phone.sendKeys("654321987");
        saveNewAddress.click();

    }






}
