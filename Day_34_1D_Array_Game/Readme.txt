Let's play a game on an array! You're standing at index of an -element array named . From some index (where

), you can perform one of the following moves:

    Move Backward: If cell 

exists and contains a , you can walk back to cell
.
Move Forward:

    If cell 

contains a zero, you can walk to cell
.
If cell
contains a zero, you can jump to cell
.
If you're standing in cell
or the value of

        , you can walk or jump off the end of the array and win the game.

In other words, you can move from index
to index , , or as long as the destination index is a cell containing a . If the destination index is greater than

, you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

    int leap: the size of the leap
    int game[n]: the array to traverse

Returns

    boolean: true if the game can be won, otherwise false

Input Format

The first line contains an integer,
, denoting the number of queries (i.e., function calls).
The

subsequent lines describe each query over two lines:

    The first line contains two space-separated integers describing the respective values of 

and
.
The second line contains
space-separated binary integers (i.e., zeroes and ones) describing the respective values of

    .

Constraints

It is guaranteed that the value of is always

    .

Sample Input

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output

YES
YES
NO
NO

Explanation

We perform the following

queries:

    For 

and , we can walk and/or jump to the end of the array because every cell contains a
. Because we can win, we return true.
For
and , we can walk to index and then jump
units to the end of the array. Because we can win, we return true.
For
and
, there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For
and , there is no way for us to get past the one at index . Because we cannot win, we return false.


Input (stdin)

    4

    5 3

    0 0 0 0 0

    6 5

    0 0 0 1 1 1

    6 3

    0 0 1 1 1 0

    3 1

    0 1 0

Expected Output

    YES

    YES

    NO

    NO


Input (stdin)

    5000

    48 22

    0 1 1 1 1 1 0 1 0 0 1 0 1 1 1 0 1 0 1 0 1 1 1 0 0 0 1 1 1 1 0 0 1 1 1 1 1 0 0 1 1 0 1 1 1 1 1 1

    46 27

    0 1 0 0 1 1 0 0 1 0 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 0 1 1 1 1 1 1 1 0 1 1 0 0 1 1 1 0

    4 2

    0 1 1 1

    22 8

    0 1 1 0 1 0 1 0 0 1 0 0 1 0 1 1 1 1 0 1 0 1

    68 3

    0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1 1 1 0 1 1 1 0 1 1 1 1 1 1 0 0 1 1 1 1 1 0 0 1 0 1 1 1 1 1 1 1 0 1 1 1 1 0 0 1 1 1 1 1 0 1 1 1 1 1

    18 14

    0 1 1 0 1 1 1 1 1 1 1 1 1 0 1 1 1 1

    36 9

    0 1 1 1 1 0 1 0 1 0 1 1 0 1 1 1 1 1 0 0 1 1 1 1 1 1 0 0 1 1 1 1 1 0 0 0

    79 8

    0 0 0 0 1 1 0 1 1 1 0 1 1 1 0 1 1 1 0 1 0 1 0 1 1 0 1 0 1 0 0 0 1 1 0 1 1 0 1 1 1 1 1 1 0 1 1 1 1 0 0 1 1 0 1 1 1 1 1 1 1 0 1 0 1 1 1 0 0 1 1 0 1 0 0 1 1 1 0

    14 9

    0 0 0 1 1 1 1 0 1 1 0 1 0 1

    13 9{-truncated-}

Expected Output

    NO

    NO

    NO

    NO

    NO

    NO

    YES

    NO

    YES

    YES

    NO

    NO

    NO

    NO

    NO

    NO

    NO

    NO

    NO

    NO{-truncated-}

Input (stdin)

    5000

    35 33

    0 0 1 1 1 1 1 1 0 1 1 1 1 0 1 0 1 1 0 1 1 1 0 1 0 1 0 1 0 0 1 1 1 1 0

    68 4

    0 1 1 0 1 1 1 1 1 1 1 0 1 1 0 1 1 1 1 0 0 0 0 1 1 0 1 0 1 1 0 1 0 1 0 1 1 0 0 1 0 1 1 1 1 1 0 1 0 1 1 1 1 1 1 1 1 0 1 1 0 0 0 1 0 1 0 1

    3 1

    0 0 1

    51 0

    0 1 1 0 0 0 1 1 0 1 1 0 0 1 1 1 1 1 1 1 1 1 0 1 1 0 0 1 1 1 0 0 0 1 0 1 1 0 1 1 1 1 1 0 1 1 1 0 1 1 0

    57 15

    0 0 0 1 1 1 1 0 0 0 0 1 0 1 1 1 0 1 1 0 1 0 1 0 0 1 1 1 0 1 0 0 0 0 0 1 0 0 1 0 1 1 0 1 1 1 1 1 1 0 1 0 1 0 1 1 1

    81 74

    0 1 0 1 0 1 1 1 0 1 0 0 0 1 1 1 1 0 1 0 1 0 1 1 1 0 1 1 0 1 0 1 1 1 0 1 0 0 1 0 0 1 1 1 1 1 0 0 1 1 0 1 0 1 0 0 1 0 1 1 1 0 0 1 1 0 1 0 1 0 1 1 0 0 1 1 1 1 1 1 1

    67 22

    0 0 1 1 1 1 1 1 1 1 1 1 0 1 0 1 1 1 0 1 1 1 1 0 0 0 0 0 1 0 1 0 1 0 1 0 1 0 1 1 1 1 1 1 0 1 1 0 0 1 1 1 0 1 0 1 1 1 0 1 1 0 1 0 1 1 0

    69 49

    0 0 0 0 1 1 0 0 0 1 1 0 1 0 0 0 1 0 0 1 1 0 0 1 1 1 0 0 1 1 1 1 1 1 1 0 1 0 1 1 0 1 1 1 1 0 1 1 0 1 0 0 1 1 1 0 0 0 1 0 1 1 1 0 1 0 1 0 0

    19 13

    0 1 1 0 0 1 0 0 0 1 0 1 0 1 1 0 0 1 0

    16 5{-truncated-}

Expected Output

    YES

    NO

    NO

    NO

    YES

    NO

    YES

    YES

    NO

    NO

    NO

    YES

    NO

    NO

    NO

    NO

    NO

    NO

    NO

    NO{-truncated-}