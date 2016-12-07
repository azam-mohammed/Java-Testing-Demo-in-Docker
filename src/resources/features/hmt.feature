@suite
Feature: Testing Hotel Management Platform


  Scenario: User wants to create an entry
    Given I visit "http://localhost:3003" page
    When I click "Login" link
    And I login to website
    Then I should be on "Hotel Management Platform" page
    And I enter following data in text fields:
      | field     | value |
      | hotelName | aa    |
      | address   | aa    |
      | owner     | aa    |
      | phone     | aa    |
      | email     | aa    |
    And I click on "createHotel" button
    Then I should be able to delete(1) input hotel
    And I should be entering multiple(5) values in page