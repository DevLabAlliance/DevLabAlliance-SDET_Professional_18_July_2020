Feature: ServiceNow AT 

Background: 
	Given launch browser 
	And load url 
	And maximize browser 
@pos @reg
Scenario Outline: Login into application - positive
	When enter user name as "<username>" 
	And enter password "<password>" 
	When user clicks on login 
	Then login should success 
	And close browser 
	Examples: 
		|username|password|
		|admin|Pass123$|
		|koushik|pass|
		
@neg		
Scenario Outline: Login into application - negative
	When enter user name as "<username>" 
	And enter password "<password>" 
	When user clicks on login 
	Then login should success 
	And close browser 
	Examples: 
		|username|password|
		|admin|Pass123$|
		|koushik|pass|
		
				
@smoke		
Scenario Outline: Login into application - smoke
	When enter user name as "<username>" 
	And enter password "<password>" 
	When user clicks on login 
	Then login should success 
	And close browser 
	Examples: 
		|username|password|
		|admin|Pass123$|
		|koushik|pass|
@reg		
Scenario Outline: Login into application - reg
	When enter user name as "<username>" 
	And enter password "<password>" 
	When user clicks on login 
	Then login should success 
	And close browser 
	Examples: 
		|username|password|
		|admin|Pass123$|
		|koushik|pass|