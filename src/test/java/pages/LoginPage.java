package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    BaseUtil base= new BaseUtil();
    WebDriver driver;
    public LoginPage(WebDriver driver){

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
    public void loadURL(){
        driver.get(base.getBaseURL());

    }
    //TO ADD THE USERNAME AND PASSWORD
    public void login(String username, String password){
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
    }
    //TO CLICK THE LOGIN BUTTON
    public void clickLogin(){
        btnLogIn.submit();
    }

}
