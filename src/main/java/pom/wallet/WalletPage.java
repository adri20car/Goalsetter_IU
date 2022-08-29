
package pom.wallet;

        import io.appium.java_client.MobileElement;
        import io.appium.java_client.pagefactory.AndroidFindBy;
        import org.openqa.selenium.WebDriver;
        import pom.BasePage;

public class WalletPage extends BasePage {

    public WalletPage(WebDriver driver) {
        super(driver);
    }

    //Text My Wallet
    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement Text_Wallet;

    //Text Amount
    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[3]")
    public MobileElement text_mount;

    //Icon home menu inferior
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"IMAGE-Dashboard\"]")
    public MobileElement Icon_Home;


}
