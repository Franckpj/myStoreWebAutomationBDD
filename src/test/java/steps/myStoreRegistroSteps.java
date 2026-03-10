package steps;

import page.myStoresRegistroPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static core.DriveManager.*;

public class myStoreRegistroSteps {
    private WebDriver driver;
    public myStoreRegistroSteps(WebDriver driver){this.driver=driver;}

    public void digitarNombre(String nombre){
        WebElement escriboNombre = driver.findElement(myStoresRegistroPage.nombreInput);
        escriboNombre.sendKeys(nombre);

    }

    public void digitarApellido(String apellido){
        WebElement escriboApellido = driver.findElement(myStoresRegistroPage.apellidosInput);
        escriboApellido.sendKeys(apellido);

    }

    public void digitarCorreo(String correo){
        WebElement escriboCorreo = driver.findElement(myStoresRegistroPage.correoInput);
        escriboCorreo.sendKeys(correo);

    }

    public void digitarContrasenia(String contrasenia){
        //WebElement escriboContrasenia = driver.findElement(myStoresRegistroPage.contraseniaInput);
        //escriboContrasenia.sendKeys(contrasenia);
        this.driver.findElement(myStoresRegistroPage.contraseniaInput).sendKeys(contrasenia);

    }

    public void clickOpciones(){
        WebElement terminosCondicionesCheck = driver.findElement(myStoresRegistroPage.terminosCondicionesCheckbox);
        terminosCondicionesCheck.click();
        WebElement privacidadDatosCheck = driver.findElement(myStoresRegistroPage.privacidadCheckbox);
        privacidadDatosCheck.click();

    }

    public void clickGuardar(){
        WebElement botonGuardar = driver.findElement(myStoresRegistroPage.guardarBoton);
        botonGuardar.click();
    }

    public void completarDatosUsuario(String nombre, String apellido, String correo, String contrasenia){
        digitarNombre(nombre);
        digitarApellido(apellido);
        digitarCorreo(correo);
        digitarContrasenia(contrasenia);
        clickOpciones();
        clickGuardar();
    }




}
