$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login in Kare - Health Project",
  "description": "",
  "id": "login-in-kare---health-project",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3305820416,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login into the application with valid credentials",
  "description": "",
  "id": "login-in-kare---health-project;login-into-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Login page URL \"http://karehealth.menpaniproducts.com/admin/auth/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter userName \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter Password  \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://karehealth.menpaniproducts.com/admin/auth/login",
      "offset": 28
    }
  ],
  "location": "Login.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 1417115542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    }
  ],
  "location": "Login.enter_userName(String)"
});
formatter.result({
  "duration": 216970000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 17
    }
  ],
  "location": "Login.enter_password(String)"
});
formatter.result({
  "duration": 86979750,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_Submit_Button()"
});
formatter.result({
  "duration": 1676495458,
  "status": "passed"
});
formatter.after({
  "duration": 48833,
  "status": "passed"
});
});