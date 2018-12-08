Feature: Process of displaying the balance

  Scenario: Opening of Bank websites
    Given I am a Chrome user
    When I access HSBC bank website
    Then I see HSBC home page
