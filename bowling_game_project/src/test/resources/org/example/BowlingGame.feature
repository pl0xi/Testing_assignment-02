Feature: Bowling game system
  The bowling game system is able to store and calculate the scores

  Scenario: The bowling player is very bad and he can't hit any pin in the game
    Given I am very bad, and can't hit a single pin doing the game
    When I played 20 rounds and i hit 0 pins in each round
    Then the score should be 0 because i didn't hit any pin

  Scenario: The bowling player is bad and he can only hit 1 pin in each round
    Given I am bad, but i was able to hit 1 pin in each round
    When I played 20 rounds and i was able to hit 1 pin in each round
    Then the score should be 20 because i hit 1 pin in each round