package steps;
import org.openqa.selenium.By;
import page.myStoresRegistroPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static core.DriveManager.*;

public class myStoresSucessSteps {
    private WebDriver driver;
    public myStoresSucessSteps(WebDriver driver){this.driver=driver;}

    public String obtenerUsuario(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //WebElement usuarioObtenido = driver.findElement(By.cssSelector("#_desktop_user_info span"));

        WebElement usuarioObtenido = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("#_desktop_user_info span")
                )
        );
        return usuarioObtenido.getText();

    }
}
