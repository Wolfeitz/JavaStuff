# JavaStuff
Springboot project with APIs

Authorization check



You will probably need to specify the Java JDK module to use in order to run it – you can either select JKD8 (may need to download it) or the one that comes prepackaged with IntelliJ.

That should be it.  Just press play.
When it runs, it will ask for a user name and password.  The user is ‘user’.
The password is generated when you click run and will display in the output window.
It is generated anew every time the project is run (a configuration setting that will be changed for prod)
 


It is set for port 8085 so just browse to http://localhost:8085/greeting

Greeting
http://localhost:8085/greeting?name=xxxxx

Do you have access for a given module? (even cid = yes)
http://localhost:8085/accessControl/hasAccess?cid=321322&perm=true&mod=myMod

Grant access to a module
http://localhost:8085/accessControl/grantAccess?mod=myMod&cid=6

Rescind access for a module
http://localhost:8085/accessControl/removeAccess?mod=myMod&cid=3453

List all access for a user
http://localhost:8085/accessControl/hasAccess/byUser?cid=3453

List all users having access to a module
http://localhost:8085/accessControl/hasAccess/byMod?mod=RobsMod
