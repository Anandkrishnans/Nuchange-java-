			     READ ME AND USER GUIDELINES
				BY ANAND KRISHNAN S
			GOVERNMENT ENGINEERING COLLEGE PALAKKAD


	 Class called Urldatabase is created with public access specifier with features including storeurl,get,countand list.
	 Input is splitted into two tokens using split() and stored into string array command so command[0] will be the
	 commands and command[1] will be the url entered, between it is checked if input is empty then  user is prompted 
	 to enter input. Command length is checked, if greater than 1 then command[0] checked for appropriate commands
	 that is storeurl,get,count . If length is not greater than 1 then commands checked for exit or list . If exit 
	 while loop is continued.Here two hash maps are used one for storing url(key) and count and another for url(key)
	 and  unique short key which is created using  UUID from java class UUID which is imported in the program along with
	 the class for the hashmap.
	 		      
				
			   COMMANDS AND WHAT THEY DO
	
	
	1) storeurl 
		stores the url obtained to hashmap for url and count and also url and shortId

	2)get 
		returns the shortID and increments count of the url entered along with it.
	
	3)count
		returns the latest count of usage of url entered along with it.
	
	4)list
		returns a list of all urls entered and their latest counts
	
	5)exit 
		exits the program