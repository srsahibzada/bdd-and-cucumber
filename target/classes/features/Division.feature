@Division
Feature: Division
  @AnswerZero
  Scenario: Verify 10 / 1
    When I divide the number 10 by 1
    Then I receive output 10

  @DivideByZero
  Scenario: Verify 3 / 0
    When I divide the number 3 by 0
    Then division should fail


  Scenario: Verify 0 / 3
    When I divide the number 0 by 3
    Then I receive output 0

  @DivideByZero
  Scenario: Verify 0 / 0
    When I divide the number 0 by 0
    Then division should fail