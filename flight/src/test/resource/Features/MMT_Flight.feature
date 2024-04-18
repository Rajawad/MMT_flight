Feature: To test the flight functionality to book flight ticket

  Background: 
   Given User is on homepage
 
 #functional Testing
  	@Scenario1
  	Scenario Outline: To validate one way option with search button
    When User enter value in  "<From>" ,"<to>","<Departure>" and "<TravellerClass>"
    And click on search
    Then flights from source to destination

    Examples: 
      | From   | to        | Departure | TravellerClass |
      | Indore | Bengalore |        24 |              3 |


 #usability Testing
	  @Scenario2
		 Scenario Outline: To validate error message appear if we enter same value in from and to
		 When User enter value in  "<From>" and "<to>"
		 Then "<error>" message should be displayed
		
		  Examples: 
		    | From   | to        |
		    | Indore |Indore  |
		
 #functional Testing
	  @Scenario3
		Scenario Outline: To validate Homestays & villa option 
    When User enter value in  "<From>","<Departure>" ,"<return>", "<guest>","<price>"
    And click searchbutton to get result
    Then search result should appear

    Examples: 
      | From   | Departure |return| TravellerClass |Guest
      | Indore | 26 April 2024|     3 March2024  |       2 |
	 
 #functional Testing
	 @Scenario4
	 Scenario: To validate search functionality
    When User enter value in  from,to,return,guest,price
    And by clicking on search result appear
    And in searchbar user enters the near by location
    Then result according to  search should be visible
	
 #usability Testing
	 @Scenario5
	 Scenario: To validate invalid search functionality
	 When User enter the invalid input in searchbar 
	 Then error message should be displayed
	 
	 
 #functional Testing
	 @Scenario6
	 Scenario: To validate homeStayVilla option 
	 When User enter all the value 
	 And  get on landing page
	 And click on homestayVilla option
	 Then homepage should appear
	 
	 