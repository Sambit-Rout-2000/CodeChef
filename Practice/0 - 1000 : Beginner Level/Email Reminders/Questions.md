# Email Reminders | Problem Code: EMAILREM


MoEngage helps the Chef send email reminders about rated contests to the participants.<br/>
There are a total of **_N_** participants on Chef’s platform, and **_U_** of them have told Chef not to send emails to them.<br/>
If so, how many participants should MoEngage send the contest emails to?<br/>

**Input Format**<br/>
> The first and only line of input will contain a single line containing two space-separated integers ***N*** (the total number of users) and ***U*** (the number of users who don't want to receive contest reminders).<br/>
##**Output Format**<br/>
Output in a single line, the number of users MoEngage has to send an email to.<br/>

###**Constraints**
**1 ≤ _U_ < _N_ ≤ 105**
###**Sample Input : 1**
####**100 7**
###**Sample Output : 1** 
####**93**

###**Explanation**
Out of 100 users, 7 do not want to receive reminders. Hence, MoEngage needs to send email to 93 users.

###**Solution**
####**_U_ - _N_ = _ans_**
####**_100_ - _7_ = _93_**

###**Sample Input : 2 **
####**4456 342**
###**Sample Output : 2 **
####**4114**

###**Explanation**
Out of 4456 users, 342 do not want to receive reminders. Hence MoEngage needs to send email to 4114 users.

###**Solution**
####**_U_ - _N_ = _ans_**
####**_4456_ - _342_ = _4114_**
