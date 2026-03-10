package steps;
import page.myStoreLoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static core.DriveManager.*;

public class myStoreLoginSteps {
    private WebDriver driver;

    public myStoreLoginSteps(WebDriver driver){this.driver=driver;}

    public void optionCreateUserClick(){
        this.driver.findElement(myStoreLoginPage.createAccountButton).click();
    }
}
