# Monthly Budget Problem Code: BUDGET_

Akshat has **X** rupees to spend in the current month. His daily expenditure is **Y** rupees, i.e., he spends Y rupees each day.

Given that the current month has 30 days, find out if Akshat has enough money to meet his daily expenditures for this month.

Input Format
The first line will contain T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X, Y - the amount of money Akshat has for the current month and his daily expenditure respectively.
Output Format
For each test case, output YES if Akshat has enough money to meet his daily expenditure for 30 days of the month, otherwise output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

#### Constraints<br/>
**1 ≤ _T_ ≤ 100**
**1 ≤ _X_, _Y_ ≤ 10^5**
#### Sample Input 1 <br/>
3<br/>
1000 10<br/>
250 50<br/>
1500 50<br/>
#### Sample Output 1 
YES
NO
YES
Explanation
**Test Case 1:** Akshat has **1000** rupees and he wants to spend **30 × 10 = 300** rupees in the entire month. Therefore, he has enough money for the entire month.

**Test Case 2:** Akshat has **250** rupees and he wants to spend **30 × 50 = 1500** rupees in the entire month. Therefore, he does not have enough money for the entire month.

**Test Case 3:** Akshat has **1500** rupees and he wants to spend **30 × 50 = 1500** rupees in the entire month. Therefore, he has enough money for the entire month
