package stepsdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

import steps.myStoreRegistroSteps;
import steps.myStoreLoginSteps;
import steps.myStoreHomeSteps;
import steps.myStoresSucessSteps;
import static core.DriveManager.*;

public class registroNuevoUsuarioStepDef {
    private WebDriver driver;
    private myStoreHomeSteps MyStoreHomeSteps(WebDriver driver){return new myStoreHomeSteps(driver);}
    private myStoreLoginSteps MyStoreLoginSteps(WebDriver driver){return new myStoreLoginSteps(driver);}
    private myStoreRegistroSteps MyStoreRegistroSteps(WebDriver driver){return new myStoreRegistroSteps(driver);}
    String nombreN;
    String apellidoA;

    @Given("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda(){
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        screenShot();
    }

    @When("doy click en la opción iniciar sesión")
    public void doy_click_en_la_opción_iniciar_sesión(){
        myStoreHomeSteps MyStoreHomeSteps = new myStoreHomeSteps(driver);
        MyStoreHomeSteps.optionLogInClick();
        screenShot();

    }

    @And("doy click en el link text cree una cuenta aquí")
    public void doy_click_en_el_link_text_cree_una_cuenta_aquí(){
        myStoreLoginSteps MyStoreLoginSteps = new myStoreLoginSteps(driver);
        MyStoreLoginSteps.optionCreateUserClick();
        screenShot();
    }

    @And("lleno los campos {string}, {string}, {string}, {string} del formulario para el registro")
    public void lleno_los_campos_del_formulario_para_el_registro(String nombre, String apellido, String correo, String contrasenia){
        myStoreRegistroSteps MyStoreRegistroSteps = new myStoreRegistroSteps(driver);
        nombreN=nombre;
        apellidoA=apellido;
        MyStoreRegistroSteps.digitarNombre(nombre);
        MyStoreRegistroSteps.digitarApellido(apellido);
        MyStoreRegistroSteps.digitarCorreo(correo);
        MyStoreRegistroSteps.digitarContrasenia(contrasenia);
        screenShot();
        MyStoreRegistroSteps.clickOpciones();
        screenShot();

    }

    @And("doy click en el botón guardar")
    public void doy_click_en_el_botón_guardar(){
        myStoreRegistroSteps MyStoreRegistroSteps = new myStoreRegistroSteps(driver);
        MyStoreRegistroSteps.clickGuardar();
        screenShot();
    }

    @Then("debería visualizar mi usuario logeado en la pantalla")
    public void debería_visualizar_mi_usuario_logeado_en_la_pantalla(){
        myStoresSucessSteps MyStoresSucessSteps = new myStoresSucessSteps(driver);
        String usuarioActual = MyStoresSucessSteps.obtenerUsuario();
        String usuarioEsperado = nombreN + " " + apellidoA;
        Assert.assertEquals(usuarioActual.trim(), usuarioEsperado.trim());
    }
}
