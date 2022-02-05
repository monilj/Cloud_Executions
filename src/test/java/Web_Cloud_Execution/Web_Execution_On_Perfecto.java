package Web_Cloud_Execution;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Web_Execution_On_Perfecto {
    public static final String perfecto_URL = "https://trial.perfectomobile.com/nexperience/perfectomobile/wd/hub";
    public static final String perfecto_Token= "access_token";
@Test
    public void perfectoCaps() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities("", "", Platform.ANY);
    capabilities.setCapability("securityToken",perfecto_Token);
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "9");
    capabilities.setCapability("location", "NA-US-BOS");
    capabilities.setCapability("resolution", "1440x3040");
    capabilities.setCapability("manufacturer", "Samsung");
    capabilities.setCapability("model", "Galaxy S10\\+");
    capabilities.setCapability("app","PRIVATE:Learn_Android_With_Source_Code.apk");
    WebDriver driver;
    driver= new RemoteWebDriver(new URL(perfecto_URL),capabilities);
}

}
