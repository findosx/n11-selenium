import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By productLikeLocator = new By.ByCssSelector("i[class='fa fa-heart-o']");
    By productNameLocator = new By.ByCssSelector("a[class='title-link']");
    By deleteToCartLocator = new By.ByCssSelector("a[title='Sil']");
    By deleteCompLocator = new By.ByCssSelector("span[class='removeProd svgIcon svgIcon_trash']");

    By productPriceLocator = new By.ByXPath("//*[@id=\"unf-p-id\"]/div/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/ins");
    By productInCartPriceLocator = new By.ByCssSelector("span[class='price']");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isEmpty() {
        return isDisplayed(productLikeLocator);
    }

    public void deleteToCart() throws InterruptedException {
        Thread.sleep(800);
        click(deleteToCartLocator);
        Thread.sleep(800);
        click(deleteCompLocator);
        Thread.sleep(800);
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }

}
