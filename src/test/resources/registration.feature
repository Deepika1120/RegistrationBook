Feature: User Registration
@Test1
  Scenario: Register a new user successfully
    Given I navigate to the registration page
    When I fill in the registration form with valid details
    And I submit the registration form
    Then I should see a success message