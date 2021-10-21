import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By viewButtonLocator = new By.ByXPath("//*[@id=\"contentListing\"]/div/div/div[2]/section[2]/div[1]/div[3]/h1");
    By productNameLocator = new By.ByClassName("columnContent ");
    By otherPageLocator = new By.ByClassName("next navigation");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(viewButtonLocator);
    }

    public void otherProductList() throws InterruptedException {
       click(otherPageLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
