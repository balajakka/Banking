$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyBanking.feature");
formatter.feature({
  "line": 1,
  "name": "Process of displaying the balance",
  "description": "",
  "id": "process-of-displaying-the-balance",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Opening of Bank websites",
  "description": "",
  "id": "process-of-displaying-the-balance;opening-of-bank-websites",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am a Chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I access HSBC bank website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see HSBC home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyBankingStepDefinition.step1()"
});
formatter.result({
  "duration": 2702851214,
  "status": "passed"
});
formatter.match({
  "location": "MyBankingStepDefinition.step2()"
});formatter.result({
  "duration": 5046485231575,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinition.MyBankingStepDefinition.step2(MyBankingStepDefinition.java:21)\n\tat ✽.When I access HSBC bank website(MyBanking.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "MyBankingStepDefinition.ste3()"
});
formatter.result({
  "status": "skipped"
});
});