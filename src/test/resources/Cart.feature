Feature:
  Scenario:
    Given user opens the browser and navigates to SauceDemo website
    When user inputs username and password
    And user clicks login button
    And user clicks add bike light to cart
    Then number of products appears on cart button badge