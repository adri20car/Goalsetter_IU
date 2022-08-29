import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

import static com.cucumber.listener.Reporter.loadXMLConfig;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = { "classpath:steps"},
        tags = {"@ANDROID"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html "}

)


public class TestRunner {
    @AfterClass
    public static void setup()
    {
        loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//      Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
        Reporter.setSystemInfo("User Name", "AJ");
        Reporter.setSystemInfo("Application Name", "Test App ");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }
}