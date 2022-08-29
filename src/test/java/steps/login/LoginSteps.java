package steps.login;

import helpers.AssertsHelpers;
import io.cucumber.java.en.Given;
import pom.home.HomePage;
import pom.login.LoginPage;
import steps.BaseSteps;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage = new LoginPage(driver);
    private final HomePage homePage = new HomePage(driver);


    @Given("the user is already registered to the Goalsetter APP {string} y {string}")

    public void validate_login_success(String user, String password) {

        //Tab en boton login
        loginPage.click(loginPage.btnLOGIN);

        //Tab en Login with email
        loginPage.click(loginPage.btn_email);

        //Imput mail
        loginPage.sendKey(loginPage.inputEmail, user);

        //Imput password
        loginPage.sendKey(loginPage.inputPassword, password);

        //click Button LOGIN
        loginPage.click(loginPage.BtnIngresar);
    }
    @Given("I am logged in as a site owner {string}")

    public void validate_header(String Welcome) {
        //Validar que estamos en la home
        AssertsHelpers.exist(driver, homePage.TEXT_welcome);

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Given("I am on homepage")
        public void login_success() {
        System.out.println("======> I am in homepage");
        }

}




