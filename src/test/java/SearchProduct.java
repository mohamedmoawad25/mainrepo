import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProduct {
    WebDriver driver = null;
    //LoginPage login;
    SearchPage search;
    SoftAssert soft;
    CartPage cart;
    CheckoutPage check;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://sauce-demo.myshopify.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        search = new SearchPage();
        soft = new SoftAssert();
        cart = new CartPage();
        check = new CheckoutPage();
    }

    @Test (priority = 2)
    public void searchproduct() throws InterruptedException {
       search.searchPOM(driver).click();
       search.searchSteps(driver,"jacket");
       search.productPOM(driver).click();
       search.cardPOM(driver).click();
        Thread.sleep(2000);

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
