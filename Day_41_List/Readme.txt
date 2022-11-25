For this problem, we have

types of queries you can perform on a List:

    Insert 

at index

:

Insert
x y

Delete the element at index

    :

    Delete
    x

Given a list,
, of integers, perform

queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,
(the initial number of elements in ).
The second line contains space-separated integers describing .
The third line contains an integer, (the number of queries).
The

subsequent lines describe the queries, and each query is described over two lines:

    If the first line of a query contains the String Insert, then the second line contains two space separated integers 

, and the value must be inserted into at index
.
If the first line of a query contains the String Delete, then the second line contains index
, whose element must be deleted from

    .

Constraints



    Each element in is a 32-bit integer.

Output Format

Print the updated list

as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output

0 1 78 12 23

Explanation

Insert 23 at index .
Delete the element at index .
Having performed all queries, we print as a single line of space-separated integers.


Input (stdin)

    11

    27358 39344 71551 99795 97548 77891 28014 1546 24269 38550 23153

    10

    Insert

    3 15097

    Delete

    0

    Insert

    1 25282

    Insert

    7 13736

    Insert

    10 50299

    Delete

    11

    Insert

    5 13902

    Insert

    2 58695

    Insert{-truncated-}

Expected Output

    39344 25282 58695 71551 15097 99795 13902 97548 77891 44009 13736 1546 50299 38550 23153


Input (stdin)

    10

    48908 99556 51237 37007 96350 9826 11431 62869 50411 83719

    10

    Delete

    2

    Insert

    4 36173

    Insert

    6 79735

    Delete

    3

    Delete

    0

    Insert

    4 98904

    Delete

    9

    Insert

    2 2073

    Delete
    {-truncated-}

Expected Output

    37007 2073 36173 9826 98904 11431 62869 50411