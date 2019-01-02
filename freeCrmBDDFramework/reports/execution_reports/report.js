$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "# The objective of this project is to apply the different cucumber features"
    },
    {
      "line": 3,
      "value": "# Cucumber options"
    },
    {
      "line": 4,
      "value": "# Data driven testing"
    },
    {
      "line": 5,
      "value": "# Data tables"
    },
    {
      "line": 6,
      "value": "# Data driven with maps"
    },
    {
      "line": 7,
      "value": "# Tags"
    },
    {
      "line": 8,
      "value": "# Hooks"
    },
    {
      "line": 9,
      "value": "# Apply POM to the project"
    },
    {
      "line": 11,
      "value": "#The test suite is executed using smoke and sanity tags, the list of features is the following"
    },
    {
      "line": 12,
      "value": "#Each feature (except login) should contain as much scenarios as possible"
    },
    {
      "line": 13,
      "value": "# Login"
    },
    {
      "line": 14,
      "value": "# Logout"
    },
    {
      "line": 15,
      "value": "# Create contact"
    },
    {
      "line": 16,
      "value": "# Create deal"
    },
    {
      "line": 17,
      "value": "# Create task"
    },
    {
      "line": 18,
      "value": "# Create case"
    },
    {
      "line": 19,
      "value": "# Verify left panel links"
    },
    {
      "line": 20,
      "value": "# Search for deals, contact, case, task, email, docs, forms, report"
    }
  ],
  "line": 23,
  "name": "Login",
  "description": "I want to be able to loging to freecrm page",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 27,
  "name": "Title of your scenario",
  "description": "",
  "id": "login;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user is on crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user fills in the login credentials",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User clicks on login",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "The homepage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_on_crm_login_page()"
});
formatter.result({
  "duration": 11366033111,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_fills_in_the_login_credentials()"
});
formatter.result({
  "duration": 222207659,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login()"
});
formatter.result({
  "duration": 5205120643,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_homepage_is_displayed()"
});
formatter.result({
  "duration": 6097958,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_logged_in()"
});
formatter.result({
  "duration": 838106995,
  "status": "passed"
});
});