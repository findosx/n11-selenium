import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void logIn(String id, String pass) throws InterruptedException {


        By accountName = By.id("email");
        Thread.sleep(700);
        click(accountName);
        Thread.sleep(700);
        sendText(accountName,"ozdemirenes834@gmail.com");

        By password = By.id("password");
        Thread.sleep(700);
        click(password);
        Thread.sleep(700);
        sendText(password,"taksici99");

        By logIn = By.id("loginButton");
        Thread.sleep(700);
        click(logIn);
        Thread.sleep(700);

    }
}
