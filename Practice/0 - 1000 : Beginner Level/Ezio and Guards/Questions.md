# Ezio and Guards | Problem Code: MANIPULATE

Ezio can manipulate at most **_X_** number of guards with the apple of eden.<br/>

Given that there are **_Y_** number of guards, predict if he can safely manipulate all of them.<br/>

#### Input Format<br/>
- First line will contain **_T_**, number of test cases. Then the test cases follow.<br/>
- Each test case contains of a single line of input, two integers **_X_** and **_Y_**.<br/>

#### Output Format<br/>
- For each test case, print **YES** if it is possible for Ezio to manipulate all the guards. Otherwise, print **NO**.<br/>
- You may print each character of the string in uppercase or lowercase (for example, the strings **YeS**, **yEs**, **yes** and **YES** will all be treated as identical).<br/>

#### Constraints<br/>
- 1 ≤ **_T_** ≤ 100
- 1 ≤ **_X_,_Y_** ≤ 100<br/>

#### Sample Input : 1<br/>
3<br/>
5 7<br/>
6 6<br/>
9 1<br/>

#### Sample Output : 1<br/>
NO<br/>
YES<br/>
YES<br/>

#### Explanation<br/>
**Test Case 1:** Ezio can manipulate at most **5** guards. Since there are **7** guards, he cannot manipulate all of them.

**Test Case 2:** Ezio can manipulate at most **6** guards. Since there are **6** guards, he can manipulate all of them.

**Test Case 3:** Ezio can manipulate at most **9** guards. Since there is only **1** guard, he can manipulate the guard.

#### Solution<br/>
- if **_X_ >= _Y_** then **YES** <br/>
- if **_X_ < _Y_** then **NO** <br/>
<br/>
