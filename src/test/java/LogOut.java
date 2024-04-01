import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogOut {


        WebDriver driver = null;
        LoginPage login;
        Logoutpage logout;
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
            logout = new Logoutpage();

        }
        @Test(priority = 1)
        public void ValidData() throws InterruptedException {
            login.loginPOM(driver).sendKeys(Keys.ENTER);
            login.LoginSteps(driver, "momo@gmail.com", "123654789ى");
            Thread.sleep(20000);
            //soft.assertEquals(driver.getCurrentUrl(), "https://sauce-demo.myshopify.com/account",
                  //  "Login Done Assertion");
           // soft.assertAll();
        }
    @Test(priority = 1)
    public void logout()  {
        logout.logoutPOM(driver).sendKeys(Keys.ENTER);
        soft.assertEquals(driver.getCurrentUrl(), "https://sauce-demo.myshopify.com/",
                "Logout Done Assertion");
        soft.assertAll();

    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
