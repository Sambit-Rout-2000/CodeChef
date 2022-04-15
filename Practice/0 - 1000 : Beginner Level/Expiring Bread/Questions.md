# Expiring Bread | Problem Code: EXPIRY

Eikooc loves bread. She has **_N_** loaves of bread, all of which expire after exactly **_M_** days. She can eat upto **_K_** loaves of bread in a day. Can she eat all the loaves of bread before they expire?

### Input Format
- The first line contains a single integer **_T_** - the number of test cases. Then the test cases follow.
- Each test case consists of a single line containing three integers **_N_**, **_M_** and **_K_** - the number of loaves of bread Eikooc has, the number of days after which all the breads will expire and the number of loaves of bread Eikooc can eat in a day.

### Output Format
- For each test case, output Yes if it will be possible for Eikooc to eat all the loaves of bread before they expire. Otherwise output No.
- You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

### Constraints
**1 ≤ _T_ ≤ 1000**
**1 ≤ N, M, K ≤ 100**

### Sample Input 1 
3<br/>
100 100 1 <br/>
9 2 5 <br/>
19 6 3 <br/>

### Sample Output 1 
Yes<br/>
Yes<br/>
No<br/>

### Explanation
**Test case 1:** Eikooc can eat one loaf of bread per day for **100** days. Thus none of the bread expires.<br/>
<br/>
**Test case 2:** Eikooc can eat **5** loaves of the first day and **4** loaves on the second day. Thus none of the bread expires.<br/>
<br/>
**Test case 3:** There is no way Eikooc can consume all the loaves of bread before it expires.
