Feature: To validate the login credentials

  Background: 
    Given As a user to open a application

  Scenario Outline: To validate the login page with invalid credentials
    When To click "login" button
    When To give input invalid "<username>" and "<password>"
    Then To validate the page navigate to the invalide login page

    Examples: 
      | username | password |
      | pattath  |    12456 |
      

    Examples: 
      | username | password |
      | cvbngh   |  7418520 |

  Scenario Outline: To create a new login account page
    When To click "createnew" button
    And Give "<gmail>""<firstname>""<lastname>""<password>" 
    Then To check weather the account created

    Examples: 
      | gmail               | firstname | lastname | password   |
      | RAmmm123@gmail.com    | ramkum  | kanta   | Ramaa@12345  |
      | RAmama123456@gmail.com | ramkumara | kanthana   | Kum@123456 |
