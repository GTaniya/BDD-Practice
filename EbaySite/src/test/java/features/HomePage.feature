Feature: Ebay WebPage Functionality check

  Background:
    Given I am on ebay homePage

    Scenario: Check Fashion Page
      When User click Electronics
      Then User should see "Electronics" in Electronics page





