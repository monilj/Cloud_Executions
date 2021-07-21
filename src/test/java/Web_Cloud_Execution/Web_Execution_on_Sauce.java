package Web_Cloud_Execution;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Web_Execution_on_Sauce {
    public static final String USERNAME = "user_name";
    public static final String ACCESS_KEY = "access_key";
    public static final String Exe_URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    @Test
    public void sampleSauce() throws MalformedURLException {
        MutableCapabilities sauceOptions = new MutableCapabilities();
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "91.0");
        browserOptions.setCapability("sauce:options", sauceOptions);
        WebDriver driver = new RemoteWebDriver(new URL(Exe_URL), browserOptions);
    }
}
