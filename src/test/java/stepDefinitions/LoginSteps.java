package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    private WebDriver driver;
    @Given("the user is on the login page of the Para Bank application")
    public void the_user_is_on_the_login_page_of_the_para_bank_application() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("the user enters the credentials")
    public void the_user_enters_the_credentials() {
        driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("jmalik");

        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("jmalik");

    }
    @And("the user logs in")
    public void the_user_logs_in() {
        driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
    }
    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {

    }
}
