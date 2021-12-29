Feature: Mobile search
  as a user I should search mobile

  @smoke1
  Scenario: User should navigate to amazon.com
    Given I am on homepage
    And  I search "mobile"
    And I click  on "SAMSUNG Galaxy S20 FE 5G Factory Unlocked Android Cell Phone 128GB US Version Smartphone Pro-Grade Camera 30X Space Zoom Night Mode, Cloud Mint Green"
    And I changed the quantity "2"
    And I click on 'Add to cart' button
    Then Product added to cart successfully