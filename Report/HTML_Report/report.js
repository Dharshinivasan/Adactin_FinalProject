$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user Login The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-web-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;1"
    },
    {
      "cells": [
        "ddd",
        "678"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;2"
    },
    {
      "cells": [
        "hjy",
        "543"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;3"
    },
    {
      "cells": [
        "Murugadharshini",
        "dharshini15"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "user Login The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"ddd\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"678\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 2351962000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ddd",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 102057500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "678",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 72282300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 322728400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user Login The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"hjy\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"543\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 331229000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hjy",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 75279400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "543",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 78240400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 317257800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "user Login The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-web-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Murugadharshini\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"dharshini15\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 304195200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Murugadharshini",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 90847300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dharshini15",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 79189000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 641943600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "user Search The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Location From The Dropdown Field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Hotels  From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Room Type  From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Rooms  From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check In Date In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check Out Date In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Adults Per Room  From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Children Per Room  From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Search Button And Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 238273600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotels_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 184314900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 217554600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 227700600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_Date_Field()"
});
formatter.result({
  "duration": 70855700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_Date_Field()"
});
formatter.result({
  "duration": 74188300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 193926200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 170379100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 514577400,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "user Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Select The Hotel From the List",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On The Continue Button And Navigates To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_From_the_List()"
});
formatter.result({
  "duration": 64856300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_And_Navigates_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 475701400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "user Booking Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-booking-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter The \"Keerthi priya\" In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The \"Kuppu\" In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Billing Address In Last Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Credit Card No In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Credit Card Type  From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Expiry Month From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Expiry Year From The Dropdown Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click On The Book Now Button And Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Keerthi priya",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_First_Name_Field(String)"
});
formatter.result({
  "duration": 82557300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kuppu",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Last_Name_Field(String)"
});
formatter.result({
  "duration": 74069000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Last_Billing_Address_Field()"
});
formatter.result({
  "duration": 133241900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 78810300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 201760900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Expiry_Month_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 287181200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Expiry_Year_From_The_Dropdown_Field()"
});
formatter.result({
  "duration": 379491200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 74689400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 64853300,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "user Confirming The Hotel Booking",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirming-the-hotel-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click On The My Itinerary Button And Navigates To The Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_My_Itinerary_Button_And_Navigates_To_The_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 6443610700,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "user Logout",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "user Click On The Logout Button And Navigates To The Adactin Logged Out Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Logout_Button_And_Navigates_To_The_Adactin_Logged_Out_Page()"
});
formatter.result({
  "duration": 329950900,
  "status": "passed"
});
});