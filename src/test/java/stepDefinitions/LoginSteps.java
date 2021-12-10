package stepDefinitions;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;
    private LoginPage loginPage;

    public LoginSteps(BaseUtil base) throws FileNotFoundException {
        this.base=base;
        this.loginPage=new LoginPage(getDriver());
    }

    public WebDriver getDriver() {
        return base.getDriver();
    }
    @Given("the user is on the login page of the Para Bank application")
    public void the_user_is_on_the_login_page_of_the_para_bank_application() throws IOException, InterruptedException {
        loginPage.loadURL();
    }
    @When("the user enters the credentials")
    public void the_user_enters_the_credentials() throws IOException {
        loginPage.addUsernameAndPassword();
    }
    @And("the user logs in")
    public void the_user_logs_in() {
        loginPage.clickLogin();
    }
    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {

    }
}
