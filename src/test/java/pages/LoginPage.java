package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class LoginPage{

    BaseUtil base= new BaseUtil();
    WebDriver driver;
    public LoginPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(how= How.NAME,using="username")
    public WebElement txtUserName;

    @FindBy(how=How.NAME,using="password")
    public WebElement txtPassword;

    @FindBy(how=How.XPATH,using="//*[@value=\"Log In\"]")
    public WebElement btnLogIn;

    //TO LOAD THE URL OF THE WEBSITE
    public void loadURL() throws IOException, InterruptedException {
        System.out.println("I AM HERE -----BEFORE GETTING THE URL");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(base.getBaseURL());
        driver.manage().window().maximize();
        Thread.sleep(2000);//FOR DEMO PURPOSE ONLY

    }
    //TO ADD THE USERNAME AND PASSWORD
    public void addUsernameAndPassword() throws IOException {
        txtUserName.sendKeys(base.getUsername());
        txtPassword.sendKeys(base.getPassword());
    }
    //TO CLICK THE LOGIN BUTTON
    public void clickLogin(){
        btnLogIn.submit();
    }

}
