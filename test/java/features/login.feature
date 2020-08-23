Feature: ServiceNow AT 

#Background: 
#	Given launch browser 
#	And load url 
#	And maximize browser 
Scenario: Login into application (positive) 
	When enter user name as "admin"
	And enter password "Pass123$"
	When user clicks on login 
	Then login should success 
#	And close browser 
	
Scenario: Login into application (negtive) 
	When enter user name as "koushik"
	And enter password ""
	When user clicks on login 
	But login should fail 
#	And close browser