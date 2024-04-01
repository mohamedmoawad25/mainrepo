import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    public WebElement checkOutUpPOM(WebDriver driver)
    {
        return driver.findElement(By.className("checkout"));
    }
    public WebElement checkOutDownPOM(WebDriver driver)
    {
        return driver.findElement(By.name("checkout"));
    }

    public WebElement firstnamePOM(WebDriver driver)
    {

        return driver.findElement(By.id("TextField0"));
    }
    public WebElement lastnamePOM(WebDriver driver)
    {

        return driver.findElement(By.id("TextField1"));
    }
    public WebElement addressPOM(WebDriver driver)
    {

        return driver.findElement(By.id("TextField3"));
    }
    public WebElement cityPOM(WebDriver driver)
    {

        return driver.findElement(By.id("TextField4"));
    }
    public WebElement postalPOM(WebDriver driver)
    {

        return driver.findElement(By.id("TextField5"));
    }
    public WebElement phonePOM(WebDriver driver)
    {

        return driver.findElement(By.id("TextField6"));
    }
    /*public WebElement countryPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Select0"));
    }*/
    public WebElement governPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Select1"));
    }
    public WebElement cardnumberPOM(WebDriver driver)
    {

        return driver.findElement(By.id("number"));
    }
    public WebElement expirydatePOM(WebDriver driver)
    {

        return driver.findElement(By.id("expiry"));
    }
    public WebElement securitycodePOM(WebDriver driver)
    {

        return driver.findElement(By.id("verification_value"));
    }
    public WebElement paynowPOM(WebDriver driver)
    {

        return driver.findElement(By.className("_1fragemk9"));
    }

    public void CheckSteps(WebDriver driver, String firstname , String lastname ,String address , String city ,
                           String postal , String phone
            , String cardnumber, String expirydate, String securitycode  , String govern)
    {
        firstnamePOM(driver).clear();
        firstnamePOM(driver).sendKeys(firstname);
        lastnamePOM(driver).clear();
        lastnamePOM(driver).sendKeys(lastname);
        addressPOM(driver).sendKeys(address);
        cityPOM(driver).sendKeys(city);
        postalPOM(driver).sendKeys(postal);
        phonePOM(driver).sendKeys(phone);
       // countryPOM(driver).sendKeys(country);
        governPOM(driver).click();
        governPOM(driver).sendKeys(govern);
       governPOM(driver).sendKeys(Keys.ENTER);
        cardnumberPOM(driver).sendKeys(cardnumber);
        expirydatePOM(driver).click();
        expirydatePOM(driver).sendKeys(expirydate);
        securitycodePOM(driver).click();
        securitycodePOM(driver).sendKeys(securitycode);

        paynowPOM(driver).click();
    }
}
