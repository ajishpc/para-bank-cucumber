package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base=base;
    }

    @Before
    public void initializeTest(Scenario scenario){
        base.initializeBrowser();
    }
    @After
    public void tearDownTest(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }
        System.out.println("Closing the browser");
        base.getDriver().quit();
    }
}
