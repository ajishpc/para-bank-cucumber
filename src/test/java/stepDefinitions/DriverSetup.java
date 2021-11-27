package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup extends BaseUtil {

    private BaseUtil base;

    public DriverSetup(BaseUtil base){
        this.base=base;
    }

    public WebDriver getDriver(){
        return base.Driver;
    }
    @Before
    public void InitializeTest(Scenario scenario){

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        base.Driver=new ChromeDriver(chromeOptions);
    }
    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");
        base.Driver.quit();
    }

}
