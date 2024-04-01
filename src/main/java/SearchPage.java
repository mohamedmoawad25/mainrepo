import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public WebElement searchPOM(WebDriver driver) {
        return driver.findElement(By.id("search-field"));
    }
public WebElement productPOM(WebDriver driver){
        return driver.findElement(By.id("product-2"));
}
    public WebElement checkoutPOM(WebDriver driver){
        return driver.findElement(By.className("checkout") );
    }
    public WebElement cardPOM(WebDriver driver){
        return driver.findElement(By.id("add"));
    }
    public void searchSteps(WebDriver driver, String nameproduct) {
        searchPOM(driver).clear();
        searchPOM(driver).sendKeys(nameproduct);

        searchPOM(driver).sendKeys(Keys.ENTER);
    }
}
