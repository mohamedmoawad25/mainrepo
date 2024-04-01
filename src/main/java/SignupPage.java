import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
    public WebElement signupPOM(WebDriver driver)
    {
        return driver.findElement(By.id("customer_register_link"));
    }
    public WebElement firstnamePOM(WebDriver driver)
    {
        return driver.findElement(By.name("customer[first_name]"));
    }

    public WebElement lastnamePOM(WebDriver driver)
    {
        return driver.findElement(By.name("customer[last_name]"));
    }
    public WebElement emailPOM(WebDriver driver)
    {
        return driver.findElement(By.name("customer[email]"));
    }

    public WebElement passwordPOM(WebDriver driver)
    {
        return driver.findElement(By.name("customer[password]"));
    }
    public void SignupSteps(WebDriver driver, String firstname , String lastname ,String email , String password)
    {
        firstnamePOM(driver).clear();
        firstnamePOM(driver).sendKeys(firstname);
        lastnamePOM(driver).sendKeys(lastname);
        emailPOM(driver).sendKeys(email);
        passwordPOM(driver).sendKeys(password);
        passwordPOM(driver).sendKeys(Keys.ENTER);

    }
}
