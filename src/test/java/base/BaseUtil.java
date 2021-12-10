package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.*;
import java.util.Properties;

public class BaseUtil {

    public static WebDriver driver;
    public Properties prop;
    public File configFile;
    public InputStream stream;

    public void initializeBrowser(){
        final WebDriver driver;
        // INITIALIZE THE DRIVER
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        WebDriverManager.chromedriver().setup();
        System.out.println("I AM HERE -----BEFORE DRIVER IS CREATED");

        driver = new ChromeDriver(chromeOptions);

        System.out.println("THIS IS THE ORIGINAL DRIVER -----DRIVER IS CREATED"+ driver);
        setDriver(driver);
        System.out.println("I AM HERE -----SET DRIVER IS CALLED");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        System.out.println("THIS IS THE DRIVER SET"+ this.driver);
    }

    public String getBaseURL() throws IOException {
        prop = new Properties();
        configFile=new File("config.properties");
        stream=new FileInputStream(configFile);
        prop.load(stream);
        return (prop.getProperty("baseURL"));
    }
    public String getUsername() throws IOException {
        prop = new Properties();
        configFile=new File("config.properties");
        stream=new FileInputStream(configFile);
        prop.load(stream);
        return (prop.getProperty("username"));
    }

    //GET THE PASSWORD FROM CONFIG FILE
    public String getPassword() throws IOException {
        prop = new Properties();
        configFile=new File("config.properties");
        stream=new FileInputStream(configFile);
        prop.load(stream);
        return (prop.getProperty("password"));
    }
}
