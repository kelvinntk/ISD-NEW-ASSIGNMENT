1. Database
- Put the Database location at: C:\Users\(PC Username)\AppData\Roaming\NetBeans\Derby
- OR depends on your Java Database location which can be check by clicking “Services” at the left panel. After that, under “Services” click into “Database” and right click on “Java DB”. Then, Select “Properties”.
- Insert SQL query to the database. Inside netbeans locate Services\Databases\Java DB and then right click it to create new database

Database Name	          : ISDFinal
Database Username	  : nbuser
Database Password	  : nbuser

After insert the database to netbeans, 
We ar using JPA, if any glassfish build errors pop out, please delete the original entity and then right click on the enity Class\new\entity class from database to insert new entity.
I can't assume that is no error when doing this process.

--------------------------------------------------------------------------------------------------------------------------------

2. How to use the program (The project must in C:, it depends where you install Glassfish)
Step 1	: Open the project in Netbeans. Project call "ISD Assignment"
Step 2	: Connect to the database name "ISDFinal"
Step 3	: Open home.jsp in Netbean.
Step 4	: Run home.jsp at Web Browser by clicking “Run Project” button at the top panel..
Step 5	: Enjoy and have fun :)

--------------------------------------------------------------------------------------------------------------------------------

3. Login/Register tutorials
On Student/staff/manager ID
STUD  = Student (Eg.STUD001)
STAFF = Staff	(Eg.STAFF001)
MNG   = Manager	(Eg.MNG001)

