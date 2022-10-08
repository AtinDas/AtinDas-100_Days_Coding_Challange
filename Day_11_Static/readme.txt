Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

Constraints
-100<=B<=100
-100<=H<=100

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3

Sample output 1

3

Sample input 2

-1
2

Sample output 2

java.lang.Exception: Breadth and height must be positive

Language
Java 8
3
6
7
8
10
11
12
13
14
15
16
17
18
19
20
21
23
24
26
27
28
4
5
9
22
25
29
30
Line: 30 Col: 3
Test against custom input
Java
You have earned 10.00 points!
You are now 2 points away from the 3rd star for your java badge.
93%78/80
Congratulations
You solved this challenge. Would you like to challenge your friends?
Next Challenge
Compiler Message

Success

Input (stdin)

    -9

    -8

Expected Output

    java.lang.Exception: Breadth and height must be positive

Hidden Test Case

Use print or log statements to debug why your hidden test cases are failing. Hidden test cases are used to evaluate if your code can handle different scenarios, including corner cases.

