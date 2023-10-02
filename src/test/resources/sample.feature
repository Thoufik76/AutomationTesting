Feature: To validate login functionality of Facebook application
Scenario: To validate login with valid username and invalid password
Given To launch the chrome browser and maximize the window
When To launch the url of the facebook application
And To pass valid username in username field
And To pass invalid password in password field
And To click login button
And To check whether navigate to homepage or not
Then To close the browser
