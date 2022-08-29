package pom.home;

import org.openqa.selenium.WebDriver;
import pom.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class ContainerPage extends BasePage {
    public ContainerPage(WebDriver driver){ super(driver); }

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"TEXT-Kidundefined\"])[2]")
    public MobileElement Text_name;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BTN-SAVINGS\"]/android.widget.TextView[1]")
    public MobileElement btn_savings;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"TEXT-Germancito's Savings\"]")
    public MobileElement Txt_Header_savings;

}
