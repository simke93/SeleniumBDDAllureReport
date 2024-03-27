Feature: General View

  Scenario: Validate user is able to view products without loggin in
    Given User navigates to the Online products page
    When User clicks on Formal shoes drop down
    Then User should be able to view the Products