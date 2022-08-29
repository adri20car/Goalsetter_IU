package steps.home;


import helpers.AssertsHelpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pom.home.HomePage;
import steps.BaseSteps;


public class HomeSteps extends BaseSteps {

    HomePage homepage = new HomePage(this.driver);

    @And("I want to check the balance of my wallet")
    public void validate_login_success(){
        //Valido en homepage header
        AssertsHelpers.exist(driver, homepage.TEXT_welcome);

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("I click the image of the wallet in the lower menu")
    public void click_wallet(){
        //Wallet
        homepage.click(homepage.Icon_Wallet);
        System.out.println("======>INGRESE A MI WALLET");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
