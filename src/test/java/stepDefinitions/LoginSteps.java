package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base){
        this.base=base;
    }

    public WebDriver getDriver() {
        return base.Driver;
    }

    @Given("the user is on the login page of the Para Bank application")
    public void the_user_is_on_the_login_page_of_the_para_bank_application() {
        LoginPage loginPage=new LoginPage(base.Driver);
        loginPage.loadURL();


    }
    @When("the user enters the credentials")
    public void the_user_enters_the_credentials() {
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.login(base.username,base.password);

    }
    @And("the user logs in")
    public void the_user_logs_in() {
        LoginPage loginPage=new LoginPage(base.Driver);
        loginPage.clickLogin();

    }
    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {

    }
}
