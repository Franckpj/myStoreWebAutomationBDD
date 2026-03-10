package page;
import org.openqa.selenium.By;
public class myStoresRegistroPage {

    //public static By tratamientoSrRadioButton = By.id("field-id_gender-1");
    //public static By tratamientoSraRadioButton = By.id("field-id_gender-2");
    public static By nombreInput = By.id("field-firstname");
    public static By apellidosInput = By.id("field-lastname");
    public static By correoInput = By.id("field-email");
    public static By contraseniaInput = By.id("field-password");
    public static By terminosCondicionesCheckbox = By.name("psgdpr");
    public static By privacidadCheckbox = By.name("customer_privacy");
    public static By guardarBoton = By.xpath("//*[@id=\"customer-form\"]/footer/button");
}
