import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class OpenBrowser {

    WebDriver driver = null;
    LoginPage login;
    SoftAssert soft ;
    SearchPage search;
    CheckoutPage check;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://sauce-demo.myshopify.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        login = new LoginPage();
        soft = new SoftAssert();
        search = new SearchPage();
        check = new CheckoutPage();

    }


    @Test (priority = 1)
    public void ValidData() throws InterruptedException {
        login.loginPOM(driver).sendKeys(Keys.ENTER);
        login.LoginSteps(driver,"momo@gmail.com","123654789ى");
        Thread.sleep(15000);
        //soft.assertEquals(driver.getCurrentUrl(),"https://sauce-demo.myshopify.com/account",
               // "Login Done Assertion");
       // soft.assertAll();

    }
    @Test (dependsOnMethods = "ValidData")
    public void searchproduct() throws InterruptedException {
        search.searchPOM(driver).click();
        search.searchSteps(driver,"jacket");
        Thread.sleep(1000);
        search.productPOM(driver).click();
        search.cardPOM(driver).click();
    }
    @Test (dependsOnMethods = "searchproduct")
        public void Cart() throws InterruptedException {
             Thread.sleep(2000);
             check.checkOutUpPOM(driver).click();
        Thread.sleep(1000);
             check.checkOutDownPOM(driver).click();
             }
    @Test (dependsOnMethods = "Cart")
    public void CheckOut() throws InterruptedException {
        Thread.sleep(2000);
        check.CheckSteps(driver,"MOHAMED","MOAWAD AYED GOUDA","Beni Suef sharq el nile", "Beni Suef","62511"
                , "01030380270","4745010141033226", "01/28"
                , "079", "Beni Suef");

    }
    @Test (priority = 3)
    public void  InvalidData() throws InterruptedException {
        driver.navigate().to("https://sauce-demo.myshopify.com");
        login.loginPOM(driver).sendKeys(Keys.ENTER);
        login.LoginSteps(driver, "momo@gmail.com", "236547892");
        Thread.sleep(25000);
        soft.assertEquals(driver.getCurrentUrl(),"https://sauce-demo.myshopify.com/account/login",
                "Login  not Done Assertion");
        soft.assertAll();

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
      Thread.sleep(3000);
        driver.quit();
    }

}