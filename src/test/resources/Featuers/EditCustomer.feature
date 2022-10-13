@editCustomer
Feature: Edit Customer

  Scenario: Enter valid Customer id
    Given enter the URL into the browser
    When enter customer id "52325" and click submit button
    Then id Submitted