Feature: PhpTravels Customer Login
  I want to test PhpTravels customer login page

	@Login
  Scenario: Customer Login success scenario
    Given a customer username and password
    When I click the login button
    Then the customer should be navigate to dashboard
    
  @Login  
  Scenario: Customer Login invalid scenario
    Given a customer username and password
    When I click the login button
    Then the customer should not be navigate to dashboard