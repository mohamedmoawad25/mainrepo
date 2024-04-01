import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    public WebElement cartPOM(WebDriver driver) {
        return driver.findElement(By.linkText("My Cart"));
    }
    public WebElement cartcheckoutPOM(WebDriver driver) {
        return driver.findElement(By.linkText("Check Out"));
    }
}
