package base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
public class BaseUtil {

    public static WebDriver Driver;
    public ExtentReports extent;


    public static ExtentTest scenarioDef;

    public static ExtentTest features;
    public static String username="jmalik";
    public static String password="jmalik";

    public static String reportLocation = "user.dir";
    public static String baseURL ="https://parabank.parasoft.com/parabank/index.htm";

    public String getBaseURL(){return baseURL;}


}
