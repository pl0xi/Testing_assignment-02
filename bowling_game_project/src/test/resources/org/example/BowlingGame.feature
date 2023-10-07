Feature: Bowling game system
  The bowling game system is able to store and calculate the scores

  Scenario: The bowling player is very bad and he can't hit any pin in the game
    Given I am very bad, and can't hit a single pin doing the game
    When I play the 20 round game and i hit 0 pins in each round
    Then the score should be 0
