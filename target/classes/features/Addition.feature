@Addition
Feature: Addition
  Scenario: Verify 2+2
    When I add the numbers 2 and 2
    Then I receive output 4

  Scenario: Verify 3+2
    When I add the numbers 3 and 2
    Then I receive output 5

  Scenario: Verify 4+4
    When I add the numbers 4 and 4
    Then I receive output 8

 @AnswerZero
  Scenario: Verify 0+0
    When I add the numbers 0 and 0
    Then I receive output 0
