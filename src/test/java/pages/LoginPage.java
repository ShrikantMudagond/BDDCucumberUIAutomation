package pages;

import org.openqa.selenium.*;
import utilities.DriverFactory;

public class LoginPage {

    WebDriver driver = DriverFactory.getDriver();

    By username = By.id("username");
    By password = By.id("password");
    By submit = By.id("submit");

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(submit).click();
    }
}
