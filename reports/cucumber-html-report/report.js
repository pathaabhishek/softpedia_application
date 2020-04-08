$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Softpedia.feature");
formatter.feature({
  "line": 2,
  "name": "softpedia Website",
  "description": "",
  "id": "softpedia-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login in the softpedia Website",
  "description": "",
  "id": "softpedia-website;login-in-the-softpedia-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the softpedia website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Exit the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "softpedia-website;login-in-the-softpedia-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "softpedia-website;login-in-the-softpedia-website;;1"
    },
    {
      "cells": [
        "abhishek12052@gmail.com",
        "Abhi@1234"
      ],
      "line": 12,
      "id": "softpedia-website;login-in-the-softpedia-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login in the softpedia Website",
  "description": "",
  "id": "softpedia-website;login-in-the-softpedia-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_01"
    },
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the softpedia website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters\"abhishek12052@gmail.com\" and \"Abhi@1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Exit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Definition.launch_the_softpedia_website()"
});
formatter.result({
  "duration": 20744678900,
  "status": "passed"
});
formatter.match({
  "location": "Login_Definition.user_clicks_on_the_Login_button()"
});
formatter.result({
  "duration": 78127900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhishek12052@gmail.com",
      "offset": 12
    },
    {
      "val": "Abhi@1234",
      "offset": 42
    }
  ],
  "location": "Login_Definition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 1443229500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Definition.exit_the_browser()"
});
formatter.result({
  "duration": 1004532500,
  "status": "passed"
});
});