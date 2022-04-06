# Email Reminders | Problem Code : EMAILREM


MoEngage helps the Chef send email reminders about rated contests to the participants.<br/><br/>
There are a total of **_N_** participants on Chef’s platform, and **_U_** of them have told Chef not to send emails to them.<br/><br/>
If so, how many participants should MoEngage send the contest emails to?

## Input Format<br/>
- The first and only line of input will contain a single line containing two space-separated integers ***N*** (the total number of users) and ***U*** (the number of users who don't want to receive contest reminders).<br/>
## Output Format<br/>
- Output in a single line, the number of users MoEngage has to send an email to.<br/>

**Constraints**<br/>
- **1 ≤ _U_ < _N_ ≤ 105**<br/>
**Sample Input : 1**<br/>
**100 7**<br/>
**Sample Output : 1**<br/>
**93**<br/>

#**Explanation**<br/>
> Out of 100 users, 7 do not want to receive reminders. Hence, MoEngage needs to send email to 93 users.<br/>

**Solution**<br/>
> **_U_ - _N_ = _ans_**<br/>
> **_100_ - _7_ = _93_**<br/>

**Sample Input : 2 **<br/>
> **4456 342**<br/>
**Sample Output : 2 **<br/>
> **4114**<br/>

**Explanation**<br/>
> Out of 4456 users, 342 do not want to receive reminders. Hence MoEngage needs to send email to 4114 users.

**Solution**<br/>
**_U_ - _N_ = _ans_**<br/>
**_4456_ - _342_ = _4114_**<br/>
