$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Division.feature");
formatter.feature({
  "line": 2,
  "name": "Division",
  "description": "",
  "id": "division",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Division"
    }
  ]
});
formatter.before({
  "duration": 115607,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify 3 / 0",
  "description": "",
  "id": "division;verify-3-/-0",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@DivideByZero"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I divide the number 3 by 0",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "division should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 20
    },
    {
      "val": "0",
      "offset": 25
    }
  ],
  "location": "ExampleWhen.divideTwoNumbers(String,String)"
});
formatter.result({
  "duration": 130467569,
  "status": "passed"
});
formatter.match({
  "location": "ExampleThen.failedOutput()"
});
formatter.result({
  "duration": 176699,
  "status": "passed"
});
formatter.after({
  "duration": 95800,
  "status": "passed"
});
formatter.before({
  "duration": 65391,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify 0 / 0",
  "description": "",
  "id": "division;verify-0-/-0",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@DivideByZero"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I divide the number 0 by 0",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "division should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 20
    },
    {
      "val": "0",
      "offset": 25
    }
  ],
  "location": "ExampleWhen.divideTwoNumbers(String,String)"
});
formatter.result({
  "duration": 330732,
  "status": "passed"
});
formatter.match({
  "location": "ExampleThen.failedOutput()"
});
formatter.result({
  "duration": 119718,
  "status": "passed"
});
formatter.after({
  "duration": 27560,
  "status": "passed"
});
});