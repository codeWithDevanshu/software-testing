@Test
Feature: login feature
  Scenario: login with valid details
    Given enter the url in the given browser
    When the the valid username "mngr446392" and password "AqUpusU" and click on the login button
    And login is successful.
    And Enter the url in the addCustomer page
    And Enter customer name "jay" and select the gender "male"
   And Select the Customer date of birth "29-09-1996"
    And fill up the address of customer "Dhamanga"
    And Enter customer city "amaravati"
    And Customer State is "Maharashtra"
    And Customer Area pin is "444709"
    And Customer Mobile Number is "123456678"
    And Customer Mail id is "devanshuraut90@gmail.com"
    And Click on submit button
    And customer information sumitted successful







