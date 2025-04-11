package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Utility {

    // Open Google Chrome
    public static WebDriver driver;

    public static void startDriver() {

        ChromeOptions options = new ChromeOptions();
        options.setCapability(
                CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR,
                UnexpectedAlertBehaviour.DISMISS);
        options.addArguments("--disable-notifications"); // Nonaktifkan notifikasi browser
        // Matikan password manager dan credential service
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.saucedemo.com/");
    }

        public static void quitDriver() {
            driver.quit();
        }

}

