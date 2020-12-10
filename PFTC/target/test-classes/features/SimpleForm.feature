Feature: As user I should be able to verify the simple forms functionality.



Scenario: verify single input field
Given user Navigate to Selenium Easy Home Page
When  user click on Input Form Drop Down
Then user click on Simple Form Demo Link
And user Enter Message on the Message Field
Then user click on show message button
Then user verify that message was displyed




Scenario: verify Two input field
Given user Navigate to Selenium Easy Home Page
When  user click on Input Form Drop Down
Then user click on Simple Form Demo Link
Then user enter value for a
And user enter value for b
Then user click on Get Total button
And user verify the result










