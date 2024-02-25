D287 Java Frameworks
Justice Gudorf
January 9, 2024

Part A. 
Cloned project to IDE

Part B. 
Created this GudorfReadMe.md file (as a readme.md file already existed, and I wasn't sure if I should
overwrite this file.)

Part C. 
Changed mainscreen.html to match a newly founded Build Your Own PC store (lines 14 and banner to match store lines 18-22) 


Part D. 
Added About Us page with information about the shop as well as a link to the main page (entirety of about.html).
I also then added a link to the About Us page using an anchor tag and some inline styling on mainscreen.html 
(lines 25-28).

Part E.
Added logic to check that part and product repositories are empty, and if so, add 5 Parts and 5 Products to BootStrapData.java.
This can be seen on lines 38-75. 

Part F. 
Added "Buy Now" button and functionality (mainscreen.html script lines 74-88 and button on 110) (MainScreenControllerr.java 
lines 59-74). Also added id values to each product constructor in BootStrapData. Commented out "Outsourced Part Form" in 
line 40 of mainscreen.html to simplify view and functionality for client. 

Part G.
Added min and max inventory values in Part.java (lines 31-34)., modified the constructor (line 42), 
added getters and setters (lines 90-104). Modified the sample inventory in BootStrapData.java (lines 38-75). 
Modified InhousePartForm.html on lines 26-31 and OutsourcedPartForm.html lines 27-31 to allow for minimum and maximum 
values to be entered on the form. Added method to determine if inventory is within valid range on lines 115-121 of Part.java. 
Renamed database to spring-boot-h2-gudorf and edited in application.properties on line 6. Finally, added isValid method
to Part.java (lines 115-121) to determine if inventory falls outside of the minimum and maximum values. This is then used 
in AddInhousePartController.java on lines 44-46.  

EDITS FOR BUY NOW BUTTON:
In Part F. Buy Now button was not correctly communicating with the rest of the program. Initially assumed this was due to 
a database artifact, but after Part G., it became clear there was a larger issue. I renamed the database spring-boot-h2-db102-gudorf 
After some investigation, it was clear that the functionality I had put in MainScreenControllerr.java should not be there. 
I then created a new controller calledProductController.java, and moved the functionality in there. This then created 
several other edits in mainscreen.html, as well as the creation of two new landing pages to tell the user if their purchase
was successful or an error. 

Part H. 
Added checkInventoryBounds() method to AddInhouseController.java to determine if a part's inventory value falls outside
of the acceptable range set by the minimum and maximum (lines 44-47, and lines 55-64). This method checks the part's 
inventory value, and assigns a value to a string if it is above or below the acceptable values. If the inventory is 
within the minimum and maximum, it assigns the string a value of null. The if logic checks if the value is null, and if
not, it displays the appropriate message. 

Part I.
Added tests for minimum and maximum values in PartTest.java which all returned as passed (lines 160-195).

Part J.
Remove unnecessary class files. 