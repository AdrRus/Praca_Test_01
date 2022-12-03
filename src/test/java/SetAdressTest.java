import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetAdressTest {

    private static WebDriver driver;

    String url = "https://mystore-testlab.coderslab.pl.";



    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void setUpAdress(){
        NavigationPanelPage navigationPanelPage = new NavigationPanelPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        AddressPage addressPage = new AddressPage(driver);

        driver.get(url);

        navigationPanelPage.goToSignInPage();
        signInPage.logIn("tester.aido22@gmail.com","Teste.01");
        myAccountPage.pressAddress();
        newAddressPage.createNewAddress();
        addressPage.newAddresSet();







    }
    @AfterTest
    public void tearDown(){
        NavigationPanelPage navigationPanelPage = new NavigationPanelPage(driver);
       navigationPanelPage.signOutApp();
       //driver.quit();
    }
}
