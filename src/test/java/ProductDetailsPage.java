import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage{

    By addToCartLocator = new By.ByXPath("//*[@id=\"unf-p-id\"]/div/div[4]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/a");
    By productSizeLocator = new By.ByCssSelector("span[class='spinnerUp spinnerArrow']");
    By goToCartLocator = new By.ByXPath("//*[@id=\"js-goToPaymentBtn\"]");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailsPage() {
        return isDisplayed(addToCartLocator);
    }

    public void addToCart() throws InterruptedException {
        click(productSizeLocator);
        Thread.sleep(800);
        click(addToCartLocator);
        Thread.sleep(800);
        click(goToCartLocator);
        Thread.sleep(800);
    }
}
