$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/training/features/BookHotel.feature");
formatter.feature({
  "line": 2,
  "name": "Book hotel Feature",
  "description": "",
  "id": "book-hotel-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run1"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "user logs in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "a user launches \"chrome,firefox\" and navigates to the Adactin web page \"http://adactinhotelapp.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user enters the \"entle123\" and \"Naledi146\" and clicks login",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome,firefox",
      "offset": 17
    },
    {
      "val": "http://adactinhotelapp.com",
      "offset": 72
    }
  ],
  "location": "StepDefs.a_user_launches_and_navigates_to_the_Adactin_web_page(String,String)"
});
formatter.result({
  "duration": 160215600,
  "error_message": "java.lang.NullPointerException\r\n\tat training.WebUtilities.webUtilities.initializeWebDriver(webUtilities.java:39)\r\n\tat training.stepdefinition.StepDefs.a_user_launches_and_navigates_to_the_Adactin_web_page(StepDefs.java:28)\r\n\tat ✽.Given a user launches \"chrome,firefox\" and navigates to the Adactin web page \"http://adactinhotelapp.com\"(src/test/java/training/features/BookHotel.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "entle123",
      "offset": 19
    },
    {
      "val": "Naledi146",
      "offset": 34
    }
  ],
  "location": "StepDefs.a_user_enters_the_and_and_clicks_login(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Successful booking of a hotel",
  "description": "",
  "id": "book-hotel-feature;successful-booking-of-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "a user populates fields in the search page and clicks continue",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "a user selects a hotel from the selection page and click continue",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "a user populates the book with valid data and clicks confirm",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "a order is generated and the booking is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "a user clicks logout",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "a user is successfully logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.a_user_populates_fields_in_the_search_page_and_clicks_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_user_selects_a_hotel_from_the_selection_page_and_click_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_user_populates_the_book_with_valid_data_and_clicks_confirm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_order_is_generated_and_the_booking_is_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_user_clicks_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_user_is_successfully_logged_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "user logs in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "a user launches \"chrome,firefox\" and navigates to the Adactin web page \"http://adactinhotelapp.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user enters the \"entle123\" and \"Naledi146\" and clicks login",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome,firefox",
      "offset": 17
    },
    {
      "val": "http://adactinhotelapp.com",
      "offset": 72
    }
  ],
  "location": "StepDefs.a_user_launches_and_navigates_to_the_Adactin_web_page(String,String)"
});
formatter.result({
  "duration": 188500,
  "error_message": "java.lang.NullPointerException\r\n\tat training.WebUtilities.webUtilities.initializeWebDriver(webUtilities.java:39)\r\n\tat training.stepdefinition.StepDefs.a_user_launches_and_navigates_to_the_Adactin_web_page(StepDefs.java:28)\r\n\tat ✽.Given a user launches \"chrome,firefox\" and navigates to the Adactin web page \"http://adactinhotelapp.com\"(src/test/java/training/features/BookHotel.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "entle123",
      "offset": 19
    },
    {
      "val": "Naledi146",
      "offset": 34
    }
  ],
  "location": "StepDefs.a_user_enters_the_and_and_clicks_login(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Delete an existing booking",
  "description": "",
  "id": "book-hotel-feature;delete-an-existing-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Clicks on Booked Itinerary",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enters order number   for a recently booked existing order and clicks on search",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "a booking record is displayed on the table,the user selects the booking radio button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "a user clicks on cancel selected",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "a confirm cancel popup message appears",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "a user clicks on ok",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "booking is successfully cancelled",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "a user clicks logout",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "a user is successfully logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.clicks_on_Booked_Itinerary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.entersOrderNumberForARecentlyBookedExistingOrderAndClicksOnSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.aBookingRecordIsDisplayedOnTheTableTheUserSelectsTheBookingRadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.aUserClicksOnCancelSelected()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.aConfirmCancelPopupMessageAppears()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.aUserClicksOnOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.bookingIsSuccessfullyCancelled()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_user_clicks_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.a_user_is_successfully_logged_out()"
});
formatter.result({
  "status": "skipped"
});
});