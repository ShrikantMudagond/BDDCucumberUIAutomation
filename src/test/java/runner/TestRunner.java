package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"stepdefinitions","hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
monochrome=true
)
public class TestRunner {
}
