# The Cheaper Cab | Problem Code: CABS 

Chef has to travel to another place. For this, he can avail any one of two cab services.<br/>
- The first cab service charges **_X_** rupees.
- The second cab service charges **_Y_** rupees.
Chef wants to spend the **minimum** amount of money. Which cab service should Chef take?<br/>

#### Input Format<br/>
- The first line will contain **_T_** - the number of test cases. Then the test cases follow.<br/>
- The first and only line of each test case contains two integers **_X_** and **_Y_** - the prices of first and second cab services respectively.
#### Output Format<br/>
- For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.<br/><br/>
- You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).<br/>

#### Constraints<br/>
- **1 ≤ _T_ ≤ 100**
- **1 ≤ _X_,_Y_ ≤ 100**
#### Sample Input : 1<br/>
3<br/>
30 65<br/>
42 42<br/>
90 50<br/>
#### Sample Output : 1<br/>
FIRST<br/>
ANY<br/>
SECOND<br/>
#### Explanation<br/>
- **Test case 1:** The first cab service is cheaper than the second cab service.

- **Test case 2:** Both the cab services have the same price.

- **Test case 3:** The second cab service is cheaper than the first cab service.<br/>
#### Solution<br/>
- **Test case 1:** _X_ < _Y_ = _ans_<br/>
		   _30_- _65_ = _FIRST_<br/>
- **Test case 2:** _X_ = _Y_ = _ans_<br/>
		   _42_- _42_ = _ANY_<br/>
- **Test case 3:** _X_ > _Y_ = _ans_<br/>
		   _90_- _50_ = _SECOND_<br/>
