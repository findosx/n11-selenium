import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("searchData");
    By searchButtonLocator = new By.ByXPath("//*[@id=\"header\"]/div/div/div[2]/div[1]/div/a");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) throws InterruptedException {
        click(searchBoxLocator);
        sendText(searchBoxLocator, text);
        click(searchButtonLocator);
    }
}
