Feature: Test Automation Web

  @web
  Scenario: Test login web
    Given open web login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    Then user will see icon cart in homepage

  @web
  Scenario: Test login web with Lock User
    Given open web login page
    When user input username "locked_out_user"
    And user input password "secret_sauce"
    And user click button login
    Then user will see error message "user has been locked out"

  @web
  Scenario: Test login web with invalid password
    Given open web login page
    When user input username "locked_out_user"
    And user input password "secret_xauce"
    And user click button login
    Then user will see error message "Username and password do not match"

  @web
  Scenario: Test login web then Add to Cart
    Given open web login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"

  @web
  Scenario: Test login web then Remove Cart
    Given open web login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "4"
    And user remove item to cart
    And user remove item to cart
    Then verify cart item is match "2"

  @web
  Scenario: User go to Checkout
    Given open web login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    And user add item to cart
    And verify cart item is match "4"
    Then click icon Cart to Your Cart apge
    Then click Checkout button

  @web
  Scenario: User checkout items then input data to verify error message
    Given open web login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And verify cart item is match "2"
    Then click Checkout button
    And click Continue button
    Then appear error message "Frist Name is required"
    And input text First Name column
    And click Continue button
    Then  appear error message "Last Name is required"
    And input text Last Name column
    Then click Continue button
    Then  appear error message "Postal Code is required"

  @web
  Scenario: User checkout items, input data, and finish process
    Given open web login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click button login
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And verify cart item is match "2"
    Then click icon Cart to Your Cart apge
    And remove item from Your Cart page
    And verify cart item is match "1"
    Then click Checkout button
    And verify cart item is match "1"
    And input text First Name column
    And input text Last Name column
    And input number Zip Postal Code column
    And click Continue button
    Then click Finish button
