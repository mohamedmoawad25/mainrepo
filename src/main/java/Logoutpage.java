import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logoutpage {
    public WebElement logoutPOM(WebDriver driver)
    {
        return driver.findElement(By.id("customer_logout_link"));
    }


}
