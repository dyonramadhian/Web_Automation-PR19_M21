package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import static helper.Utility.driver;

public class WebPage {
    By input_username = By.id("user-name");
    By input_password = By.id("password");
    By btn_login = By.id("login-button");

//    By errorMessage = By.xpath("h3[data-test='error']");
//    By errorMsg = By.cssSelector("[data-test='error']");
    By err_msg(String msg){
        return By.xpath("//*[contains(text(), '"+msg+"')]");
    }

    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    By addToCart = By.xpath("(//*[text()='Add to cart'])[1]");
    By icon_cart_badge = By.xpath("//span[@class='shopping_cart_badge']");
    By removeToCart = By.xpath("//div[@class='inventory_item']//button[contains(text(),'Remove')][1]");

    By removeItemCart = By.xpath("//div[@class='cart_item']//button[text()='Remove'][1]");
    By checkoutButton = By.id("checkout");

    By clmnFirstName = By.id("first-name");
    By clmnLastName = By.id("last-name");
    By clmnZipPostName = By.id("postal-code");
    By continue_button = By.id("continue");
    By errorIsRequired(String errMsg){
        return By.xpath("//h3[contains(text(), '"+errMsg+"')]");
    }
    //h3[contains(text(), "is required")]
    By Finish_Button = By.id("finish");

    public void inputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(input_password).sendKeys(password);
    }

    public void clickBtnLogin(){
        driver.findElement(btn_login).click();
    }

    public void assertHomePage(){
        driver.findElement(icon_cart).isDisplayed();
    }

    public void assertErrorMessage(String msg){
        driver.findElement(err_msg(msg)).isDisplayed();
    }

    public void clickAddToCart(){
        driver.findElement(addToCart).click();
    }

    public void clickRemoveToCart(){
        driver.findElement(removeToCart).click();
    }

    public void asserNumbertCartItem(String cartBadge){
        String itemExpected = cartBadge;
        String itemActual = driver.findElement(icon_cart_badge).getText();
        Assertions.assertThat(itemExpected).isEqualTo(cartBadge);
    }

    public void clickIconCart(){
        driver.findElement(icon_cart).click();
    }

    public void clickRemoveItemCart(){
        driver.findElement(removeItemCart);
    }

    public void clickCheckoutBtn() {
        driver.findElement(checkoutButton).isEnabled();
        driver.findElement(checkoutButton).click();
    }

    public void inputTextFirstName() {
        driver.findElement(clmnFirstName).clear();
        driver.findElement(clmnFirstName).sendKeys("Dion");
    }
    public void inputTextLastName() {
        driver.findElement(clmnLastName).clear();
        driver.findElement(clmnLastName).sendKeys("Ramadhian");
    }
    public void inputNumberZipPostCode() {
        driver.findElement(clmnZipPostName).clear();
        driver.findElement(clmnZipPostName).sendKeys("40175");
    }
    public void clickContinueButton() {
        driver.findElement(continue_button).click();
    }
    public void errmsgIsRequired(String errMsg) {
        driver.findElement(errorIsRequired(errMsg));
    }
    public void clickFinishBtn(){
        driver.findElement(Finish_Button).click();
    }
}

