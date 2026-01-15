package hooks;

import io.cucumber.java.*;
import utilities.*;

public class Hooks {

    @Before
    public void setup() {
        DriverFactory.initDriver();
        LoggerHelper.getLogger().info("Browser started");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(DriverFactory.getDriver(), scenario.getName());
        }
        DriverFactory.getDriver().quit();
    }
}
