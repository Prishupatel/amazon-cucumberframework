Feature: Search laptop
  as a user I should search dell laptop with specific requirement

  @smoke

  Scenario: User should navigate to amazon.com
    Given I am on homepage
    And  I search "laptop"
    And I click  on "HP Pavilion 17.3-inch IPS FHD Laptop (2022 Model), Intel Core i5-1135G7 (Beats i7-1065G7), Intel Iris Xe Graphics, 64GB RAM, 1TB PCIe SSD, Backlit Keyboard, Long Battery Life, Webcam, Windows 11"
    And I changed the quantity "3"
    And I click on 'Add to cart' button
    Then Product added to cart successfully





