@Subtraction
Feature: Subtraction
  @AnswerZero
  Scenario: Verify 2-2
    When I subtract the number 2 from 2
    Then I receive output 0

  Scenario: Verify 3-2
    When I subtract the number 2 from 3
    Then I receive output 1

  Scenario: Verify 10-2
    When I subtract the number 2 from 10
    Then I receive output 8

  @AnswerZero
  Scenario: Verify 10-19
    When I subtract the number 10 from 10
    Then I receive output 0