import org.openqa.selenium.By;

public class CatalogPage {
    public By catalogPOM()
    {
        return By.cssSelector("a[href=\"/collections/all\"]");
    }
}
