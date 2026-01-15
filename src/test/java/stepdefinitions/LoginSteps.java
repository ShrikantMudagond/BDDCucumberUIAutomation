package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.*;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @Given("User is on login page")
    public void openLoginPage() {
        DriverFactory.getDriver().get(ConfigReader.getProperties().getProperty("url"));
    }

    @When("User logs in")
    public void userLogsIn() {
        login.login(
                ConfigReader.getProperties().getProperty("username"),
                ConfigReader.getProperties().getProperty("password")
        );
    }

    @Then("User should be logged in")
    public void verifyLogin() {
        LoggerHelper.getLogger().info("Login Successful");
    }
}
