import org.openqa.selenium.By;

public class BlogPage {
    public By blogPOM()
    {
        return By.cssSelector("a[href=\"/blogs/news\"]");
    }
}
