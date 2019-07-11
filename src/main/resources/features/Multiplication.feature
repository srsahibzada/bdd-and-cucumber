@Multiplication
Feature: Multiplication
  @AnswerZero
  Scenario: Verify 2*2
    When I multiply the numbers 2 and 2
    Then I receive output 4

  Scenario: Verify 3*2
    When I multiply the numbers 3 and 2
    Then I receive output 6

  Scenario: Verify 10*0
    When I multiply the numbers 10 and 0
    Then I receive output 0

  Scenario: Verify 100*1
    When I multiply the numbers 100 and 1
    Then I receive output 100