Feature: StringUtility
  The functionality of the string utility is to reverse, capitalize, and lowercase text.

  Scenario: Reversing a text
    Given I want to reverse a text
    When I reverse "reverse this text" with the string utility
    Then the text is reversed and equals "txet siht esrever"

   Scenario: Capitalizing a text
    Given I want to capitalize a text
    When I capitalize "can you capitalize this text" with the string utility
    Then the text is capitalized and equals "CAN YOU CAPITALIZE THIS TEXT"

  Scenario: Lowercase a text
    Given I want to lowercase a text
    When I lowercase "i WaNt THIS text to be LoWerCASE" with the string utility
    Then the text is lowercase and equals "i want this text to be lowercase"
