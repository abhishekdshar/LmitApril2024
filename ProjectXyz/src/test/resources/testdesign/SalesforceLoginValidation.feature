Feature: Login validation of Salesforce application

  @sc01 @lmti @alpha @login
  Scenario: login functionaity with valid combination
    When user enters the username "lmti" and password "abc"
    And user clicks on login button
    Then verfiy whether the user navigate to home page
    And verify the title


    @sc02 @lmti @alpha @login
  Scenario Outline: login functionaity with invalid combination
    When user enters the username "<UserName>" and password "<Password>"
    And user clicks on login button
    Then verfify the error message
  Examples:
    | UserName | Password |
    |lmti      |abc       |
    |apple     |tyu       |

     @excel
  Scenario: read Excel
    Given user enter the credi
