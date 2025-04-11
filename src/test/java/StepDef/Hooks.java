package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import static helper.Utility.*;


public class Hooks {
    @BeforeAll
    public static void setup() {
    }

    @AfterAll
    public static void tearDown() {
    }

    @Before
    public static void beforeTest() {
        startDriver();
//        driver.get("https://www.saucedemo.com/");
//        try {
//            Alert alert = driver.switchTo().alert();
//            alert.dismiss(); // atau alert.accept() jika perlu klik OK
//        } catch (NoAlertPresentException e) {
//            System.out.println("Tidak ada alert yang muncul");
//        }
    }

    @After
    public static void afterTest() {
        quitDriver();
    }
}
