Feature:  Admin login

Scenario: Admin Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters Credentials to LogIn
    | user1 | pwd1 |
    | user2 | pwd2 |
    | user3 | pwd3 |
    | teja  | pwdt |
    | user4 | pwd4 |
    | user5 | pwd5 |
    | user6 | pwd6 |
    | user7 | pwd7 |
    | user8 | pwd8 |
    | sunil | pwd9 |
    |pranil | pwd10 |
 Then Message displayed Login Successfully