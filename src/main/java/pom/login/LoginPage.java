package pom.login;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){

        super(driver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BTN-Login\"]")
    public MobileElement btnLOGIN;

    //tab en Login with email
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BUTTON_EMAIL\"]")
    public MobileElement btn_email;

    //Input Correo electronico
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"TEXT-InputEmail\"]")
    public MobileElement inputEmail;

    //Input Contraseña
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"TEXT-InputPassword\"]")
    public MobileElement inputPassword;

    //Button Login
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BTN-Login\"]")
    public MobileElement BtnIngresar;

    }


