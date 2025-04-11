package StepDef;

import helper.PageChecker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

import static helper.Utility.driver;

public class WebStepDef {

    WebPage webPage = new WebPage();

    @Given("open web login page")
    public void openWebLoginPage() {
    }
    @When("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }
    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.inputPassword(password);
    }
    @And("user click button login")
    public void userClickButtonLogin() {
        webPage.clickBtnLogin();
    }
    @Then("user will see icon cart in homepage")
    public void userWillSeeIconCartInHomepage() {
        webPage.assertHomePage();
    }

// Scenario 2 & 3 (locked out user_error message)
    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String msg) {
        webPage.assertErrorMessage(msg);
    }

    @And("user add item to cart")
    public void userAddToCart() {
        webPage.clickAddToCart();
    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartBadge) {
        webPage.asserNumbertCartItem(cartBadge);
    }

    @And("user remove item to cart")
    public void userRemoveItemToCart() {
        webPage.clickRemoveToCart();
    }

    @Then("click icon Cart to Your Cart apge")
    public void clickIconCartToYourCartApge() {
        webPage.clickIconCart();
    }

    @Then("remove item from Your Cart page")
    public void removeItemFromYourCartPage() {
        webPage.clickRemoveItemCart();
    }

    @Then("click Checkout button")
    public void clickCheckoutButton() {
        webPage.clickCheckoutBtn();
    }

    @And("input text First Name column")
    public void inputTextFirstNameColumn() {
        webPage.inputTextFirstName();
    }
    @And("input text Last Name column")
    public void inputTextLastNameColumn() {
        webPage.inputTextLastName();
    }
    @And("input number Zip Postal Code column")
    public void inputNumberZipPostalCodeColumn() {
        webPage.inputNumberZipPostCode();
    }
    @Then("click Continue button")
    public void clickContinueButton() {
        webPage.clickContinueButton();
    }

    @Then("appear error message {string}")
    public void appearErrorMessage(String errMsg) {
        webPage.errmsgIsRequired(errMsg);
    }

    @Then("click Finish button")
    public void clickFinishButton() {
        webPage.clickFinishBtn();
    }
}
