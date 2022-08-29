package pom.home;

import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){ super(driver); }

//Welcome text
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"TEXT-Welcome\"]")
    public MobileElement TEXT_welcome;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"IMAGE-Wallet\"]")
    public MobileElement Icon_Wallet;


}