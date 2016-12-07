$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hmt.feature");
formatter.feature({
  "line": 2,
  "name": "Testing Hotel Management Platform",
  "description": "",
  "id": "testing-hotel-management-platform",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@suite"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User wants to create an entry",
  "description": "",
  "id": "testing-hotel-management-platform;user-wants-to-create-an-entry",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I visit \"http://localhost:3003\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click \"Login\" link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I login to website",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be on \"Hotel Management Platform\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter following data in text fields:",
  "rows": [
    {
      "cells": [
        "field",
        "value"
      ],
      "line": 11
    },
    {
      "cells": [
        "hotelName",
        "aa"
      ],
      "line": 12
    },
    {
      "cells": [
        "address",
        "aa"
      ],
      "line": 13
    },
    {
      "cells": [
        "owner",
        "aa"
      ],
      "line": 14
    },
    {
      "cells": [
        "phone",
        "aa"
      ],
      "line": 15
    },
    {
      "cells": [
        "email",
        "aa"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on \"createHotel\" button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to delete(1) input hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should be entering multiple(5) values in page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:3003",
      "offset": 9
    }
  ],
  "location": "NavigationStepDefs.i_visit_page(String)"
});
formatter.result({
  "duration": 4208119199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 9
    }
  ],
  "location": "NavigationStepDefs.i_click_link(String)"
});
formatter.result({
  "duration": 92255278,
  "status": "passed"
});
formatter.match({
  "location": "NavigationStepDefs.i_login_to_website()"
});
formatter.result({
  "duration": 1179831265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Management Platform",
      "offset": 16
    }
  ],
  "location": "NavigationStepDefs.i_should_be_on_page(String)"
});
formatter.result({
  "duration": 435374472,
  "status": "passed"
});
formatter.match({
  "location": "NavigationStepDefs.i_enter_following_data_in_text_fields(DataTable)"
});
formatter.result({
  "duration": 259619335,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "createHotel",
      "offset": 12
    }
  ],
  "location": "NavigationStepDefs.i_click_on_button(String)"
});
formatter.result({
  "duration": 52778623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 27
    }
  ],
  "location": "NavigationStepDefs.i_should_be_able_to_delete_input_hotel(int)"
});
formatter.result({
  "duration": 1354796119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 30
    }
  ],
  "location": "NavigationStepDefs.i_should_be_entering_multiple_values_in_page(int)"
});
formatter.result({
  "duration": 2638346828,
  "status": "passed"
});
});