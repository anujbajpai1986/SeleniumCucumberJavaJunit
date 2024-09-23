@LoginTest
Feature: Login Functionality

  @LoginPositiveTest
  Scenario Outline: User login with valid credentials
    Given user visits the websites
    When user enter username "<username>" and password "<password>"
    Then user can view the product page
    And browser closes
    Examples:
| username           | password  |
| testuser@abcd.com  | testuser  |
| testuser1@abcd.com | testuser1 |

    @LoginNegativeTest
  Scenario Outline: User login with invalid credentials
    Given user visits the websites
    When user enter username "<username>" and password "<password>"
    Then user can't view the product page
    And browser closes
    Examples:
| username      | password       |
| abc@gmail.com | abcd@gmail.com |
| 123           | abc            |
|               |                |


