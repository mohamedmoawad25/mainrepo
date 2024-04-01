import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {
    WebDriver driver = null;
    SignupPage signup;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://sauce-demo.myshopify.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        signup = new SignupPage();
    }

    @Test
    public void ValidData() throws InterruptedException {
        signup.signupPOM(driver).click();
        signup.SignupSteps(driver, "mohamed", "moawad","mohammed.moawad25@gmail.com",
                "123654789momo");
        Thread.sleep(3000);

    }
    @Test
    public void InValidData() throws InterruptedException {
        signup.signupPOM(driver).click();
        signup.SignupSteps(driver, "mohamed", "moawad","mohammed",
                "123654789momo");
        Thread.sleep(3000);

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
         Thread.sleep(3000);
        driver.quit();
    }
}
