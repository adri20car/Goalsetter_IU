package steps.wallet;

import helpers.AssertsHelpers;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import pom.wallet.WalletPage;
import steps.BaseSteps;

public class WalletSteps extends BaseSteps {

    WalletPage WalletPage = new WalletPage(this.driver);


    @Then("I enter my wallet")

    public void Validate_Wallet() {

        // VALIDO EL HEADER
        String texto = "My Wallet";
        MobileElement labelTITULO = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]");

        System.out.println(labelTITULO.getText());
        String tf = labelTITULO.getText();

        if (tf.equals(texto)) {
            System.out.println("VALIDATE HEADER WALLET OK");
        } else {
            System.out.println("ERROR IN HEADER");
        }

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // VALIDO EL AMOUNT
        String texto2 = "$25";
        MobileElement LabelAmount = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[3]");

        //System.out.println(LabelAmount.getText());
        String amount = LabelAmount.getText();

        if (amount.equals(texto2)) {
            System.out.println("VALIDATE AMOUNT OK");
        } else {
            System.out.println("ERROR IN AMOUNT");
        }

        // Back to Home
        AssertsHelpers.exist(driver, WalletPage.Icon_Home);
        WalletPage.click(WalletPage.Icon_Home);
        System.out.println("======>REGRESO AL HOME");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}