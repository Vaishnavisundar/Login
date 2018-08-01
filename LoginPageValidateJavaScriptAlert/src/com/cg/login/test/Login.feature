Feature: Login Page 

Scenario: Login successfully with correct user name and password

Given The login page is opened 

When The user enters valid user name "vaishnavi"
And The user enters corresponding valid user's password "vaishu" 
And The submit button is clicked

Then User can login successfully



Scenario: Login failed using correct user name but incorrect password

Given The login page is opened 

When The user enters valid user name "vaishnavi"
And The user does not enter corresponding valid user's password "vvvv" 
And The submit button is clicked

Then User login failed


Scenario: Login failed using incorrect user name and password

Given The login page is opened 

When The user does not enter valid user name "vaish"
And The user does not enter corresponding valid user's password "vvvv" 
And The submit button is clicked

Then User login failed complelely