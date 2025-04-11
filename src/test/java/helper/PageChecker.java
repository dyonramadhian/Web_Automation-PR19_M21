package helper;

import org.openqa.selenium.WebDriver;

public class PageChecker {
    public static String getCurrentPage(WebDriver driver) {
        String url = driver.getCurrentUrl();
        if (url.contains("inventory.html")) {
            return "inventory";
        } else if (url.contains("cart.html")) {
            return "cart";
        } else {
            return "unknown";
        }
    }
}
