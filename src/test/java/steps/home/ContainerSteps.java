package steps.home;

import helpers.AssertsHelpers;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.home.ContainerPage;
import steps.BaseSteps;

public class ContainerSteps extends BaseSteps {

    ContainerPage containerPage = new ContainerPage(this.driver);

    //Validar firts child
    @And("I want to verify the first child")

    public void validate_firstchild() {
        //Validar que estamos en la home
        AssertsHelpers.exist(driver, containerPage.Text_name);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //android.view.ViewGroup[@content-desc="BTN-INVESTMENT"]/android.widget.TextView

    // Scroll down
    @And("I scroll down to the second container")
    public void scrolldown() {

        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ALLOWANCE\"));");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ALLOWANCE\").instance(0))");
        System.out.println("Scroll down successful");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @When("I click on tab savings")

    public void onclickinsavings() {

        containerPage.click(containerPage.btn_savings);
        System.out.println("======>Direct to a page Savings successful");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I verify that the name is {string}")

    public void validate_header(String name) {

        //Validate EL Header savings
        String header = name;
        MobileElement LabelHeader_savings = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"TEXT-Germancito's Savings\"]");

        //System.out.println(LabelAmount.getText());
        String header_savings = LabelHeader_savings.getText();

        if (header_savings.equals(header)) {
            System.out.println("Validate header OK");
        } else {
            System.out.println("Error in text  header savings ");
        }

    }
}