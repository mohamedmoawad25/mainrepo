import org.openqa.selenium.By;

public class WishListPage {
    public By wishPOM()
    {
        return By.cssSelector("a[href=\"#sauce-show-wish-list\"]");
    }
}
