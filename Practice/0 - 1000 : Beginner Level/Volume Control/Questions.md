# Volume Control | Problem Code: VOLCONTROL


Chef is watching TV. The current volume of the TV is **_X_**. Pressing the volume up button of the TV remote increases the volume by **_1_** while pressing the volume down button decreases the volume by **_1_**. Chef wants to change the volume from **_X_** to **_Y_**. Find the minimum number of button presses required to do so.<br/>

#### Input Format
- The first line contains a single integer **T** - the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two integers **_X_** and **_Y_** - the initial volume and final volume of the TV.
#### Output Format
- For each test case, output the minimum number of times Chef has to press a button to change the volume from **_X_** to **_Y_**.

#### Constraints
- **1 ≤ _T_ ≤ 100**
- **1 ≤ _X,Y_ ≤ 100**

#### Sample Input 1 
2 <br/>
50 54 <br/>
12 10 <br/>
#### Sample Output 1 
4 <br/>
2 <br/>

### Explanation
**Test Case 1 :** Chef can press the volume up button **4** times to increase the volume from **50** to **54**.<br/>
**Test Case 2 :** Chef can press the volume down button **2** times to decrease the volume from **12** to **10**.

#### Solution <br/>

**If _X_ >= _Y_ then _X_ - _Y_ <br/>
else _Y_ > _X_ then _Y_ - _X_** <br/>

**Test Case 1 :**
- _Y_ - _X_ = _ans_<br/>
- _54_ - _50_ = _4_

**Test Case 2 :**
- _X_ - _Y_ = _ans_<br/>
- _12_ - _10_ = _2_
