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

  Scenario: The bowling player is new but he was able to hit a spare
    Given I am new, but i was able to hit a spare
    When I played 17 rounds where i hit 0 pins. Then i hit 1 spare and hit 3 pin in the next roll
    Then the score should be 16 because i hit 1 spare and 3 pin in the next roll

  Scenario: The bowling player is average but he was able to hit a strike
    Given I am able to hit a strike
    When I hit 1 strike, then rolled 3 and 4 pins in the next 2 rolls. The last 16 rolls i hit 0 pins
    Then the score should be 24 because i hit a strike and 3 and 4 pins in the next 2 rolls