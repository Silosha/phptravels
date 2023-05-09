Feature: Left Side Bar Menu
  I want to automate the left-side menu that is working while clicking each menu item.

	@LeftMenuLinks
  Scenario: By auto clicking all the links to verify its functionalities
    Given open browser and navigate to "/login"
    And a "user@phptravels.com" and "demouser" are entered 
    When I click the login button
    Then the "dashboard" page should be rendered
    When I click left menu "My Bookings" link
    Then the "mybookings" page should be rendered
    When I click left menu "Add Funds" link
    Then the "addfunds" page should be rendered
    When I click left menu "My Profile" link
    Then the "myprofile" page should be rendered
    When I click left menu "Logout" link
    Then the "home" page should be rendered
    