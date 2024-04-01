import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebElement loginPOM(WebDriver driver)
    {
        return driver.findElement(By.id("customer_login_link"));
    }
    public WebElement emailPOM(WebDriver driver)
    {
        return driver.findElement(By.id("customer_email"));
    }

    public WebElement passwordPOM(WebDriver driver)
    {
        return driver.findElement(By.id("customer_password"));
    }
    public By errorPOM()
    {

        return By.name("errors");
    }
    /*public By logoutPOM()
    {
        return By.cssSelector("a[href=\"/logout\"]");
    }*/

    public void LoginSteps(WebDriver driver, String email , String password)
    {
       // emailPOM(driver).clear();
        emailPOM(driver).sendKeys(email);
        passwordPOM(driver).sendKeys(password);
        passwordPOM(driver).sendKeys(Keys.ENTER);
    }
}
