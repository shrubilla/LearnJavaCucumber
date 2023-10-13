Feature: Ebay login 


Scenario Outline: Verify Login flow of invalid flow 
Given User launched Ebay website
When Navigate to sign in page
And Enters valid username <UserName>
And Enters valid password <Password>
Then User should login sucessfully

Examples: 
|UserName|Password|
|shruthi.bk99@gmail.com|Shruthib@123|

