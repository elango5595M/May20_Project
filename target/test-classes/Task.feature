Feature: Verify hotel booking in adactin. 
Scenario Outline: Verify hotel booking in Adactin for Adults for Adults and children 
	Given  User is on adactin login page 
	When User enters "<UserName>" and "<Password>" 
	And User click the login button 
	Then Search hotel page should be displayed 
	When User enters "<Location>",<Hotelname>","<Roomtype>","<Numberofrooms>","<Checkindate>","<Checkoutdate>","<Adultsroom>","<Childroom>"
	And user clicks the search button 
	Then select hotel page should be displayed 
	When user select the hotel thorugh radio button 
	And User click on continue button 
	Then The book detail sholud be displayed 
	When the user enter "<FirstName>","<LastName>","<Address>","<CardNum>","<CardType>","<ExpireNum>","<ExpireYear>","<Cvv>" 
	And User click the book now button 
	Then Booking conformation page shuld be displayed 
	Examples: 
 |UserName|Password|Location|Hotelname|Roomtype|Numberofrooms|Checkindate|Checkoutdate|Adultsroom|Childroom|FirstName|LastName|Address|CardNum|CardType|ExpireNum|ExpireYear|Cvv|
 |elango06996|8X4XO7|london|Hotel Creek|double|2|29-05-2022|04-06-2022|2|3|Elango|murugesan|chennai|12345695932|visa|may|2025|244|