package util;
import org.junit.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ActualizacionWebDriver {
    @Before
    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().forceDownload();
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
            case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;

        }
    }
}
