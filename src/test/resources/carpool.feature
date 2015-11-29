Feature: Quick Post
  I want to post new ride so anyone going in same direction can join me

  Scenario: Valid Posting
    Given employee enter Name as "Naveen" and email id as "naveen.singh@leanpitch.com" and origin is "Parking" and dest is "Gurgaon" and phone is "9810547500"
    And run on browser "chrome"
    When click on "Submit"
    Then System should display a message "Posting is successful"

  Scenario: Name is missing
    Given employee enter Name as " " and email id as "naveen.singh@leanpitch.com" and origin is "Parking" and dest is "Gurgaon" and phone is "9810547500"
    When click on "Submit"
    Then System should display a message "Name is required"

  Scenario: Check email
    Given employee enter Name as "Naveen Singh" and email id as "naveen.singh#leanpitch.com" and origin is "Parking" and dest is "Gurgaon" and phone is "9810547500"
    When click on "Submit"
    Then System should display a message "Email is not valid"

    