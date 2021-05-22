Feature: Amazon webpage functionality check

  Background:
    Given User on Amazon Homepage

Scenario: User able to check crafts kits
    When User click Toys and games
    And  User click Art and Crafts
    And User click craft kits
    And User click Frees shipping check box
    Then Verify page header "Arts & Crafts Supplies" in craft kits page

  Scenario: User able to Sign In for Prime membership
    When User click Prime
    And User click Try Prime Button
    And User enter Email and Password
    And User click sign-In Button
    Then Verify page header "Sign-In" in signIn page

  Scenario Outline: User able to send keys to search bar
    When user click on search bar
    And user enter "<searchText>" in search bar
    And User should see "<expectedValue>" in search bar
    But I should not see "<notExpectedValue>" values in the search bar
    Then I verify "<expectedUrl>" as page url


    Examples:
      | searchText |expectedValue|notExpectedValue |expectedUrl              |
      |Books       |Books        |computers        |https://www.amazon.com/  |
      |Shoes       |Shoes        |Pizza            |https://www.amazon.com/  |
      |Tablets     |Tablets      |Burger           |https://www.amazon.com/  |
      |Bags        |Bags         |Milk             |https://www.amazon.com/  |


  Scenario Outline: User able to Select a book Categories
    When User click books
    And User select "<bookCategories>" from books page
    And User should see "<expectedHeader>" in each page
    Then User verify "<pageUrl>" in each page


    Examples:
      |bookCategories        |expectedHeader          |pageUrl                                                               |
      |Arts & Photography    |Arts & Photography Books|https://www.amazon.com/b/ref=gbpp_itr_m-3_01bf_Arts&Pho?node=1&ie=UTF8|
      |Biographies & Memoirs |Biographies & Memoirs   |https://www.amazon.com/b/ref=gbpp_itr_m-3_01bf_Biograph?node=2&ie=UTF8|
      |Business & Investing  |Business & Investing    |https://www.amazon.com/b/ref=gbpp_itr_m-3_01bf_Business?node=3&ie=UTF8|
      |Cookbooks, Food & Wine|Cookbooks, Food & Wine  |https://www.amazon.com/b/ref=gbpp_itr_m-3_01bf_Cookbook?node=6&ie=UTF8|


