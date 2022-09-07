# Movie API Stuff To Know

     @Component --> Managed Classes 
	// @Entity --> Spring that this is a table to be inserted into a database
	// @Reposistory --> Acts our data and through this we can trigger db queries
	// @Service --> Purely semantic, it is recommended to use when storing our business logic in classes 
	// @RestController --> Spring, this is our client facing end point 
	
What is a RestAPI

Client <----> Server 

1) Uniform Interface --> consistent access to the resources - CRUD (Create Read Update Delete) - through well established URL end points

2) Client - Server Decoupling --> Basically the API dont care who we're dealing with - The API should be accessible for anyone that wants to use it
								Without or With a Access Token (A way to authenicate a user to use the API -- Header).
								
3)Statelessness --> Neutral -- Storing any Server side logic. Not allowed to store server information.

4) Cacheability --> Client information can be stored --> Data we can store adverts --> NoSQL, use them for their info.

5) Layered Architect System --> Be layered, Business Logic will be in Logic related classes, Controller classes in controller related packages. etc.# TGW_Spring_Starter
