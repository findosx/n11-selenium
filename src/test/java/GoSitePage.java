import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoSitePage extends BasePage{
    public GoSitePage(WebDriver driver) {
        super(driver);
    }

    By closePop = new By.ByCssSelector("span[class='seg-popup-close']");
    //By closePop = new By.ByXPath("/html/body/div[2]/span");
    By logInLocator = new By.ByClassName("btnSignIn");
    //By closePop = new By.ByCssSelector("p[class='cookie__dismiss']");



    public void goSite() throws InterruptedException {

        Thread.sleep(2000);
        click(closePop);
        Thread.sleep(1000);
        click(logInLocator);
        Thread.sleep(800);
    }
}
