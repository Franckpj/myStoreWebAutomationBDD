package steps;

import page.myStoresHomePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static core.DriveManager.*;

public class myStoreHomeSteps {
    private WebDriver driver;

    public myStoreHomeSteps(WebDriver driver){this.driver=driver;}

    public void optionLogInClick(){
        this.driver.findElement(myStoresHomePage.loginButton).click();
    }

}
