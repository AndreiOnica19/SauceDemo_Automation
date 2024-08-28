Feature: User Login

  Scenario: User Logs In With Valid Credentials
    Given user opens the browser and navigates to SauceDemo website
    When user inputs username and password
    And user clicks login button
    Then the products title is displayed on the page