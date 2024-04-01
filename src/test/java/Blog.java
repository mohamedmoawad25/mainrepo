import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Blog {
    WebDriver driver = null;

    SoftAssert soft ;
    BlogPage blog;


    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://sauce-demo.myshopify.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        soft = new SoftAssert();
        blog = new BlogPage();

    }

    @Test(priority = 1)
    public void blog() {

        driver.findElement(blog.blogPOM()).click();
        soft.assertEquals(driver.getCurrentUrl(), "https://sauce-demo.myshopify.com/blogs/news",
                "Logout Done Assertion");
        soft.assertAll();

    }
    @AfterTest
    public void CloseDriver () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
